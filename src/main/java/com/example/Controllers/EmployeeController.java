package com.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.sql.*;
import java.io.IOException;

public class EmployeeController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField IDTextField;
    @FXML
    TextField passwordTextField;
    @FXML
    Label employeeLoginLabel;
    @FXML
    Label IDLabel;
    @FXML
    Label passwordLabel;
    @FXML
    Label warningLabel;
    public void switchToCustomerInfo(ActionEvent event) throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/CustomerInfoPage.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void testUsernamePassword(){
        String databaseURL ="PizzaProject/SWE Project.accdb";
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement myStatement;
            String SQLQuery="SELECT * FROM EmployeeCredentials WHERE EmployeeID = ? AND Password = ?";
            myStatement = connection.prepareStatement(SQLQuery);
            myStatement.setString(1,IDTextField.getText());
            myStatement.setString(2, passwordTextField.getText());
            ResultSet myRS = myStatement.executeQuery();
            String EmpID = myRS.getString("EmployeeID");
            String EmpPassword = myRS.getString("Password");






        } catch (SQLException e) {
        e.printStackTrace();
    }



        if(employeeLoginLabel.getText().equals("")){
            warningLabel.setText("testSuccessful");
        }else{
            warningLabel.setText("Username/Password is incorrect");
        }
    }

}
