package com.triphan.samples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ChangingFace_2 extends Application
{

  @Override
  public void start(Stage stage)
  {
    Button smileButton = new Button("Smile");
    Button frownButton = new Button("Frown");
    HBox buttonBox = new HBox(10);
    buttonBox.setAlignment(Pos.CENTER);
    buttonBox.getChildren().addAll(smileButton, frownButton);

    Circle face = new Circle(125, 125, 80);
    face.setFill(Color.YELLOW);
    face.setStroke(Color.BLUE);

    Circle rightEye = new Circle(86, 100, 10);
    rightEye.setFill(Color.YELLOW);
    rightEye.setStroke(Color.BLUE);

    Circle leftEye = new Circle(162, 100, 10);
    leftEye.setFill(Color.YELLOW);
    leftEye.setStroke(Color.BLUE);

    Arc mouth = new Arc(125, 150, 45, 35, 0, -180);
    mouth.setFill(Color.YELLOW);
    mouth.setStroke(Color.BLUE);
    mouth.setType(ArcType.OPEN);

    Text caption = new Text(80, 240, "Changing Face 2");
    caption.setFill(Color.BLUE);
    caption.setFont(Font.font("Verdana", 15));

    Group group = new Group(face, leftEye, rightEye, mouth, caption);

    VBox root = new VBox(10);
    root.setAlignment(Pos.CENTER);
    root.getChildren().addAll(buttonBox, group);
    root.setBackground(Background.EMPTY);

    smileButton.setOnAction(e -> {
      mouth.setLength(-180);
      mouth.setStroke(Color.VIOLET);
    });

    frownButton.setOnAction(e -> mouth.setLength(180));

    Scene scene = new Scene(root, 250, 275, Color.YELLOW);
    stage.setScene(scene);
    stage.setTitle("Changing Face 2");
    stage.show();
  }

//  public static void main(String[] args)
//  {
//    launch(args);
//  }
}




























