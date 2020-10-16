package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("note.fxml"));
        root.getStylesheets().add(getClass().getResource("style.css").toExternalForm());
        primaryStage.setTitle("NoteIt");
        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setAlwaysOnTop(true);
        primaryStage.setResizable(false);
        Scene scene = new Scene(root);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
