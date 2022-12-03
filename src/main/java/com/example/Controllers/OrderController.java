package com.example.Controllers;

import com.example.DrinkObject;
import com.example.PizzaObject;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
    @FXML
    Label warningLabel1;
    @FXML
    Label warningLabel2;
    @FXML
    Label warningLabel3;
    @FXML
    Label warningLabel4;
    @FXML
    Label currentPizzaLabel;
    @FXML
    Button newPizzaButton;
    @FXML
    Label listIngredientsLabel;
    @FXML
    Label currentDrinkLabel;
    @FXML
    Label warningLabelConfirmDrink;
    @FXML
    Label warningLabelDrinkView;
    @FXML
    Label listIngredientsLabelDrink;
    @FXML
    Label IDLabelDrink;


    int editPizza;

    public static ArrayList<PizzaObject> pizzaArray = new ArrayList<PizzaObject>();
    public static ArrayList<DrinkObject> drinkArray = new ArrayList<DrinkObject>();


    String pToppingM;

    String pToppingChed;

    String pToppingPep;

    String pToppingB;

    String pToppingChic;

    String pToppingO;

    String pToppingBP;

    String pToppingPin;


    String dSize;
    String dFlavor;
    String pSize;
    String pCrustType;
    static int currentPizza;
    static int currentDrink;




    public void switchPizzaSizeS(){
        pSize = "Small Size";
        pizzaSizeS.setSelected(true);
        pizzaSizeM.setSelected(false);
        pizzaSizeL.setSelected(false);
        pizzaSizeXL.setSelected(false);
        pizzaArray.get(currentPizza).setSize(pSize);


    }
    public void switchPizzaSizeM(){
        pSize = "Medium Size";
        pizzaSizeS.setSelected(false);
        pizzaSizeM.setSelected(true);
        pizzaSizeL.setSelected(false);
        pizzaSizeXL.setSelected(false);
        pizzaArray.get(currentPizza).setSize(pSize);
    }
    public void switchPizzaSizeL(){
        pSize = "Large Size";
        pizzaSizeS.setSelected(false);
        pizzaSizeM.setSelected(false);
        pizzaSizeL.setSelected(true);
        pizzaSizeXL.setSelected(false);
        pizzaArray.get(currentPizza).setSize(pSize);
    }
    public void switchPizzaSizeXL(){
        pSize = "Extra Large Size";
        pizzaSizeS.setSelected(false);
        pizzaSizeM.setSelected(false);
        pizzaSizeL.setSelected(false);
        pizzaSizeXL.setSelected(true);
        pizzaArray.get(currentPizza).setSize(pSize);
        System.out.println("currSizeP:"+currentPizza);
    }

    public void switchPizzaCrustHT(){
        pCrustType = "Hand Tossed Crust";
        crustTypeHT.setSelected(true);
        crustTypeCS.setSelected(false);
        crustTypeGF.setSelected(false);
        crustTypeT.setSelected(false);
        pizzaArray.get(currentPizza).setCrustType(pCrustType);
    }

    public void switchPizzaCrustCS(){
        pCrustType = "Cheese-Stuffed Crust";
        crustTypeHT.setSelected(false);
        crustTypeCS.setSelected(true);
        crustTypeGF.setSelected(false);
        crustTypeT.setSelected(false);
        pizzaArray.get(currentPizza).setCrustType(pCrustType);
    }

    public void switchPizzaCrustT(){
        pCrustType = "Thin Crust";
        crustTypeHT.setSelected(false);
        crustTypeCS.setSelected(false);
        crustTypeGF.setSelected(false);
        crustTypeT.setSelected(true);
        pizzaArray.get(currentPizza).setCrustType(pCrustType);
    }
    public void switchPizzaCrustGF(){
        pCrustType = "Gluten-Free Crust";
        crustTypeHT.setSelected(false);
        crustTypeCS.setSelected(false);
        crustTypeGF.setSelected(true);
        crustTypeT.setSelected(false);
        pizzaArray.get(currentPizza).setCrustType(pCrustType);
    }

    public void switchDrinkSizeS(){
        dSize = "Small Size";
        drinkSizeS.setSelected(true);
        drinkSizeM.setSelected(false);
        drinkSizeL.setSelected(false);
        drinkArray.get(currentDrink).setSize(dSize);
    }
    public void switchDrinkSizeM(){
        dSize = "Medium Size";
        drinkSizeS.setSelected(false);
        drinkSizeM.setSelected(true);
        drinkSizeL.setSelected(false);
        drinkArray.get(currentDrink).setSize(dSize);
    }
    public void switchDrinkSizeL(){
        dSize = "Large Size";
        drinkSizeS.setSelected(false);
        drinkSizeM.setSelected(false);
        drinkSizeL.setSelected(true);
        drinkArray.get(currentDrink).setSize(dSize);
    }
    public void switchFlavorC(){
        dFlavor = "Coca-Cola";
        drinkFlavorC.setSelected(true);
        drinkFlavorL.setSelected(false);
        drinkFlavorI.setSelected(false);
        drinkFlavorW.setSelected(false);
        drinkFlavorS.setSelected(false);
        drinkArray.get(currentDrink).setFlavor(dFlavor);
    }
    public void switchFlavorL(){
        dFlavor = "Lemonade";
        drinkFlavorC.setSelected(false);
        drinkFlavorL.setSelected(true);
        drinkFlavorI.setSelected(false);
        drinkFlavorW.setSelected(false);
        drinkFlavorS.setSelected(false);
        drinkArray.get(currentDrink).setFlavor(dFlavor);
    }
    public void switchFlavorI(){
        dFlavor = "Iced Tea";
        drinkFlavorC.setSelected(false);
        drinkFlavorL.setSelected(false);
        drinkFlavorI.setSelected(true);
        drinkFlavorW.setSelected(false);
        drinkFlavorS.setSelected(false);
        drinkArray.get(currentDrink).setFlavor(dFlavor);
    }
    public void switchFlavorW(){
        dFlavor = "Water";
        drinkFlavorC.setSelected(false);
        drinkFlavorL.setSelected(false);
        drinkFlavorI.setSelected(false);
        drinkFlavorW.setSelected(true);
        drinkFlavorS.setSelected(false);
        drinkArray.get(currentDrink).setFlavor(dFlavor);
    }
    public void switchFlavorS(){
        dFlavor = "Sprite";
        drinkFlavorC.setSelected(false);
        drinkFlavorL.setSelected(false);
        drinkFlavorI.setSelected(false);
        drinkFlavorW.setSelected(false);
        drinkFlavorS.setSelected(true);
        drinkArray.get(currentDrink).setFlavor(dFlavor);
    }
// these are all in sets of 2 beacuse its the topping button then the extra button
    public void switchToppingM(){
        pToppingM = "Mozzarella";
        toppingM.setSelected(true);
        toppingEM.setSelected(false);
        pizzaArray.get(currentPizza).setHasMozzarella(true);
        pizzaArray.get(currentPizza).setHasExtraMozzarella(false);
    }
    public void switchToppingEM(){
        pToppingM = "Extra Mozzarella";
        toppingM.setSelected(false);
        toppingEM.setSelected(true);
        pizzaArray.get(currentPizza).setHasMozzarella(false);
        pizzaArray.get(currentPizza).setHasExtraMozzarella(true);
    }

    public void switchToppingB(){
        pToppingB = "Beef";
        toppingB.setSelected(true);
        toppingEB.setSelected(false);
        pizzaArray.get(currentPizza).setHasBeef(true);
        pizzaArray.get(currentPizza).setHasExtraBeef(false);
    }
    public void switchToppingEB(){
        pToppingB = "Extra Beef";
        toppingB.setSelected(false);
        toppingEB.setSelected(true);
        pizzaArray.get(currentPizza).setHasBeef(false);
        pizzaArray.get(currentPizza).setHasExtraBeef(true);
    }

    public void switchToppingChed(){
        pToppingChed = "Cheddar";
        toppingChed.setSelected(true);
        toppingEChed.setSelected(false);
        pizzaArray.get(currentPizza).setHasCheddar(true);
        pizzaArray.get(currentPizza).setHasExtraCheddar(false);
    }
    public void switchToppingEChed(){
        pToppingChed = "Extra Cheddar";
        toppingChed.setSelected(false);
        toppingEChed.setSelected(true);
        pizzaArray.get(currentPizza).setHasCheddar(false);
        pizzaArray.get(currentPizza).setHasExtraCheddar(true);
    }

    public void switchToppingChic(){
        pToppingChic = "Chicken";
        toppingChic.setSelected(true);
        toppingEChic.setSelected(false);
        pizzaArray.get(currentPizza).setHasChicken(true);
        pizzaArray.get(currentPizza).setHasExtraChicken(false);
    }
    public void switchToppingEChic(){
        pToppingChic = "Extra Chicken";
        toppingChic.setSelected(false);
        toppingEChic.setSelected(true);
        pizzaArray.get(currentPizza).setHasChicken(false);
        pizzaArray.get(currentPizza).setHasExtraChicken(true);


    }

    public void switchToppingPin(){
        pToppingPin = "Pineapple";
        toppingPin.setSelected(true);
        toppingEPin.setSelected(false);
        pizzaArray.get(currentPizza).setHasPineapple(true);
        pizzaArray.get(currentPizza).setHasExtraPineapple(false);
    }
    public void switchToppingEPin(){
        pToppingPin = "Extra Pineapple";
        toppingPin.setSelected(false);
        toppingEPin.setSelected(true);
        pizzaArray.get(currentPizza).setHasPineapple(false);
        pizzaArray.get(currentPizza).setHasExtraPineapple(true);
    }

    public void switchToppingBP(){
        pToppingBP = "Bell Pepper";
        toppingBP.setSelected(true);
        toppingEBP.setSelected(false);
        pizzaArray.get(currentPizza).setHasBellPepper(true);
        pizzaArray.get(currentPizza).setHasExtraBellPepper(false);
    }
    public void switchToppingEBP(){
        pToppingBP = "Extra Bell Pepper";
        toppingBP.setSelected(false);
        toppingEBP.setSelected(true);
        pizzaArray.get(currentPizza).setHasBellPepper(false);
        pizzaArray.get(currentPizza).setHasExtraBellPepper(true);
    }

    public void switchToppingO(){
        pToppingO = "Onion";
        toppingO.setSelected(true);
        toppingEO.setSelected(false);
        pizzaArray.get(currentPizza).setHasOnion(true);
        pizzaArray.get(currentPizza).setHasExtraOnion(false);
    }
    public void switchToppingEO(){
        pToppingO = "Extra Onion";
        toppingO.setSelected(false);
        toppingEO.setSelected(true);
        pizzaArray.get(currentPizza).setHasOnion(false);
        pizzaArray.get(currentPizza).setHasExtraOnion(true);
    }

    public void switchToppingPep(){
        pToppingPep = "Pepperoni";
        toppingPep.setSelected(true);
        toppingEPep.setSelected(false);
        pizzaArray.get(currentPizza).setHasPepperoni(true);
        pizzaArray.get(currentPizza).setHasExtraPepperoni(false);
    }
    public void switchToppingEPep(){
        pToppingPep = "Extra Pepperoni";
        toppingPep.setSelected(false);
        toppingEPep.setSelected(true);
        pizzaArray.get(currentPizza).setHasPepperoni(false);
        pizzaArray.get(currentPizza).setHasExtraPepperoni(true);
    }









    public String makeIngredientList(){

        String ingredientString="";

        if(pizzaArray.get(currentPizza).getSize()==""){
            return"Nothing on this Pizza!";
        }else{
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
            return ingredientString;
        }

    }

    public void rightPizzaClicked(){
        if(pizzaArray.size() == 0){

        }else{
            currentPizza = currentPizza +1;
            if(currentPizza > pizzaArray.size()-1){
                currentPizza = 0;

            }
            currentPizzaLabel.setText("Pizza#: "+currentPizza);

            listIngredientsLabel.setText(makeIngredientList());

        }

    }
    public void leftPizzaClicked(){
        if(pizzaArray.size() == 0){

        }else{
            currentPizza = currentPizza-1;
            if(currentPizza < 0){
                currentPizza = pizzaArray.size()-1;

            }
            currentPizzaLabel.setText("Pizza#: "+currentPizza);
            listIngredientsLabel.setText(makeIngredientList());

        }

    }
    public void newPizzaButtonClicked(){

        PizzaObject myPizza = new PizzaObject();
        pizzaArray.add(myPizza);
        currentPizza=pizzaArray.size()-1;
        currentPizzaLabel.setText("Pizza#: "+currentPizza);
        listIngredientsLabel.setText(makeIngredientList());

    }



    public void switchToReceiptPage() throws IOException {
        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/ConfirmingOrdersPage.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();

        ArrayList<ArrayList> userData = new ArrayList<ArrayList>();
        userData.add(pizzaArray);
        userData.add(drinkArray);
        stage.setUserData(userData);




        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/Receipt Page.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }









    public void switchToOrderView1() throws IOException {

        if(pizzaArray.size()==0){
            warningLabel1.setText("please add a pizza to the order");
        }else{
            root = FXMLLoader.load(getClass().getResource("/FXMLfiles/OrderView1.fxml"));
            stage = (Stage)((Node)IDLabel).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }



    }
    public void switchToOrderView2() throws IOException {

        if(pizzaArray.get(currentPizza).getSize()==""){
            warningLabel2.setText("please select an option");
        }else{
            root = FXMLLoader.load(getClass().getResource("/FXMLfiles/OrderView2.fxml"));
            stage = (Stage)((Node)IDLabel).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }

    }
    public void switchToOrderView3() throws IOException {

        if(pizzaArray.get(currentPizza).getCrustType()==""){
            warningLabel3.setText("please select an option");
        }else{
            root = FXMLLoader.load(getClass().getResource("/FXMLfiles/OrderView3.fxml"));
            stage = (Stage)((Node)IDLabel).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        }



    }








    public void switchToConfirmDrink() throws IOException{

        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/ConfirmingOrdersPage2.fxml"));
        stage = (Stage)((Node)IDLabel).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }


    public String makeIngredientListDrink(){

        String ingredientString="";

        if(drinkArray.get(currentDrink).getSize()==""){
            return"No Flavors/Sizes Selected!";
        }else{
            ingredientString=ingredientString+(drinkArray.get(currentDrink).getSize())+"\n";
            ingredientString=ingredientString+(drinkArray.get(currentDrink).getFlavor())+"\n";


        }
        return ingredientString;
    }








    public void switchToDrinkView() throws IOException{

        if(drinkArray.size()==0){
            warningLabelConfirmDrink.setText("please add a drink to the order");
        }else{
            root = FXMLLoader.load(getClass().getResource("/FXMLfiles/DrinkView.fxml"));
            stage = (Stage)((Node)IDLabelDrink).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        }
    }
    public void rightDrinkClicked(){
        if(drinkArray.size() == 0){

        }else{
            currentDrink = currentDrink +1;
            if(currentDrink > drinkArray.size()-1){
                currentDrink = 0;

            }
            currentDrinkLabel.setText("Drink#: "+currentDrink);

            listIngredientsLabelDrink.setText(makeIngredientListDrink());

        }

    }
    public void leftDrinkClicked(){
        if(drinkArray.size() == 0){

        }else{
            currentDrink = currentDrink-1;
            if(currentDrink < 0){
                currentDrink = drinkArray.size()-1;

            }
            currentDrinkLabel.setText("Pizza#: "+currentDrink);
            listIngredientsLabelDrink.setText(makeIngredientListDrink());

        }

    }
    public void newDrinkButtonClicked(){

        DrinkObject myDrink = new DrinkObject();
        drinkArray.add(myDrink);
        currentDrink=drinkArray.size()-1;
        currentDrinkLabel.setText("Drink#: "+currentDrink);
        listIngredientsLabelDrink.setText(makeIngredientListDrink());

    }



    public void switchToConfirmingOrdersPageFromDrink() throws IOException {

        root = FXMLLoader.load(getClass().getResource("/FXMLfiles/ConfirmingOrdersPage.fxml"));
        stage = (Stage)((Node)IDLabelDrink).getScene().getWindow();
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
