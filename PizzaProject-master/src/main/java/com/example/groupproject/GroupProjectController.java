package com.example.groupproject;

import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

public class GroupProjectController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}