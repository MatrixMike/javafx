/*
 * Main4.java
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
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.stage.Stage;
//from   ww  w .  j  a  va  2 s  . c  o m
public class Main4 extends Application {
  @Override
  public void start(Stage primaryStage) {
    primaryStage.setTitle("Drawing Lines");

    Group root = new Group();
    Scene scene = new Scene(root, 300, 150, Color.GRAY);

    Line redLine = new Line(10, 10, 200, 10);

    redLine.setStroke(Color.RED);
    redLine.setStrokeWidth(10);
    redLine.setStrokeLineCap(StrokeLineCap.BUTT);

    redLine.getStrokeDashArray().addAll(15d, 5d, 15d, 15d, 20d);
    redLine.setStrokeDashOffset(10);

    root.getChildren().add(redLine);

    primaryStage.setScene(scene);
    primaryStage.show();
  }
  public static void main(String[] args) {
    launch(args);
  }
}

