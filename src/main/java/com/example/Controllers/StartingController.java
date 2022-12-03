package com.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Node;

import java.io.IOException;

public class StartingController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    public void switchToCustomerView(ActionEvent event) throws IOException {

        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/CustomerView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToMan(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/FXMLfiles/ManagerView.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


}