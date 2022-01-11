module com.example.chapter_10_introducing_javafx {
  requires javafx.controls;
  requires javafx.fxml;

  requires org.controlsfx.controls;
  requires com.dlsc.formsfx;
  requires org.kordamp.bootstrapfx.core;

  opens com.example.chapter_10_introducing_javafx to javafx.fxml;
  exports com.example.chapter_10_introducing_javafx;

  exports com.triphan.samples;
  exports com.triphan.oblongApp;

}