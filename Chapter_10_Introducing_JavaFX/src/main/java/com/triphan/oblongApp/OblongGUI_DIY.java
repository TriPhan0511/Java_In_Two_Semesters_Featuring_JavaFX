package com.triphan.oblongApp;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class OblongGUI_DIY extends Application
{
  @Override
  public void start(Stage stage)
  {
    Label lengthLabel = new Label("Length");
    lengthLabel.setTextFill(Color.RED);
    lengthLabel.setFont(Font.font("Arial", 20));
    TextField lengthTextField = new TextField();
    lengthTextField.setMaxWidth(100);

    Label heightLabel = new Label("Height");
    heightLabel.setTextFill(Color.RED);
    heightLabel.setFont(Font.font("Arial", 20));
    TextField heightTextField = new TextField();
    heightTextField.setMaxWidth(100);

    HBox hBox = new HBox(20);
    hBox.setAlignment(Pos.CENTER);
    hBox.getChildren().addAll(lengthLabel, lengthTextField, heightLabel, heightTextField);

    Button calculateButton = new Button("Calculate");

    TextArea resultTextArea = new TextArea();
    resultTextArea.setMaxWidth(250);
    resultTextArea.setPrefHeight(2);

    Label errorMessageLabel = new Label();
    errorMessageLabel.setTextFill(Color.RED);
    errorMessageLabel.setFont(Font.font("Monospace", 20));

    VBox root = new VBox(20);
    root.setAlignment(Pos.CENTER);
    root.getChildren().addAll(hBox, calculateButton, resultTextArea, errorMessageLabel);

    calculateButton.setOnAction(e -> {
      double length, height;
      try
      {
        length = Double.parseDouble(lengthTextField.getText());
        height = Double.parseDouble(heightTextField.getText());
        Oblong oblong = new Oblong(length, height);
        StringBuilder builder = new StringBuilder();
        builder.append("The area is: ");
        builder.append(oblong.calculateArea());
        builder.append("\n");
        builder.append("The perimeter is: ");
        builder.append(oblong.calculatePerimeter());
        resultTextArea.setText(builder.toString());

        errorMessageLabel.setText("");
      } catch (NumberFormatException exception)
      {
        errorMessageLabel.setText("Invalid length or height.");
      }

    });


    Scene scene = new Scene(root, 500, 300);
    stage.setScene(scene);
    stage.setTitle("Oblong GUI (Do It Yourself)");
    stage.show();
  }

//  public static void main(String[] args)
//  {
//    launch(args);
//  }
}



























