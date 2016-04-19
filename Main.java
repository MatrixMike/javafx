/*
 * Main.java
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
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
//from   w w  w  .  j  a  v  a 2 s  .  co m
public class Main extends Application {

  @Override
  public void start(Stage primaryStage) {
    Button btn1 = new Button();
    btn1.setText("Say 'Hello World one'");
    
    Button btn2 = new Button();		// creating and adding btn2 seems to write on top 
    btn2.setText("Say 'Hello World two'");   // of btn
 /*   btn.setOnAction(new EventHandler<ActionEvent>() {

      @Override
      public void handle(ActionEvent event) {
        System.out.println("Hello World!");
      }
    });
 */
 
 // http://stackoverflow.com/questions/10028587/how-to-position-a-button-or-any-gui-element-in-javafx-scene
    StackPane root = new StackPane();
/*    btn1.setLayoutX(250);
    btn1.setLayoutY(220);
    btn2.setLayoutX(150);
    btn2.setLayoutY(120);
  */  
    btn1.setTranslateX(30);
    btn1.setTranslateY(30);
    root.getChildren().add(btn1);
    root.getChildren().add(btn2);
    
    Scene scene = new Scene(root, 300, 250);

    primaryStage.setTitle("Hello World!");
    primaryStage.setScene(scene);
    primaryStage.show();
  }

  public static void main(String[] args) {
    launch(args);
  }
}
