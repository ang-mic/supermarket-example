/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket_SW;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Angelos
 */
public class ProductList {

    //Utility atrribute for JList model
    protected DefaultListModel listModel = new DefaultListModel();

    /****************************Attributes declaration************************/
    protected ArrayList<Product> products;
    /****************************Constructor**********************************/
    //Default constructor
    public ProductList() {
        products=new ArrayList<Product>();
    }

    //Constructor with parameters
    public ProductList(ArrayList<Product> products) {
        setProducts(products);
    }

    /****************************Setter method**********************************/
    public final void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    /****************************Getter method**********************************/
    public ArrayList<Product> getProducts() {
        return products;
    }

    /*****************************Other Methods********************************/

    /********************************Add Products******************************
    * The addNew....Product methods is responsible to create and then add product
    * object into the product list
    ***************************************************************************/

    /*********************************************Add new Food Product*************************************************/
    public void addNewFoodProduct(String name,int ID,String category,float priceWithoutVAT,float VAT,Date expiryDate,
                   String manufacturerName,String imagePath,int maxLevel,int minLevel,int currentQuantity,String orderID,
                   int quantity,float orderCost,String country,float weight,String weightType){

            Food newFoodProduct = new Food(name, ID, category, priceWithoutVAT, VAT, expiryDate, manufacturerName,
                                           imagePath, maxLevel, minLevel, currentQuantity, orderID,quantity,orderCost,
                                           country,weight, weightType);

            //newFoodProduct.save("foodProducts.txt");//Save product to the file.
           //newFoodProduct.saveProductName("foodProductNames.txt");//Save products names to a file.
            newFoodProduct.register("foodProducts.txt","foodProductNames.txt");


            products.add(newFoodProduct);//Add product to the ArrayList
        }

    /*********************************************Add new Food Product*************************************************/
    public void addNewBookProduct(String name,int ID,String category,float priceWithoutVAT,float VAT,
                   String manufacturerName,String imagePath,int maxLevel,int minLevel,int currentQuantity,String orderID,
                   int quantity,float orderCost,String title,String author,String isbn,String language,Integer edition,
                   Integer numberOfPages){

        Book newBookProduct = new Book(name, ID, category, priceWithoutVAT, VAT, manufacturerName, imagePath, maxLevel,
                                       minLevel, currentQuantity, orderID, quantity,orderCost,title, author, isbn,language,
                                       edition, numberOfPages);

        //newBookProduct.save("bookProducts.txt");//Save product to the file
        //newBookProduct.saveProductName("bookProductNames.txt");//Save products names to a file.
        newBookProduct.register("bookProducts.txt", "bookProductNames.txt");


        products.add(newBookProduct);//Add product to the ArrayList
    }

    /*********************************************Add new Food Product*************************************************/
    public void addNewClotheProduct(String name,int ID,String category,float priceWithoutVAT,float VAT,
                   String manufacturerName,String imagePath,int maxLevel,int minLevel,int currentQuantity,String orderID,
                   int quantity,float orderCost,String brand, String gender, String colour, String sizeRange){

        Clothe newClotheProduct = new Clothe(name, ID, category, priceWithoutVAT, VAT, manufacturerName, imagePath, maxLevel,
                                             minLevel, currentQuantity, orderID, quantity, orderCost, brand, gender, colour, sizeRange);

        //newClothProduct.save("clothProducts.txt");//Save product to the file
        //newClothProduct.saveProductName("clothProductNames.txt");//Save products names to a file.
        newClotheProduct.register("clotheProducts.txt", "clotheProductNames.txt");

        products.add(newClotheProduct);//Add product to the ArrayList
    }

    /*********************************************Add new Food Product*************************************************/
    public void addNewElectricalProduct(String name,int ID,String category,float priceWithoutVAT,float VAT,
                   String manufacturerName,String imagePath,int maxLevel,int minLevel,int currentQuantity,String orderID,
                   int quantity,float orderCost,String brand,Integer guaranteeInMonths){

        ElectricalGood newElectricalProduct = new ElectricalGood(name, ID, category, priceWithoutVAT, VAT, manufacturerName,
                                                                 imagePath, maxLevel, minLevel, currentQuantity, orderID,
                                                                 quantity,orderCost,brand, guaranteeInMonths);

        //newElectricalProduct.save("electricalProducts.txt");//Save product to the file
        //newElectricalProduct.saveProductName("electricalProductNames.txt");//Save products names to a file.
        newElectricalProduct.register("electricalProducts.txt", "electricalProductNames.txt");

        products.add(newElectricalProduct);//Add product to the ArrayList
    }

    /**********************************************Add existing product*************************************************
    * This method can be used if the Product object is created already in another class
    *******************************************************************************************************************/

    //Add existing Food product
    public void addProduct(Product existingProduct){
        products.add(existingProduct);
    }

    /************************************************Load method*******************************************************/
    //This method put every food product name from the text file to an ArrayList slot.
    private ArrayList<String> loadFoodNames(){

        //Create an ArrayList to store the lines from text file
        ArrayList<String> foodNamesList = new ArrayList<String>();

        try{
            //Read food products names
            FileReader loadFoodNames=new FileReader("foodProductNames.txt");
            BufferedReader bin=new BufferedReader (loadFoodNames);
            String record;
            while(((record=bin.readLine()) != null)){//Read the file and store it into the ArrayList line by line*
                foodNamesList.add(record);
            }//end 1st while
            bin.close();//close BufferedReader
            bin=null;//delete BufferedReader from memory
            loadFoodNames=null;//delete FileReader from memory
            record=null;//delete String from memory
            }//end try
            catch (IOException ioe) {}//end catch
            return foodNamesList;//Return the ArrayList
    }

    //This method put every book product name from the text file to an ArrayList slot.
    private ArrayList<String> loadBookNames(){

        //Create an ArrayList to store the lines from text file
        ArrayList<String> bookNamesList = new ArrayList<String>();

        try{
            //Read food products names
            FileReader loadBookNames=new FileReader("bookProductNames.txt");
            BufferedReader bin=new BufferedReader (loadBookNames);
            String record;
            while(((record=bin.readLine()) != null)){//Read the file and store it into the ArrayList line by line*
                bookNamesList.add(record);
            }//end 1st while
            bin.close();//close BufferedReader
            bin=null;//delete BufferedReader from memory
            loadBookNames=null;//delete FileReader from memory
            record=null;//delete String from memory
            }//end try
            catch (IOException ioe) {}//end catch
            return bookNamesList;//Return the ArrayList
    }

    //This method put every clothe product name from the text file to an ArrayList slot.
    private ArrayList<String> loadClotheNames(){

        //Create an ArrayList to store the lines from text file
        ArrayList<String> clotheNamesList = new ArrayList<String>();

        try{
            //Read food products names
            FileReader loadClotheNames=new FileReader("clotheProductNames.txt");
            BufferedReader bin=new BufferedReader (loadClotheNames);
            String record;
            while(((record=bin.readLine()) != null)){//Read the file and store it into the ArrayList line by line*
                clotheNamesList.add(record);
            }//end 1st while
            bin.close();//close BufferedReader
            bin=null;//delete BufferedReader from memory
            loadClotheNames=null;//delete FileReader from memory
            record=null;//delete String from memory
            }//end try
            catch (IOException ioe) {}//end catch
            return clotheNamesList;//Return the ArrayList
    }

    //This method put every electrical good product name from the text file to an ArrayList slot.
    private ArrayList<String> loadElectricalNames(){

        //Create an ArrayList to store the lines from text file
        ArrayList<String> electricalNamesList = new ArrayList<String>();

        try{
            //Read food products names
            FileReader loadElectricalNames=new FileReader("electricalProductNames.txt");
            BufferedReader bin=new BufferedReader (loadElectricalNames);
            String record;
            while(((record=bin.readLine()) != null)){//Read the file and store it into the ArrayList line by line*
                electricalNamesList.add(record);
            }//end 1st while
            bin.close();//close BufferedReader
            bin=null;//delete BufferedReader from memory
            loadElectricalNames=null;//delete FileReader from memory
            record=null;//delete String from memory
            }//end try
            catch (IOException ioe) {}//end catch
            return electricalNamesList;//Return the ArrayList
    }

    /*************************************************Load products in list*********************************************
     * Loads all the existing products in an ArrayList,that happens when the application starts.
     ******************************************************************************************************************/
    public void load(){

        ArrayList<String> foodList =this.loadFoodNames();
        ArrayList<String> bookList = this.loadBookNames();
        ArrayList<String> clotheList = this.loadClotheNames();
        ArrayList<String> electricalList = this.loadElectricalNames();
        //Load all the food products in the products list
        for(int i=0;i<foodList.size();i++){
            Food productFood = new Food();
            productFood.load(foodList.get(i), "foodProducts.txt");
            products.add(productFood);
        }
        //Load all the book products in the products list
        for(int i=0;i<bookList.size();i++){
            Book productBook = new Book();
            productBook.load(bookList.get(i), "bookProducts.txt");
            products.add(productBook);
        }
        //Load all the clothe products in the products list
        for(int i=0;i<clotheList.size();i++){
            Clothe productClothe = new Clothe();
            productClothe.load(clotheList.get(i), "clotheProducts.txt");
            products.add(productClothe);
        }
        //Load all the electrical products in the products list
        for(int i=0;i<electricalList.size();i++){
            ElectricalGood productElectrical = new ElectricalGood();
            productElectrical.load(electricalList.get(i), "electricalProducts.txt");
            products.add(productElectrical);
        }
    }

    //Displays the names of the products which belong to the Food Category.
    public void displayFoodList(JList productDisplayList){

        ArrayList<String> foodNames=loadFoodNames();
        //Display the array to JList
        productDisplayList.setListData(foodNames.toArray());

    }

    //Displays the names of the products which belong to the Book Category.
    public void displayBookList(JList productDisplayList){
        ArrayList<String> bookNames=loadBookNames();
         //Display the array to JList
        productDisplayList.setListData(bookNames.toArray());

    }

    //Displays the names of the products which belong to the Clothe Category.
    public void displayClotheList(JList productDisplayList){
        ArrayList<String> clotheNames=loadClotheNames();

         //Display the array to JList
        productDisplayList.setListData(clotheNames.toArray());
    }

    //Displays the names of the products which belong to the Electrical Good Category.
    public void displayElectricalList(JList productDisplayList){
        ArrayList<String> electricalNames=loadElectricalNames();

        //Display the array to JList
        productDisplayList.setListData(electricalNames.toArray());
    }

    //Search for the product by product name
    public Product search(String name){
        Product product=new Book();
        for(int i=0;i<products.size();i++){
            if(products.get(i).getName().equals(name)){
                product= products.get(i);
            }//end if
        }//end for
        return product;
    }

    public void displaySelctedProduct(JTextField categoryTextField,JTextField productNameTextField,
                                        JTextField IDTextField,JTextField manufaturerTextField,
                                        JTextField retailPriceTextField,JTextField costPriceTextField,
                                        JTextField vatTextField,JLabel productImgLabel,
                                        JTextField currentQuantityTextField,JTextField maxLevelTextField,
                                        JTextField minLevelTextField,JTextField lastOrdDateTextField,
                                        JTextField lastOrdQuantityTextField,JTextField lastOrdCostTextField,

                                        JTextField countryTextField,JTextField weightTextField,
                                        JLabel weightTypeLabel,JTextField expiryDateTextField,

                                        JTextField titleTextField,
                                        JTextField authorTextField,JTextField isbnTextField,
                                        JTextField languageTextField,JTextField editionTextField,
                                        JTextField numberOfPagesTextField,

                                        JTextField clotheBrandTextField,
                                        JTextField genderTextField,JTextField colourTextField,
                                        JTextField sizeRangeTextField,

                                        JTextField electricalBrandTextField,
                                        JTextField guaranteeTextField,String name){



        for(int i=0;i<products.size();i++){
            if(products.get(i).getName().equals(name)){
                products.get(i).display(categoryTextField, productNameTextField, IDTextField, manufaturerTextField,
                        retailPriceTextField, costPriceTextField, vatTextField, productImgLabel, currentQuantityTextField,
                        maxLevelTextField, minLevelTextField, lastOrdDateTextField, lastOrdQuantityTextField,
                        lastOrdCostTextField, countryTextField, weightTextField, weightTypeLabel, expiryDateTextField,
                        titleTextField, authorTextField, isbnTextField, languageTextField, editionTextField, numberOfPagesTextField,
                        clotheBrandTextField, genderTextField, colourTextField, sizeRangeTextField, electricalBrandTextField,
                        guaranteeTextField);
            }//end if
        }//end for
    }

    //Search for an item in the list, by name, and remove it.
    public void removeProduct(String name){
        products.remove(this.search(name));
    }
}
