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
    @FXML
    RadioButton toppingM;
    @FXML
    RadioButton toppingEM;
    @FXML
    RadioButton toppingChed;
    @FXML
    RadioButton toppingEChed;
    @FXML
    RadioButton toppingPep;
    @FXML
    RadioButton toppingEPep;
    @FXML
    RadioButton toppingB;
    @FXML
    RadioButton toppingEB;
    @FXML
    RadioButton toppingChic;
    @FXML
    RadioButton toppingEChic;
    @FXML
    RadioButton toppingO;
    @FXML
    RadioButton toppingEO;
    @FXML
    RadioButton toppingBP;
    @FXML
    RadioButton toppingEBP;
    @FXML
    RadioButton toppingPin;
    @FXML
    RadioButton toppingEPin;





    public static ArrayList<PizzaObject> pizzaArray;
    public static ArrayList<DrinkObject> drinkArray;


    String pTopping;
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
// these are all in sets of 2 beacuse its the topping button then the extra button
    public void switchToppingM(){
        toppingM.setSelected(true);
        toppingEM.setSelected(false);
    }
    public void switchToppingEM(){
        toppingM.setSelected(false);
        toppingEM.setSelected(true);
    }

    public void switchToppingB(){
        toppingB.setSelected(true);
        toppingEB.setSelected(false);
    }
    public void switchToppingEB(){
        toppingB.setSelected(false);
        toppingEB.setSelected(true);
    }

    public void switchToppingChed(){
        toppingChed.setSelected(true);
        toppingEChed.setSelected(false);
    }
    public void switchToppingEChed(){
        toppingChed.setSelected(false);
        toppingEChed.setSelected(true);
    }

    public void switchToppingChic(){
        toppingChic.setSelected(true);
        toppingEChic.setSelected(false);
    }
    public void switchToppingEChic(){
        toppingChic.setSelected(false);
        toppingEChic.setSelected(true);
    }

    public void switchToppingPin(){
        toppingPin.setSelected(true);
        toppingEPin.setSelected(false);
    }
    public void switchToppingEPin(){
        toppingPin.setSelected(false);
        toppingEPin.setSelected(true);
    }

    public void switchToppingBP(){
        toppingBP.setSelected(true);
        toppingEBP.setSelected(false);
    }
    public void switchToppingEBP(){
        toppingBP.setSelected(false);
        toppingEBP.setSelected(true);
    }

    public void switchToppingO(){
        toppingO.setSelected(true);
        toppingEO.setSelected(false);
    }
    public void switchToppingEO(){
        toppingO.setSelected(false);
        toppingEO.setSelected(true);
    }

    public void switchToppingPep(){
        toppingM.setSelected(true);
        toppingEM.setSelected(false);
    }
    public void switchToppingEPep(){
        toppingPep.setSelected(false);
        toppingEPep.setSelected(true);
    }


    public void addItems() throws IOException{
        if(pizzaArray.get(currentPizza).getSize() != null ){
            pizzaArray.get(currentPizza).setSize(pSize);
            pizzaArray.get(currentPizza).setCrustType(pCrustType);
            pizzaArray.get(currentPizza).setHasMozzarella(toppingM.isSelected());
            pizzaArray.get(currentPizza).setHasExtraMozzarella(toppingEM.isSelected());
            pizzaArray.get(currentPizza).setHasBeef(toppingB.isSelected());
            pizzaArray.get(currentPizza).setHasExtraBeef(toppingEB.isSelected());
            pizzaArray.get(currentPizza).setHasCheddar(toppingChed.isSelected());
            pizzaArray.get(currentPizza).setHasExtraCheddar(toppingEChed.isSelected());
            pizzaArray.get(currentPizza).setHasChicken(toppingChic.isSelected());
            pizzaArray.get(currentPizza).setHasExtraChicken(toppingEChic.isSelected());
            pizzaArray.get(currentPizza).setHasPineapple(toppingPin.isSelected());
            pizzaArray.get(currentPizza).setHasExtraPineapple(toppingEPin.isSelected());
            pizzaArray.get(currentPizza).setHasBellPepper(toppingBP.isSelected());
            pizzaArray.get(currentPizza).setHasExtraBellPepper(toppingEBP.isSelected());
            pizzaArray.get(currentPizza).setHasOnion(toppingO.isSelected());
            pizzaArray.get(currentPizza).setHasExtraOnion(toppingEO.isSelected());
            pizzaArray.get(currentPizza).setHasPepperoni(toppingPep.isSelected());
            pizzaArray.get(currentPizza).setHasExtraPepperoni(toppingEPep.isSelected());

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
