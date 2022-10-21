package com.example.Controllers;

import com.example.PizzaObject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ConfirmingOrdersController {
    private Parent root;
    private Stage stage;
    private  Scene scene;

    @FXML
    Label IDLabel;
    @FXML
    public void rightPizzaClicked(){

    }
    public void leftPizzaClicked(){

    }



    public void switchToReceiptPage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/DatabaseEdit.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void newPizzaButton(ArrayList<PizzaObject> pizzaList){

    }


}
