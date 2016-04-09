/*
 * Main5.java
 * 
 * Copyright 2016 mike <mikeh@mikeh-OptiPlex-745>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
//from  w ww.j av  a 2 s. co  m
public class Main5 extends Application {
  @Override
  public void start(Stage stage) {
    HBox root = new HBox();
    Scene scene = new Scene(root, 300, 150);
    stage.setScene(scene);
    stage.setTitle("not working properly-Mike");

    ToggleGroup group = new ToggleGroup();
    RadioButton button1 = new RadioButton("select first");
    button1.setToggleGroup(group);

    RadioButton button2 = new RadioButton("select second");
    button2.setToggleGroup(group);
    
    RadioButton button3 = new RadioButton("select third");
    button3.setToggleGroup(group);   
    
    button1.setSelected(true);    
    root.getChildren().add(button1);
    root.getChildren().add(button2);
    root.getChildren().add(button3);
    
    scene.setRoot(root);
    stage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}

