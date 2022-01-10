module com.example.javafx_demo2 {
  requires javafx.controls;
  requires javafx.fxml;


  opens com.example.javafx_demo2 to javafx.fxml;
  exports com.example.javafx_demo2;
}