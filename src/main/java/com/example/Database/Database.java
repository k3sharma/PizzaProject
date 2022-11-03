package com.example.Database;

import com.example.DeliveryInfoObject;
import com.example.DrinkObject;
import com.example.PizzaObject;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Database {
    String databaseURL = "jdbc:ucanaccess://C:/Users//baile//OneDrive - Kennesaw State University//Fall 2022//SWE//demo//SWE Project.accdb";
    Scanner sc = new Scanner(System.in);

    public long getNumber() {
        System.out.println("Please enter your phone number.");
        String input = sc.nextLine();
        input = input.replaceAll("[\\s()-]", "");
        long customerPhoneNumber = Long.parseLong(input);
        return customerPhoneNumber;
    }
    public void addCustomer(/*eventually input row values here*/) {

        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            // Eventually all print and scanner statements will be phased out in favor of GUI form for data extraction.
            System.out.println("Enter phone number, then full name, then address, then any delivery information.");
            String input = sc.nextLine();
            input = input.replaceAll("[-()\\s(())]", "");
            long customerPhoneNumber = Long.parseLong(input);
            String fullName = sc.nextLine();
            String address = sc.nextLine();
            String deliveryIntructions = sc.nextLine();

            String sql = "INSERT INTO CUSTOMER (PhoneNumber, FullName, Address, DeliveryInfo) VALUES (?, ?, ?, ?)";
             
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setLong(1, customerPhoneNumber);
            preparedStatement.setString(2, fullName);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, deliveryIntructions);
            
            int row = preparedStatement.executeUpdate();
             
            if (row > 0) {
                System.out.println("A row has been inserted successfully.");
            }
             
            /* FOR REFERENCE
            sql = "SELECT * FROM CUSTOMER";
             
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sql);
             
            while (result.next()) {
                int phoneNumber = result.getInt("PhoneNumber");
                String fullName = result.getString("FullName");
                String address = result.getString("Address");
                String instruction = result.getString("DeliveryInfo");
                 
                System.out.println(phoneNumber + ", " + fullName + ", " + address + ", " + instruction);
            }
            */
             
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void changeCustomer(/*Eventually phone number input to find row*/) {
        try (Connection connection = DriverManager.getConnection(databaseURL)) {
            long customerPhoneNumber = getNumber();
            System.out.println("What would you like to change? Please enter one: 1=Name, 2=Address, 3=Delivery Information");
            int choice = sc.nextInt();
            
            String newInfo;
            String sql;
            PreparedStatement preparedStatement;
            /*
            Statement statement;
            ResultSet result;
            String sqlCheck;
            */

            switch(choice) {
                case 1:
                    sql = "UPDATE CUSTOMER SET FullName = ? WHERE PhoneNumber = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    System.out.println("What is the new name?");
                    newInfo = sc.next();
                    preparedStatement.setString(1, newInfo);
                    preparedStatement.setLong(2, customerPhoneNumber);
                    preparedStatement.executeUpdate();

                    /* Terminal testing
                    sqlCheck = "SELECT * FROM CUSTOMER WHERE PhoneNumber = ?";
                    preparedStatement = connection.prepareStatement(sqlCheck);
                    preparedStatement.setLong(1, customerPhoneNumber);
                    result = preparedStatement.executeQuery();
                    while (result.next()) {
                    long phoneNumber = result.getLong("PhoneNumber");
                    String fullName = result.getString("FullName");
                    String address = result.getString("Address");
                    String instruction = result.getString("DeliveryInfo");
                 
                    System.out.println("New Data: " + phoneNumber + ", " + fullName + ", " + address + ", " + instruction);
                    }
                    */
                break;
                case 2:
                    sql = "UPDATE CUSTOMER SET Address = ? WHERE PhoneNumber = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    System.out.println("What is the new address?");
                    newInfo = sc.next();
                    preparedStatement.setString(1, newInfo);
                    preparedStatement.setLong(2, customerPhoneNumber);
                    preparedStatement.executeUpdate();
                    
                    /* Terminal testing
                    sqlCheck = "SELECT * FROM CUSTOMER WHERE PhoneNumber = ?";
                    preparedStatement = connection.prepareStatement(sqlCheck);
                    preparedStatement.setLong(1, customerPhoneNumber);
                    result = preparedStatement.executeQuery();
                    while (result.next()) {
                    long phoneNumber = result.getLong("PhoneNumber");
                    String fullName = result.getString("FullName");
                    String address = result.getString("Address");
                    String instruction = result.getString("DeliveryInfo");
                 
                    System.out.println("New Data: " + phoneNumber + ", " + fullName + ", " + address + ", " + instruction);
                    }
                    */
                case 3:
                    sql = "UPDATE CUSTOMER SET DeliveryInfo = ? WHERE PhoneNumber = ?";
                    preparedStatement = connection.prepareStatement(sql);
                    System.out.println("What is the new address?");
                    newInfo = sc.next();
                    preparedStatement.setString(1, newInfo);
                    preparedStatement.setLong(2, customerPhoneNumber);
                    preparedStatement.executeUpdate();

                    /* Terminal testing
                    sqlCheck = "SELECT * FROM CUSTOMER WHERE PhoneNumber = ?";
                    preparedStatement = connection.prepareStatement(sqlCheck);
                    preparedStatement.setLong(1, customerPhoneNumber);
                    result = preparedStatement.executeQuery();
                    while (result.next()) {
                    long phoneNumber = result.getLong("PhoneNumber");
                    String fullName = result.getString("FullName");
                    String address = result.getString("Address");
                    String instruction = result.getString("DeliveryInfo");
                 
                    System.out.println("New Data: " + phoneNumber + ", " + fullName + ", " + address + ", " + instruction);
                    }
                    */
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public void addCard() {
            try (Connection connection = DriverManager.getConnection(databaseURL)) {
                long customerPhoneNumber = getNumber();
                System.out.println("Enter card number, expiration date, and CVV code");
                long cardNumber = sc.nextLong();
                String expiration = sc.next();
                int cvvCode = sc.nextInt();

                PreparedStatement preparedStatement;
                String sql = "INSERT INTO CARD (CardNumber, CardExp, CardCVV) VALUES (?, ?, ?) WHERE PhoneNumber = ?";
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setLong(1, cardNumber);
                //Stop point

            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
    }

    public void deleteCard() {

    }


    public void addOrderDetails(String customerName, String paymentType, DeliveryInfoObject deliveryInfo, ArrayList<PizzaObject> pizzaList, ArrayList<DrinkObject> drinkList){}

    // public void modCard() {}
}
