/*
 * MyApp.java
 * https://docs.oracle.com/javase/8/javafx/api/javafx/application/Application.html
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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;

public class MyApp extends Application {
    public void start(Stage stage) {
		int cx1,cy1,cx2,cy2;
		cx1=40; cy1=40;
		cx2=200;cy2=250;
		
        Circle circ1 = new Circle(cx1, cy1, 30);
        Circle circ2 = new Circle(cx2, cy2, 30);  // xy location and radius
        Circle circ3 = new Circle((cx1+cx2)/2, (cy1+cy2)/2, 30);  // xy location and radius
        Group root = new Group(circ1);
 //       Scene scene = new Scene(root, 400, 300);
        Scene scene = new Scene(root, 300, 250, Color.RED);  // creates RED background
        int x = 100;
        int y = 100;
        
        int red = 30;
        int green = 240;
        int blue = 250;
        Text text = new Text(x, y, "JavaFX 2.0");

        text.setFill(Color.rgb(red, green, blue, .99));
        text.setRotate(60);
        
        root.getChildren().add(text);
        root.getChildren().add(circ2);  
        root.getChildren().add(circ3);  
 //     root.getChildren().add(circ1);        // if we try to add circ1 -> compile fails      
        stage.setTitle("My JavaFX Application");
        stage.setScene(scene);
        stage.show();
    }
}

