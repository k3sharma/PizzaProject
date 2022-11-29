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
    RadioButton drinkSizeS;
    @FXML
    RadioButton drinkSizeM;
    @FXML
    RadioButton drinkSizeL;
    @FXML
    RadioButton drinkFlavorC;
    @FXML
    RadioButton drinkFlavorL;
    @FXML
    RadioButton drinkFlavorI;
    @FXML
    RadioButton drinkFlavorW;
    @FXML
    RadioButton drinkFlavorS;
    @FXML
    RadioButton pizzaSizeS;
    @FXML
    RadioButton pizzaSizeM;
    @FXML
    RadioButton pizzaSizeL;
    @FXML
    RadioButton pizzaSizeXL;
    @FXML
    RadioButton crustTypeHT;
    @FXML
    RadioButton crustTypeT;
    @FXML
    RadioButton crustTypeCS;
    @FXML
    RadioButton crustTypeGF;

    public static ArrayList<PizzaObject> pizzaArray;
    public static ArrayList<DrinkObject> drinkArray;

    String dSize;
    String dFlavor;
    String pSize;
    String pCrustType;
    int currentPizza=0;
    int currentDrink=0;




    public void switchPizzaSizeS(){
        pSize = "Small";
        pizzaSizeS.setSelected(true);
        pizzaSizeM.setSelected(false);
        pizzaSizeL.setSelected(false);
        pizzaSizeXL.setSelected(false);
    }
    public void switchPizzaSizeM(){
        pSize = "Medium";
        pizzaSizeS.setSelected(false);
        pizzaSizeM.setSelected(true);
        pizzaSizeL.setSelected(false);
        pizzaSizeXL.setSelected(false);
    }
    public void switchPizzaSizeL(){
        pSize = "large";
        pizzaSizeS.setSelected(false);
        pizzaSizeM.setSelected(false);
        pizzaSizeL.setSelected(true);
        pizzaSizeXL.setSelected(false);
    }
    public void switchPizzaSizeXL(){
        pSize = "Extra large";
        pizzaSizeS.setSelected(true);
        pizzaSizeM.setSelected(false);
        pizzaSizeL.setSelected(false);
        pizzaSizeXL.setSelected(true);
    }

    public void switchPizzaCrustHT(){
        pCrustType = "Hand Tossed";
        crustTypeHT.setSelected(true);
        crustTypeCS.setSelected(false);
        crustTypeGF.setSelected(false);
        crustTypeT.setSelected(false);
    }

    public void switchPizzaCrustCS(){
        pCrustType = "Cheese-Stuffed";
        crustTypeHT.setSelected(false);
        crustTypeCS.setSelected(true);
        crustTypeGF.setSelected(false);
        crustTypeT.setSelected(false);
    }

    public void switchPizzaCrustT(){
        pCrustType = "Thin";
        crustTypeHT.setSelected(false);
        crustTypeCS.setSelected(false);
        crustTypeGF.setSelected(false);
        crustTypeT.setSelected(true);
    }
    public void switchPizzaCrustGF(){
        pCrustType = "Gluten-Free";
        crustTypeHT.setSelected(false);
        crustTypeCS.setSelected(false);
        crustTypeGF.setSelected(true);
        crustTypeT.setSelected(false);
    }

    public void switchDrinkSizeS(){
        dSize = "Small";
        drinkSizeS.setSelected(true);
        drinkSizeM.setSelected(false);
        drinkSizeL.setSelected(false);
    }
    public void switchDrinkSizeM(){
        dSize = "Medium";
        drinkSizeS.setSelected(false);
        drinkSizeM.setSelected(true);
        drinkSizeL.setSelected(false);
    }
    public void switchDrinkSizeL(){
        dSize = "Large";
        drinkSizeS.setSelected(false);
        drinkSizeM.setSelected(false);
        drinkSizeL.setSelected(true);
    }
    public void switchFlavorC(){
        dFlavor = "Coca-Cola";
        drinkFlavorC.setSelected(true);
        drinkFlavorL.setSelected(false);
        drinkFlavorI.setSelected(false);
        drinkFlavorW.setSelected(false);
        drinkFlavorS.setSelected(false);
    }
    public void switchFlavorL(){
        dFlavor = "Lemonade";
        drinkFlavorC.setSelected(false);
        drinkFlavorL.setSelected(true);
        drinkFlavorI.setSelected(false);
        drinkFlavorW.setSelected(false);
        drinkFlavorS.setSelected(false);
    }
    public void switchFlavorI(){
        dFlavor = "Iced Tea";
        drinkFlavorC.setSelected(false);
        drinkFlavorL.setSelected(false);
        drinkFlavorI.setSelected(true);
        drinkFlavorW.setSelected(false);
        drinkFlavorS.setSelected(false);
    }
    public void switchFlavorW(){
        dFlavor = "Water";
        drinkFlavorC.setSelected(false);
        drinkFlavorL.setSelected(false);
        drinkFlavorI.setSelected(false);
        drinkFlavorW.setSelected(true);
        drinkFlavorS.setSelected(false);
    }
    public void switchFlavorS(){
        dFlavor = "Sprite";
        drinkFlavorC.setSelected(false);
        drinkFlavorL.setSelected(false);
        drinkFlavorI.setSelected(false);
        drinkFlavorW.setSelected(false);
        drinkFlavorS.setSelected(true);
    }



    public void addItems() throws IOException{
        if(pizzaArray.get(currentPizza).getSize() != null ){
            pizzaArray.get(currentPizza).setSize(pSize);
            pizzaArray.get(currentPizza).setCrustType(pCrustType);
            pizzaArray.get(currentPizza).setHasMozzarella(pTopping);


        }

        addDrink();
        addPizza();

        switchToConfirmingOrdersPage();
    }



    public void addPizza(){
        PizzaObject myPizza = new PizzaObject();
        pizzaArray.add(myPizza);
    }
    public void addDrink(){

        DrinkObject myDrink = new DrinkObject(dSize, dFlavor);
        drinkArray.add(myDrink);
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
