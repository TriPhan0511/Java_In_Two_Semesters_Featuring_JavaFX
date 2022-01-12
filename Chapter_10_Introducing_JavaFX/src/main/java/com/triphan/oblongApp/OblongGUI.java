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

public class OblongGUI extends Application
{
  //  Create an object of the Oblong class as an attribute
  private Oblong testOblong = new Oblong(0.0, 0.0);

  @Override
  public void start(Stage stage)
  {
//    Create and configure text fields for input
    TextField lengthField = new TextField();
    lengthField.setMaxWidth(50);

    TextField heightField = new TextField();
    heightField.setMaxWidth(50);

//  Create and configure non-editable text area for display the result
    TextArea display = new TextArea();
    display.setEditable(false);
    display.setMinSize(210, 50);
    display.setMaxSize(210, 50);

//    Create and configure labels for the text fields
    Label lengthLabel = new Label("Length");
    lengthLabel.setTextFill(Color.RED);
    lengthLabel.setFont(Font.font("Arial", 20));

    Label heightLabel = new Label("Height");
    heightLabel.setTextFill(Color.RED);
    heightLabel.setFont(Font.font("Arial", 20));

//    Create and configure a button to perform the calculations
    Button calculateButton = new Button("Calculate");

    calculateButton.setOnAction(e ->
    {
//      Check that the fields are not empty
      if (lengthField.getText().isEmpty() || heightField.getText().isEmpty())
      {
        display.setText("Length and height must be entered.");
      }
      else
      {
        testOblong.setLength(Double.parseDouble(lengthField.getText()));
        testOblong.setHeight(Double.parseDouble(heightField.getText()));
//      Use the methods of Oblong to calculate the area and perimeter
        display.setText("The area is: "
            + testOblong.calculateArea()
            + "\n"
            + "The perimeter is: "
            + testOblong.calculatePerimeter());
      }
    });

//    Create and configure an HBox for the labels and text inputs
    HBox inputComponents = new HBox(10);
    inputComponents.setAlignment(Pos.CENTER);
    inputComponents.getChildren().addAll(lengthLabel, lengthField, heightLabel, heightField);

//    Create and configure a vertical container to hold all the components
    VBox root = new VBox(10);
    root.setAlignment(Pos.CENTER);
    root.getChildren().addAll(inputComponents, calculateButton, display);

//    Create a new scene and add it to the stage
    Scene scene = new Scene(root, 350, 250);
    stage.setScene(scene);
    stage.setTitle("Oblong GUI");
    stage.show();
  }

  public static void main(String[] args)
  {
    launch(args);
  }
}



























