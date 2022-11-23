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

public class CustomerLoginController {

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField usernameTextField;
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
    public void switchToCustomerInfo() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/CustomerInfoPage.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToAccountCreation() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/accountCreation.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
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

    public void testUsernamePassword() throws IOException{



            String databaseURL ="jdbc:ucanaccess://C:/Users/hitsf/IdeaProjects/GroupProject/PizzaProject.accdb";
            //gets the employeeID and password from database
            try (Connection connection = DriverManager.getConnection(databaseURL)) {
                PreparedStatement myStatement;
                String SQLQuery="SELECT * FROM CUSTOMER WHERE Username = ? AND Password = ?";
                myStatement = connection.prepareStatement(SQLQuery);
                myStatement.setString(1,usernameTextField.getText());
                myStatement.setString(2, passwordTextField.getText());
                ResultSet myRS = myStatement.executeQuery();
                if(myRS.next()){
                    String EmpID = myRS.getString("Username");
                    String EmpPassword = myRS.getString("Password");
                    //checks the textFields to see if ID and pass match
                    if(usernameTextField.getText().equals(EmpID) && passwordTextField.getText().equals(EmpPassword)){
                        String userData= usernameTextField.getText()+"-"+passwordTextField.getText();

                        stage = (Stage)((Node)IDLabel).getScene().getWindow();
                        stage.setUserData(userData);

                        switchToCustomerInfo();
                    }else{
                        warningLabel.setText("Username/Password is incorrect");
                    }
                }else{
                    warningLabel.setText("Username/Password is incorrect");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }






    }

}
