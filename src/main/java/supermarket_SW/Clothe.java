/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket_SW;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelos
 */
public class Clothe extends Product {
    private String brand;
    private String gender;
    private String colour;
    private String sizeRange;

    //Default constructor
    public Clothe() {
        super();
        brand="";
        gender="";
        colour="";
        sizeRange="";
    }
    //Constructor with parameters
    public Clothe(String name, int ID, String category, float priceWithoutVAT,float VAT, String manufacturerName,
                 String imagePath,int maxLevel, int minLevel, int currentQuantity, String orderID,int quantity,float orderCost,
                 String brand, String gender, String colour, String sizeRange){

        super(name, ID, category, priceWithoutVAT, VAT, manufacturerName,
              imagePath, maxLevel, minLevel, currentQuantity, orderID,quantity,orderCost);
        setBrand(brand);
        setGender(gender);
        setColour(colour);
        setSizeRange(sizeRange);
    }

    //*************************************************Setter methods***************************************************

    public final void setBrand(String brand) {
        if(brand.matches("[a-zA-Z]+")){
           this.brand=brand;
        }
        else{
            this.brand="-";
        }
    }

    public final void setGender(String gender) {
        if(gender.matches("[a-zA-Z]+")){
            this.gender=gender;
        }
        else{
            this.gender="-";
        }
    }

    public final void setColour(String colour) {
        if(colour.matches("[a-zA-Z]+")){
            this.colour=colour;
        }
        else{
            this.colour="-";
        }
    }

    public final void setSizeRange(String sizeRange) {
        this.sizeRange = sizeRange;
    }
    //*************************************************Getter methods***************************************************

    public String getBrand() {
        return brand;
    }

    public String getGender() {
        return gender;
    }

    public String getColour() {
        return colour;
    }

    public String getSizeRange() {
        return sizeRange;
    }
    /*********************************************Save product in file*************************************************
    *
    *Saves the Clothe product information to the destination file.
    *
    ******************************************************************************************************************/
    @Override
    public void save(String fileName){
        FileWriter saveProductDetails = null;

        try{
            saveProductDetails = new FileWriter(fileName,true);
            saveProductDetails.append(getName());
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(String.valueOf(getID()));
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(getCategory());
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(getImage().toString());
            saveProductDetails.append(System.getProperty("line.separator"));
            manufacturer.save(saveProductDetails);
            saveProductDetails.append(String.valueOf(getPriceWithoutVAT()));
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(String.valueOf(getVAT()));
            saveProductDetails.append(System.getProperty("line.separator"));
             saveProductDetails.append(getBrand());
            saveProductDetails.append(System.getProperty("line.separator"));
             saveProductDetails.append(getGender());
            saveProductDetails.append(System.getProperty("line.separator"));
             saveProductDetails.append(getColour());
            saveProductDetails.append(System.getProperty("line.separator"));
             saveProductDetails.append(getSizeRange());
            saveProductDetails.append(System.getProperty("line.separator"));
            stockInfo.save(saveProductDetails);
            saveProductDetails.append("$$$$$$");
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.close();
            saveProductDetails = null;

        }//end try
        catch (IOException ioe){}//end catch
    }//end save method

    /****************************Load details***********************************
     *
     *Loads ElectricalGoods details from the text file
     *
     **************************************************************************/
    @Override
    public void load(String keyWord, String fileName){
       FileReader loadDetails;
       String record;
       try{
           loadDetails=new FileReader(fileName);
           BufferedReader bin=new BufferedReader(loadDetails);
           while (((record=bin.readLine()) != null)){
               if ((record).contentEquals(keyWord)){
                   setName(record);
                   setID(Integer.valueOf(bin.readLine()));
                   setCategory(bin.readLine());
                   setImage(bin.readLine());
                   manufacturer.load(bin);
                   setPriceWithoutVAT(Float.valueOf(bin.readLine()));
                   setVAT(Float.valueOf(bin.readLine()));
                   //stockInfo.load() not clear how to implement this method yet
                   setBrand(bin.readLine());
                   setGender(bin.readLine());
                   setColour(bin.readLine());
                   setSizeRange(bin.readLine());
                   stockInfo.load(bin);
               }//end if
           }//end while
       bin.close();
       }//end try
       catch (IOException ioe){}//end catch
       catch (ParseException ex) {
                       Logger.getLogger(Product.class.getName()).log(Level.SEVERE, null, ex);
       }
    }

    @Override
    public void display(javax.swing.JTextField categoryTextField,javax.swing.JTextField productNameTextField,
                                        javax.swing.JTextField IDTextField,javax.swing.JTextField manufaturerTextField,
                                        javax.swing.JTextField retailPriceTextField,javax.swing.JTextField costPriceTextField,
                                        javax.swing.JTextField vatTextField,javax.swing.JLabel productImgLabel,
                                        javax.swing.JTextField currentQuantityTextField,javax.swing.JTextField maxLevelTextField,
                                        javax.swing.JTextField minLevelTextField,javax.swing.JTextField lastOrdDateTextField,
                                        javax.swing.JTextField lastOrdQuantityTextField,javax.swing.JTextField lastOrdCostTextField,

                                        javax.swing.JTextField countryTextField,javax.swing.JTextField weightTextField,
                                        javax.swing.JLabel weightTypeLabel,javax.swing.JTextField expiryDateTextField,

                                        javax.swing.JTextField titleTextField,
                                        javax.swing.JTextField authorTextField,javax.swing.JTextField isbnTextField,
                                        javax.swing.JTextField languageTextField,javax.swing.JTextField editionTextField,
                                        javax.swing.JTextField numberOfPagesTextField,

                                        javax.swing.JTextField clotheBrandTextField,
                                        javax.swing.JTextField genderTextField,javax.swing.JTextField colourTextField,
                                        javax.swing.JTextField sizeRangeTextField,

                                        javax.swing.JTextField electricalBrandTextField,
                                        javax.swing.JTextField guaranteeTextField){

        categoryTextField.setText(getCategory());
        productNameTextField.setText(getName());
        IDTextField.setText(String.valueOf(getID()));
        getManufacturer().display(manufaturerTextField);
        retailPriceTextField.setText(String.valueOf(priceWithVAT()));
        costPriceTextField.setText(String.valueOf(getPriceWithoutVAT()));
        vatTextField.setText(String.valueOf(getVAT()));
        productImgLabel.setIcon(getImage());
        stockInfo.display(currentQuantityTextField, maxLevelTextField, minLevelTextField, lastOrdDateTextField,
                          lastOrdQuantityTextField, lastOrdCostTextField);

        clotheBrandTextField.setText(getBrand());
        genderTextField.setText(getGender());
        colourTextField.setText(getColour());
        sizeRangeTextField.setText(getSizeRange());
    }

}
