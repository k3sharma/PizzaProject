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

public class ManagerController {
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    TextField IDTextField;
    @FXML
    TextField passwordTextField;
    @FXML
    Label managerLoginLabel;
    @FXML
    Label IDLabel;
    @FXML
    Label passwordLabel;
    @FXML
    Label warningLabel;
    @FXML
    TextField editTextFieldRow;
    @FXML
    TextField editTextFieldColumn;
    public void switchToDatabaseView() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/DatabaseView.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToDatabaseEdit() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/DatabaseEdit.fxml"));
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
    public static boolean isManager(){
        return true;
    }

    public void testUsernamePassword() throws IOException{

        if(isInteger((IDTextField.getText()))==true){
            warningLabel.setText("");
            String databaseURL ="jdbc:ucanaccess://C:/Users/Glenn Gerdes/IdeaProjects/PizzaProject/SWE Project.accdb";
            //gets the employeeID and password from database
            try (Connection connection = DriverManager.getConnection(databaseURL)) {
                PreparedStatement myStatement;
                String SQLQuery="SELECT * FROM EmployeeCredentials WHERE EmployeeID = ? AND Password = ? AND isManager = ?";
                myStatement = connection.prepareStatement(SQLQuery);
                myStatement.setInt(1,Integer.parseInt(IDTextField.getText()));
                myStatement.setString(2, passwordTextField.getText());
                myStatement.setBoolean(2, true);
                ResultSet myRS = myStatement.executeQuery();
                if(myRS.next()){
                    String EmpID = myRS.getString("EmployeeID");
                    String EmpPassword = myRS.getString("Password");
                    //checks the textFields to see if ID and pass match
                    if(IDTextField.getText().equals(EmpID) && passwordTextField.getText().equals(EmpPassword)){
                        switchToDatabaseView();
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

    public void showData(){

    }
    public void editData(String column, int row){

    }





}

