package com.triphan.samples;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class PushMe extends Application
{
  @Override
  public void start(Stage stage)
  {
//    Create and configure a text field for user entry
    TextField pushMeTextField = new TextField();
    pushMeTextField.setMaxWidth(250);

//    Create and configure a label to display the output
    Label pushMeLabel = new Label();
    pushMeLabel.setTextFill(Color.RED);
    pushMeLabel.setFont(Font.font("Arial", 20));

//    Create and configure a button which will cause the text to be displayed
    Button pushMeButton = new Button();
    pushMeButton.setText("Type something in the box then push me");
//    pushMeButton.setOnAction(e -> pushMeLabel.setText("You entered: " + pushMeTextField.getText()));
    pushMeButton.setOnAction(e -> {
      pushMeLabel.setText("You entered: " + pushMeTextField.getText());
      pushMeTextField.setText("");
    });

//    Create and configure a VBox to hold our components
    VBox root = new VBox();
    root.setSpacing(10);
    root.setAlignment(Pos.CENTER);

//    Add the components to the VBox
    root.getChildren().addAll(pushMeTextField, pushMeButton, pushMeLabel);

//    Create a new scene
    Scene scene = new Scene(root, 350, 150);

//    Add the scene to the stage, then configure the stage and make it visible
    stage.setScene(scene);
    stage.setTitle("Push Me");
    stage.show();
  }

//  public static void main(String[] args)
//  {
//    launch(args);
//  }
}







































