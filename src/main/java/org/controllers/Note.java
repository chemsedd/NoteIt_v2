package org.controllers;

import com.jfoenix.controls.JFXTextArea;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import org.view.NoteStage;

public class Note implements Initializable {
    @FXML
    JFXTextField title;
    @FXML
    JFXTextArea content;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }

    /**
     * Create new note window.
     *
     * @throws IOException
     */
    @FXML
    void newNote() throws IOException {
        NoteStage noteStage = new NoteStage();
    }

    /**
     *
     */
    @FXML
    void saveNote() {
        System.out.println("Title:" + title.getText());
        System.out.println("Content:" + content.getText());
    }


    /**
     * Clears Title and Content fields.
     */
    @FXML
    void clearNote() {
        title.clear();
        content.clear();
    }

    /**
     * Exit app.
     * Close all notes
     */
    @FXML
    void closeNote() {
        System.exit(0);
    }
}
