/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket_SW;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelos
 */
public class Food extends Product {

    private String country,weightType;
    private float weight;
    private Date expiryDate;

    //Default constructor
    public Food(){
        super();
        country = "";
        weight = 0;
        weightType = "";
        expiryDate = new Date();
    }

    //Constructor with paramiters
    public Food(String name,int ID,String category,float priceWithoutVAT,float VAT,Date expireDate,
                String manufacturerName,String imagePath,int maxLevel,int minLevel,int currentQuantity,String orderID
                ,int quantity,float orderCost,String country,float weight,String weightType){

        super(name, ID, category, priceWithoutVAT, VAT, manufacturerName,
              imagePath, maxLevel, minLevel, currentQuantity, orderID,quantity,orderCost);
        setCountry(country);
        setWeight(weight);
        setWeightType(weightType);
        setExpiryDate(expireDate);

    }

    //*************************************************Setter methods***************************************************

    //set country
    public final void setCountry(String country){
        if(country.matches("[a-zA-Z]+")){
            this.country = country;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide country name");
        }

    }
    //Set weight
    public final void setWeight(float weight){
        this.weight=weight;
        if(weight>0){
            this.weight = weight;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide weight");
        }
    }
    //set weight type
    public final  void setWeightType(String weightType){
        this.weightType = weightType;
    }
     //Set expire date
    public final void setExpiryDate(Date expireDate){
            this.expiryDate=expireDate;
    }

    //*************************************************Getter methods***************************************************

    //get country
    public String getCountry(){
        return country;
    }
    //get weight
    public float getWeight(){
        return weight;
    }
    //get weight type
    public String getWeightType(){
        return weightType;
    }
    //Get expiryDate
    public Date getExpiryDate(){
        return expiryDate;
    }
    /*********************************************Save product in file*************************************************
     *
     *Saves the Food product information to the destination file.
     *
     *******************************************************************************************************************/
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
            saveProductDetails.append(getImage().getDescription());
            saveProductDetails.append(System.getProperty("line.separator"));
            manufacturer.save(saveProductDetails);
            saveProductDetails.append(String.valueOf(getPriceWithoutVAT()));
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(String.valueOf(getVAT()));
            saveProductDetails.append(System.getProperty("line.separator"));
            //stockInfo.save("stock.txt");
            saveProductDetails.append(getCountry());
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(String.valueOf(getWeight()));
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(getWeightType());
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(DMY.format(getExpiryDate()));
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
     *Loads Food details from the text file
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
                   setCountry(bin.readLine());
                   setWeight(Float.valueOf(bin.readLine()));
                   setWeightType(bin.readLine());
                   setExpiryDate((Date)DMY.parse(bin.readLine()));
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
    public void display(JTextField categoryTextField,JTextField productNameTextField,
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
                                        JTextField guaranteeTextField){

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

        countryTextField.setText(getCountry());
        weightTextField.setText(String.valueOf(getWeight()));
        weightTypeLabel.setText(getWeightType());
        expiryDateTextField.setText(DMY.format(expiryDate));
    }


}
