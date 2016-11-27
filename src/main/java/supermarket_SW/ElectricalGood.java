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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Angelos
 */
public class ElectricalGood extends Product{

    private String brand;
    private Integer guaranteeInMonths;

    //Default constructor
    public ElectricalGood() {
        super();
        brand="";
        guaranteeInMonths=0;
    }

    //Constructor with parameters

    public ElectricalGood(String name, int ID, String category,
                         float priceWithoutVAT, float VAT, String manufacturerName,String imagePath,int maxLevel,
                         int minLevel,int currentQuantity,String orderID,int quantity,float orderCost,String brand,
                         Integer guaranteeInMonths) {

        super(name, ID, category, priceWithoutVAT, VAT, manufacturerName,
              imagePath, maxLevel, minLevel, currentQuantity, orderID,quantity,orderCost);
        setBrand(brand);
        setGuaranteeInMonths(guaranteeInMonths);
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

    public final void setGuaranteeInMonths(Integer guaranteeInMonths) {
        this.guaranteeInMonths = guaranteeInMonths;
        if(guaranteeInMonths>=0){
            this.guaranteeInMonths=guaranteeInMonths;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide Guarantee");
        }
    }

    //*************************************************Getter methods***************************************************
    public String getBrand() {
        return brand;
    }

    public Integer getGuaranteeInMonths() {
        return guaranteeInMonths;
    }
    /*********************************************Save product in file*************************************************
    *
    *Saves the ElectricalGood product information to the destination file.
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
            saveProductDetails.append(String.valueOf(getGuaranteeInMonths()));
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
                   setGuaranteeInMonths(Integer.valueOf(bin.readLine()));
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

        electricalBrandTextField.setText(getBrand());
        guaranteeTextField.setText(String.valueOf(getGuaranteeInMonths()));
    }
}
