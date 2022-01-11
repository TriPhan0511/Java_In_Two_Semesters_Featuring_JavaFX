package com.triphan.samples;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

public class SomeMore2DShapes extends Application
{
  @Override
  public void start(Stage stage)
  {
    Rectangle rectangle = new Rectangle(50, 50, 50, 100);
    rectangle.setFill(Color.WHITESMOKE);
    rectangle.setStroke(Color.BLUE);

    Line line = new Line(50, 180, 80, 250);
    line.setFill(Color.GREEN);
    line.setStroke(Color.GREEN);



    Group root = new Group(rectangle, line);

    Scene scene = new Scene(root, 500, 500, Color.WHITESMOKE);
    stage.setScene(scene);
    stage.setTitle("Some More 2D Shapes");
    stage.show();
  }

//  public static void main(String[] args)
//  {
//    launch(args);
//  }
}
