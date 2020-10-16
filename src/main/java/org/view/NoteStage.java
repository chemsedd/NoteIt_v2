package org.view;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class NoteStage extends Stage {

    public NoteStage() throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("../openjfx/note.fxml"));
        root.getStylesheets().add(getClass().getResource("../openjfx/style.css").toExternalForm());
        this.setTitle("NoteIt");
        this.initStyle(StageStyle.DECORATED);
        this.setAlwaysOnTop(true);
        this.setResizable(false);
        Scene scene = new Scene(root);
        this.setScene(scene);
        this.show();
    }
}