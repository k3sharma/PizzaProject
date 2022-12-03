package com.example.Controllers;

import com.example.DrinkObject;
import com.example.PizzaObject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.text.Text;
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
    private double cashAmount;
    private double changeDue;
    private String routingAddress;
    private String accountNumber;
    private String checkNumber;
    private String cardType;
    @FXML
    RadioButton paymentTypeButtonCash;
    @FXML
    RadioButton paymentTypeButtonCheck;
    @FXML
    RadioButton paymentTypeButtonCard;
    @FXML
    TextField cashTextField;
    @FXML
    TextField cardNumberTextField;
    @FXML
    TextField cardTextField;
    @FXML
    RadioButton cardTypeButtonC;
    @FXML
    RadioButton cardTypeButtonD;
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
    @FXML
    Label numOfPizzaLabel;
    @FXML
    Label numOfDrinkLabel;
    @FXML
    ScrollPane myScroll;
    @FXML
    TextArea myArea;
    @FXML
    Text myText;
    @FXML
    Text finalText;
    @FXML
    ScrollPane finalScroll;



    public void setCard(){
        paymentType="Card";
        paymentTypeButtonCard.setSelected(true);
        paymentTypeButtonCash.setSelected(false);
        paymentTypeButtonCheck.setSelected(false);
    }
    public void setCash(){
        paymentType="Cash";
        paymentTypeButtonCard.setSelected(false);
        paymentTypeButtonCash.setSelected(true);
        paymentTypeButtonCheck.setSelected(false);
    }
    public void setCheck(){
        paymentType="Check";
        paymentTypeButtonCard.setSelected(false);
        paymentTypeButtonCash.setSelected(false);
        paymentTypeButtonCheck.setSelected(true);
    }


    public void setCardTypeC(){
        cardType="Credit";
        cardTypeButtonC.setSelected(true);
        cardTypeButtonD.setSelected(false);
    }
    public void setCardTypeD(){
        cardType="Debit";
        cardTypeButtonC.setSelected(false);
        cardTypeButtonD.setSelected(true);
    }




    public void PaymentType() throws IOException{
        if(paymentTypeButtonCheck.isSelected()){
            switchToCheckInfo();
        }else if(paymentTypeButtonCash.isSelected()){
            switchToCashInfo();
        }else{
          switchToCardInfo();
        }


    }





    public void switchToCardInfo() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/cardView.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCashInfo() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/CashView.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToCheckInfo() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/CheckView.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void cashAmount() throws IOException{
        cashAmount=Double.valueOf(cashTextField.getText());
        switchToReceiptPage();
    }
    public void checkAmount() throws IOException{
        routingAddress = routingAddTextField.getText();
        accountNumber = accNumTextField.getText();
        checkNumber=checkNumTextField.getText();
        switchToReceiptPage();
    }
    public void cardAmount() throws IOException{
        cardNumber=cardNumberTextField.getText();
        expirationDate=expDateTextField.getText();
        cvv=cvvTextField.getText();
        nameOnCard=nameOnCardTextField.getText();
        zipCode=zipTextField.getText();
        switchToReceiptPage();
    }






    public void switchToReceiptPage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/Receipt Page.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }





    public String setReceipt() throws IOException{
        String receiptOutput="";
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/ConfirmingOrdersPage.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();

        ArrayList<ArrayList> userDataArray = (ArrayList<ArrayList>) stage.getUserData();
        ArrayList<PizzaObject> pizzaArray = userDataArray.get(0);
        ArrayList<DrinkObject> drinkArray = userDataArray.get(1);




        for(int currentPizza=0;currentPizza<pizzaArray.size();currentPizza++){
            String ingredientString="";


                ingredientString=ingredientString+(pizzaArray.get(currentPizza).getSize())+"\n";
                ingredientString=ingredientString+(pizzaArray.get(currentPizza).getCrustType())+"\n";
                if(pizzaArray.get(currentPizza).getHasMozzarella()==true){
                    ingredientString=ingredientString+"Mozzarella\n";
                }
                if(pizzaArray.get(currentPizza).getHasExtraMozzarella()==true){
                    ingredientString=ingredientString+"Extra Mozzarella\n";
                }
                if(pizzaArray.get(currentPizza).getHasCheddar()==true){
                    ingredientString=ingredientString+"Cheddar\n";
                }
                if(pizzaArray.get(currentPizza).getHasExtraCheddar()==true){
                    ingredientString=ingredientString+"Extra Cheddar\n";
                }
                if(pizzaArray.get(currentPizza).getHasBeef()==true){
                    ingredientString=ingredientString+"Beef\n";
                }
                if(pizzaArray.get(currentPizza).getHasExtraBeef()==true){
                    ingredientString=ingredientString+"Extra Beef\n";
                }
                if(pizzaArray.get(currentPizza).getHasChicken()==true){
                    ingredientString=ingredientString+"Cheddar\n";
                }
                if(pizzaArray.get(currentPizza).getHasExtraChicken()==true){
                    ingredientString=ingredientString+"Extra Chicken\n";
                }
                if(pizzaArray.get(currentPizza).getHasPepperoni()==true){
                    ingredientString=ingredientString+"Pepperoni\n";
                }
                if(pizzaArray.get(currentPizza).getHasExtraPepperoni()==true){
                    ingredientString=ingredientString+"Extra Pepperoni\n";
                }
                if(pizzaArray.get(currentPizza).getHasOnion()==true){
                    ingredientString=ingredientString+"Onion\n";
                }
                if(pizzaArray.get(currentPizza).getHasExtraOnion()==true){
                    ingredientString=ingredientString+"Extra Onion\n";
                }
                if(pizzaArray.get(currentPizza).getHasBellPepper()==true){
                    ingredientString=ingredientString+"Bell Pepper\n";
                }
                if(pizzaArray.get(currentPizza).getHasExtraBellPepper()==true){
                    ingredientString=ingredientString+"Extra Bell Pepper\n";
                }
                if(pizzaArray.get(currentPizza).getHasPineapple()==true){
                    ingredientString=ingredientString+"Pineapple\n";
                }
                if(pizzaArray.get(currentPizza).getHasExtraPineapple()==true){
                    ingredientString=ingredientString+"Extra Pineapple\n";
                }
                receiptOutput = receiptOutput+"Pizza#"+currentPizza+1+": \n";
                receiptOutput = receiptOutput+ingredientString;


        }
        for(int currentDrink=0;currentDrink<drinkArray.size();currentDrink++){
            String ingredientString="";
            ingredientString=ingredientString+(drinkArray.get(currentDrink).getSize())+"\n";
            ingredientString=ingredientString+(drinkArray.get(currentDrink).getFlavor())+"\n";
            receiptOutput=receiptOutput+"Drink#"+currentDrink+1+": \n";
            receiptOutput=receiptOutput+ingredientString;


        }
        double totalPrice=0;

        for(int i=0;i< pizzaArray.size();i++){
           if( pizzaArray.get(i).getSize().equals("Small Size")){
                totalPrice=totalPrice+5.99;
           }
            if( pizzaArray.get(i).getSize().equals("Medium Size")){
                totalPrice=totalPrice+6.99;
            }
            if( pizzaArray.get(i).getSize().equals("Large Size")){
                totalPrice=totalPrice+7.99;
            }
            if( pizzaArray.get(i).getSize().equals("Extra Large Size")){
                totalPrice=totalPrice+8.99;
            }
        }
        for(int i=0;i< drinkArray.size();i++){
            if( drinkArray.get(i).getSize().equals("Small Size")){
                totalPrice=totalPrice+1;
            }
            if( drinkArray.get(i).getSize().equals("Medium Size")){
                totalPrice=totalPrice+2;
            }
            if( drinkArray.get(i).getSize().equals("Large Size")){
                totalPrice=totalPrice+3;
            }

        }

        receiptOutput=receiptOutput+"Total: "+totalPrice+"\n";


        if(paymentType=="Cash"){
            receiptOutput=receiptOutput+"Cash in: "+cashAmount+" Change Due: "+(cashAmount-changeDue);
        }

        if(paymentType=="Card"){
            receiptOutput=receiptOutput+"Sign Here:____________";
        }

        System.out.println(receiptOutput);


        numOfPizzaLabel.setText("Number of Pizzas: "+ pizzaArray.size());
        numOfDrinkLabel.setText("Number of Drinks: "+ drinkArray.size());
        return receiptOutput;

    }


    public void printReceipt() throws IOException{
        myText.setText(setReceipt());
        myScroll.setContent(myText);
        myScroll.setFitToWidth(true);






    }
    public void switchToFinalReceipt() throws IOException{
        String finalReceipt=setReceipt();
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/FinalReceipt.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();



        finalText.setText(finalReceipt);
        finalScroll.setContent(finalText);
        finalScroll.setFitToWidth(true);
    }






}
