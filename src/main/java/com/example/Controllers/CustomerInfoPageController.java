package com.example.Controllers;

import com.example.DeliveryInfoObject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class CustomerInfoPageController {
    @FXML
    TextField nameTextField;
    @FXML
    TextField addressTextField;
    @FXML
    TextField deliveryTextFeild;
    @FXML
    RadioButton deliveryTypeD;
    @FXML
    RadioButton deliveryTypeP;
    @FXML
    Button continueButton;
    @FXML
    Label IDLabel;
    @FXML
    Label warningLabel;

    Parent root;

    Scene scene;
    String address;

    String deliveryInfo;
    String deliveryType;

    Stage stage;

    String customerAddress;



    public void setDelp(){
        deliveryTypeP.setSelected(true);
        deliveryTypeD.setSelected(false);
        deliveryType="Pickup";
        addressTextField.setVisible(false);
    }
    public void setDeld(){
        deliveryTypeD.setSelected(true);
        deliveryTypeP.setSelected(false);
        deliveryType="Delivery";
        addressTextField.setVisible(true);
    }

    public Boolean checkButtons(){
        if(deliveryType==null){
            warningLabel.setText("please select a delivery type");
            return false;
        }else if(addressTextField.getText()==null && deliveryTypeD.isSelected() ==true){
            warningLabel.setText("please enter an address");
            return false;
        }
        // we only get here if the relevant info is filled in, otherwise change the warning lable and dont go further
        return true;
    }

    public void saveCustomerDetails() throws IOException{

        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/CustomerView.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();




        if(checkButtons() == false){
            return;
        }

        //sets userdata to the info from customerLoginController's stage.setUserData
        String userData = (String) stage.getUserData();
        String[] arr = userData.split("-");
        System.out.println(userData);
        if(arr.length == 3){
            customerAddress= arr[2];
        }else{
            customerAddress ="";
        }



        String customerUsername = arr[0];
        String customerPassword = arr[1];
        System.out.println("user: "+customerUsername);
        System.out.println("pass: "+customerPassword);
        System.out.println("add: "+customerAddress);


        String databaseURL ="jdbc:ucanaccess://C:/Users/hitsf/IdeaProjects/GroupProject/PizzaProject.accdb";
        //gets the username and password from database

        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement addAddStatement;
            String SQLUpdate = "UPDATE CUSTOMER SET Address = ? WHERE Username = ? AND Password = ?";
            addAddStatement = connection.prepareStatement(SQLUpdate);
            // makes the new customer address the same as the old address if they leave the addressTextField blank
            if(addressTextField.getText()==null || addressTextField.getText()=="" || addressTextField.getText().trim().isEmpty()){
                System.out.println("add: "+customerAddress);
                System.out.println("add text:"+addressTextField.getText());
                addAddStatement.setString(1,customerAddress);
                System.out.println("addAfter: "+customerAddress);
            }else{

                addAddStatement.setString(1, addressTextField.getText());
            }


            //sets variables to the corresponding ones passed from the database, from CustomerLoginController

            addAddStatement.setString(2,customerUsername);
            addAddStatement.setString(3,customerPassword);
            addAddStatement.executeUpdate();
            address=addressTextField.getText();
            deliveryInfo=deliveryTextFeild.getText();

            DeliveryInfoObject customerInfo = new DeliveryInfoObject(address, deliveryInfo, deliveryType);

            stage.setUserData(customerInfo);

            switchToOrderView1();

        }catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public void switchToOrderView1() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/OrderView1.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





}
