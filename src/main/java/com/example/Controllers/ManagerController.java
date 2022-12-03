package com.example.Controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.sql.*;
import java.io.IOException;

public class ManagerController {

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
    @FXML
    ScrollPane myScroll;
    @FXML
    Text myText;


    public void switchToManagerEdit() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/ManagerEdit.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToStartingView() throws IOException{
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/StartingView.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void selectCustomer() throws IOException{
        String databaseURL ="jdbc:ucanaccess://PizzaProject.accdb";
        //gets the employeeID and password from database
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement myStatement;
            String SQLQuery="SELECT * FROM CUSTOMER";
            myStatement = connection.prepareStatement(SQLQuery);

            ResultSet myRS = myStatement.executeQuery();

            ResultSetMetaData rsmd = myRS.getMetaData();
            int columnsNumber = rsmd.getColumnCount();
            while (myRS.next()) {
                for (int i = 1; i <= columnsNumber; i++) {
                    if (i > 1) System.out.print(",  ");
                    String columnValue = myRS.getString(i);
                    System.out.print(columnValue + " " + rsmd.getColumnName(i));
                }
                System.out.println("");
            }




        } catch (SQLException e){
            e.printStackTrace();
        }


    }






    public void testUsernamePassword() throws IOException{
        System.out.println("good");


        String databaseURL ="jdbc:ucanaccess://PizzaProject.accdb";
        //gets the employeeID and password from database
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            PreparedStatement myStatement;
            String SQLQuery="SELECT * FROM EMPLOYEE WHERE Username = ? AND Password = ?";
            myStatement = connection.prepareStatement(SQLQuery);
            myStatement.setString(1,usernameTextField.getText());
            myStatement.setString(2, passwordTextField.getText());
            ResultSet myRS = myStatement.executeQuery();
            if(myRS.next()){
                String customerID = myRS.getString("Username");
                String customerPassword = myRS.getString("Password");

                //checks the textFields to see if ID and pass match
                if(usernameTextField.getText().equals(customerID) && passwordTextField.getText().equals(customerPassword)){



                    System.out.println("good");
                    switchToManagerEdit();
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







