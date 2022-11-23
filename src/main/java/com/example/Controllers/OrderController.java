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
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

public class OrderController {
private Scene scene;
private Parent root;
private Stage stage;
@FXML
Label IDLabel;
@FXML
    RadioButton mozzButton;
@FXML
RadioButton exMozzButton;
    @FXML
    RadioButton cheddButton;
    @FXML
    RadioButton exCheddButton;
    @FXML
    RadioButton provButton;
    @FXML
    RadioButton exProvButton;
    @FXML
    RadioButton parmButton;
    @FXML
    RadioButton exParmButton;
    @FXML
    RadioButton pepButton;
    @FXML
    RadioButton exPepButton;
    @FXML
    RadioButton hamButton;
    @FXML
    RadioButton exHamButton;
    @FXML
    RadioButton bacButton;
    @FXML
    RadioButton exBacButton;
    @FXML
    RadioButton beefButton;
    @FXML
    RadioButton exBeefButton;
    @FXML
    RadioButton chicButton;
    @FXML
    RadioButton exChicButton;
    @FXML
    RadioButton PSButton;
    @FXML
    RadioButton exPSButton;
    @FXML
    RadioButton onionButton;
    @FXML
    RadioButton exOnionButton;
    @FXML
    RadioButton BPButton;
    @FXML
    RadioButton exBPButton;
    @FXML
    RadioButton spinButton;
    @FXML
    RadioButton exSpinButton;
    @FXML
    RadioButton tomButton;
    @FXML
    RadioButton exTomButton;
    @FXML
    RadioButton pinButton;
    @FXML
    RadioButton exPinButton;
    @FXML
    RadioButton BOButton;
    @FXML
    RadioButton exBOButton;
    @FXML
    RadioButton mushButton;
    @FXML
    RadioButton exMushButton;
    @FXML
    RadioButton banPepButton;
    @FXML
    RadioButton exBanPepButton;
    @FXML
    RadioButton jalButton;
    @FXML
    RadioButton exJalButton;
    @FXML
    RadioButton drinkSize;
    @FXML
    RadioButton drinkFlavor;
    public static ArrayList<PizzaObject> pizzaArray;
    public static ArrayList<DrinkObject> drinkArray;
    public ArrayList<PizzaObject> createPizza(int size, String crustType, Boolean hasMozzarella, Boolean hasExtraMozzarella,Boolean hasCheddar,Boolean hasExtraCheddar,Boolean hasProvolone,Boolean hasExtraProvolone,Boolean hasParmesean,Boolean hasExtraParmesean,Boolean hasPepperoni,Boolean hasExtraPepperoni,Boolean hasHam,Boolean hasExtraHam,Boolean hasBacon,Boolean hasExtraBacon,Boolean hasBeef,Boolean hasExtraBeef,Boolean hasChicken,Boolean hasExtraChicken,Boolean hasPhillySteak,Boolean hasExtraPhillySteak,Boolean hasOnion,Boolean hasExtraOnion,Boolean hasBellPepper,Boolean hasExtraBellPepper,Boolean hasSpinach,Boolean hasExtraSpinach,Boolean hasTomato,Boolean hasExtraTomato,Boolean hasPineapple,Boolean hasExtraPineapple,Boolean hasBlackOlives,Boolean hasExtraBlackOlives,Boolean hasMushrooms,Boolean hasExtraMushrooms,Boolean hasBananaPeppers,Boolean hasExtraBananaPeppers,Boolean hasJalapenos,Boolean hasExtraJalapenos){


        return pizzaArray;
    }
    public ArrayList<DrinkObject> createDrink(String size, String flavor){


        return drinkArray;
    }


    public static ArrayList<DrinkObject> getDrinkArray() {
        return drinkArray;
    }

    public static ArrayList<PizzaObject> getPizzaArray() {
        return pizzaArray;
    }

    public static void setPizzaArray(ArrayList<PizzaObject> pizzaArray) {
        OrderController.pizzaArray = pizzaArray;
    }

    public static void setDrinkArray(ArrayList<DrinkObject> drinkArray) {
        OrderController.drinkArray = drinkArray;
    }

    public void switchToOrderView2() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/OrderView2.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToOrderView3() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/OrderView3.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToConfirmingOrdersPage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/ConfirmingOrdersPage.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
}
