package com.example.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;

public class AccountCreationController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    Button submitButton;
    @FXML
    Button CancelButton;
    @FXML
    Label IDLabel;
    @FXML
    TextField userTextField;
    @FXML
    TextField passwordTextField;
    @FXML
    Label employeeLoginLabel;
    @FXML
    Label passwordLabel;
    @FXML
    Label warningLabel;
    @FXML
    TextField fNameTextField;
    @FXML
    TextField lNameTextField;
    @FXML
    TextField phoneTextField;


    public void switchToCustomerInfo() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/CustomerInfoPage.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void saveDetails() throws IOException{
        String databaseURL ="jdbc:ucanaccess://C:/Users/hitsf/IdeaProjects/GroupProject/PizzaProject.accdb";
        //gets the employeeID and password from database
        warningLabel.setText("Username/Password is incorrect");
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement myStatement;
            String SQLQuery="SELECT * FROM CUSTOMER WHERE Phone = ?";
            myStatement = connection.prepareStatement(SQLQuery);
            myStatement.setString(1,phoneTextField.getText());
            ResultSet myRS = myStatement.executeQuery();

            if(myRS.next()){
                //if the query has any data then there is already a record with this phone#
                warningLabel.setText("This customer already has an account!");


            }else{
                PreparedStatement addCustomerStatement;
                String SQLAddRow="INSERT INTO CUSTOMER (FirstName, LastName, Address, Phone, Username, Password, JoinedDate) VALUES (?, ?, ?, ?, ?, ?, ?)";
                addCustomerStatement = connection.prepareStatement(SQLAddRow);
                addCustomerStatement.setString(1,fNameTextField.getText());
                addCustomerStatement.setString(2,lNameTextField.getText());
                addCustomerStatement.setString(3,null);
                addCustomerStatement.setString(4,phoneTextField.getText());
                addCustomerStatement.setString(5,userTextField.getText());
                addCustomerStatement.setString(6,passwordTextField.getText());
                long millis=System.currentTimeMillis();
                Date date = new Date(millis);
                addCustomerStatement.setDate(7,date);
                addCustomerStatement.executeUpdate();
                // test case is 'John' 'Smith' '' '(111) 222-3333' 'jSmith' '1234' (date variable) ------- #2 in CUSTOMER database
                switchToCustomerInfo();

            }


        } catch (SQLException e) {
            e.printStackTrace();
        }


    }



}
