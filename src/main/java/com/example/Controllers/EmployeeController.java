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

    public void checkIfInt(){

    }
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch(NumberFormatException e) {
            return false;
        } catch(NullPointerException e) {
            return false;
        }
        // only got here if we didn't return false
        return true;
    }

    public void testUsernamePassword(){

        if(isInteger((IDTextField.getText()))==true){
            warningLabel.setText("");
            String databaseURL ="jdbc:ucanaccess://C:/Users/Glenn Gerdes/IdeaProjects/PizzaProject/SWE Project.accdb";
            //gets the employeeID and password from database
            try (Connection connection = DriverManager.getConnection(databaseURL)) {
                PreparedStatement myStatement;
                String SQLQuery="SELECT * FROM EmployeeCredentials WHERE EmployeeID = ? AND Password = ?";
                myStatement = connection.prepareStatement(SQLQuery);
                myStatement.setInt(1,Integer.parseInt(IDTextField.getText()));
                myStatement.setString(2, passwordTextField.getText());
                ResultSet myRS = myStatement.executeQuery();
                if(myRS.next()){
                    String EmpID = myRS.getString("EmployeeID");
                    String EmpPassword = myRS.getString("Password");
                    //checks the textFields to see if ID and pass match
                    if(IDTextField.getText().equals(EmpID) && passwordTextField.getText().equals(EmpPassword)){
                        warningLabel.setText("CONGRATS");
                    }else{
                        warningLabel.setText("Username/Password is incorrect");
                    }
                }else{
                    warningLabel.setText("Username/Password is incorrect");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }else{
            warningLabel.setText("Employee ID must be a number");
        }





    }

}
