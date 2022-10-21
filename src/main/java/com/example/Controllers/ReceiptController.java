package com.example.Controllers;

import com.example.DrinkObject;
import com.example.PizzaObject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class ReceiptController {
    private String paymentType;
    private String cardNumber;
    private String expirationDate;
    private String cvv;
    private String nameOnCard;
    private String zipCode;
    private String cashAmount;
    private String changeDue;
    private String routingAddress;
    private String accountNumber;
    private String checkNumber;
    @FXML
    RadioButton paymentTypeButton;
    @FXML
    TextField cashTextField;
    @FXML
    TextField cardTextField;
    @FXML
    TextField expDateTextField;
    @FXML
    TextField cvvTextField;
    @FXML
    TextField nameOnCardTextField;
    @FXML
    TextField zipTextField;
    @FXML
    TextField routingAddTextField;
    @FXML
    TextField accNumTextField;
    @FXML
    TextField checkNumTextField;
    private Stage stage;
    private Parent root;
    private Scene scene;
    @FXML
    Label IDLabel;
    public void switchToCardInfo() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/DatabaseEdit.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCashInfo() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/DatabaseEdit.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCheckInfo() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/DatabaseEdit.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToReceiptPage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/DatabaseEdit.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





    public void printReceipt(ArrayList<DrinkObject> drinkArray, ArrayList<PizzaObject> pizzaArray){
        System.out.println("your total: ");
        if(paymentType.equals("Cash")){

        }else if(paymentType.equals("Card")){

        } else if(paymentType.equals("Check")){

        }
    }






}
