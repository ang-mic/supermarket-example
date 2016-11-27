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
public class Book extends Product {
    private String title,author,isbn,language;
    private Integer edition,numberOfPages;

    //Defualt constructor
    public Book(){
        super();
        this.title="";
        this.author="";
        this.edition=0;
        this.isbn="";
        this.language="";
        this.numberOfPages=0;
    }

    //Constructor with parameters

    public Book(String name, int ID, String category, float priceWithoutVAT,float VAT, String manufacturerName,String imagePath,
                int maxLevel, int minLevel, int currentQuantity, String orderID,int quantity,float orderCost,
                String title,String author, String isbn,
                String language, Integer edition, Integer numberOfPages){

        super(name, ID, category, priceWithoutVAT, VAT, manufacturerName,
              imagePath, maxLevel, minLevel, currentQuantity, orderID,quantity,orderCost);
        setTitle(title);
        setAuthor(author);
        setIsbn(isbn);
        setLanguage(language);
        setEdition(edition);
        setNumberOfPages(numberOfPages);
    }

    //*************************************************Setter methods***************************************************
    //set title
    public void setTitle(String title){
        if(!title.equals("")){
           this.title=title;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide book Title");
        }
    }
    //Set author
    public void setAuthor(String author){

        if(!author.matches("[0-9]+")){
            this.author=author;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide Author name");
        }
    }
     //set isbn
    public void setIsbn(String isbn){
        if(!isbn.equals("")){
           this.isbn=isbn;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide book isbn");
        }
    }
    //set language
    public void setLanguage(String language){
        if(language.matches("[a-zA-Z]+")){
            this.language=language;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide book language");
        }
    }
    //set edition
    public void setEdition(Integer edition){
        if(edition>0){
            this.edition=edition;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide book edition");
        }
    }
    //set number of pages
    public void setNumberOfPages(Integer numberOfPages){
        if(numberOfPages>0){
            this.numberOfPages=numberOfPages;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide book number of pages");
        }
    }

    //*************************************************Getter methods***************************************************

    public String getTitle(){
        return title;
    }
    public String getAuthor(){
        return author;
    }
    public String getIsbn(){
        return isbn;
    }
    public String getLanguage(){
        return language;
    }
    public Integer getEdition(){
        return edition;
    }
    public Integer getNumberOfPages(){
        return numberOfPages;
    }

    /**********************************************Save product in file*************************************************
    *
    *Saves the Food product information to the destination file.
    *
    *******************************************************************************************************************/
    @Override//the the full details in the code
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
            saveProductDetails.append(getTitle());
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(getAuthor());
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(getIsbn());
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(getLanguage());
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(String.valueOf(getEdition()));
            saveProductDetails.append(System.getProperty("line.separator"));
            saveProductDetails.append(String.valueOf(getNumberOfPages()));
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
     *Loads Book details from the text file
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
                   setTitle(bin.readLine());
                   setAuthor(bin.readLine());
                   setIsbn(bin.readLine());
                   setLanguage(bin.readLine());
                   setEdition(Integer.valueOf(bin.readLine()));
                   setNumberOfPages(Integer.valueOf(bin.readLine()));
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

        titleTextField.setText(getTitle());
        authorTextField.setText(getAuthor());
        isbnTextField.setText(getIsbn());
        languageTextField.setText(getLanguage());
        editionTextField.setText(String.valueOf(getEdition()));
        numberOfPagesTextField.setText(String.valueOf(getNumberOfPages()));
    }
}
