
package supermarket_SW;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Angelos
 */
public abstract class Product implements Utilities {
     //Utility atrribute for date format
    protected static final SimpleDateFormat DMY=new SimpleDateFormat("dd/MM/yyyy");//format

    //Attributs
    protected String name,category;
    protected int id;
    protected float priceWithoutVAT,vat;
    protected Manufacturer manufacturer;
    protected ImageIcon    image;
    protected Stock        stockInfo;

    //Constructor without parameters
    public Product(){
        this.name="";
        this.id=0;
        this.category="";
        this.image=new ImageIcon();
        this.manufacturer=new Manufacturer();
        this.priceWithoutVAT=0;
        this.vat=0;
        this.stockInfo=new Stock();
    }

    //Constructor with parameters
    public Product(String name,int ID,String category,float priceWithoutVAT,float VAT,
                   String manufacturerName,String imagePath,int maxLevel,int minLevel,int currentQuantity,String orderID
                   ,int quantity,float orderCost){

        setName(name);
        setID(ID);
        setCategory(category);
        setImage(imagePath);
        setManufacturer( manufacturerName);
        setPriceWithoutVAT( priceWithoutVAT);
        setVAT(VAT);
        setStockInfo( maxLevel, minLevel, currentQuantity, orderID,quantity,orderCost);
    }

    //*************************************************Setter methods***************************************************

    //Set name
    public final void setName(String name){
        if(!name.equals("")){
            this.name=name;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide Product name");
        }
    }

    //Set id
    public final void setID(int ID){
        if(ID>=0){
            this.id=ID;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide product ID");
        }
    }

    //Set category
    public final void setCategory(String category){
        if(category.matches("[a-zA-Z]+")){
            this.category=category;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide category");
        }
    }
    //Set image
    public final void setImage(String imagePath){
        this.image=new ImageIcon(imagePath);
    }

    //Set manufacturer
    public final void setManufacturer(String manufacturerName){
        this.manufacturer=new Manufacturer(manufacturerName);
    }

    //Set price without vat
    public final void setPriceWithoutVAT(float priceWithoutVAT){
        if(priceWithoutVAT>=0){
            this.priceWithoutVAT=priceWithoutVAT;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide product Cost price");
        }

    }

    //Set vat
    public final void setVAT(float VAT){
        this.vat=VAT;
        if(VAT>=0 && VAT<=100){
            this.vat=VAT;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide product VAT");
        }
    }

    //Set stock info
    public final void setStockInfo(int maxLevel,int minLevel,int currentQuantity,String orderID,int quantity,float orderCost){
        this.stockInfo=new Stock(maxLevel, minLevel, currentQuantity, orderID, quantity, orderCost);
    }


    //Get name
    public String getName(){
        return name;
    }
    //Get id
    public int getID(){
        return id;
    }
    //Get category
    public String getCategory(){
        return category;
    }
    //Get image
    public ImageIcon getImage(){
        return image;
    }
    //Get manufacturer
    public Manufacturer getManufacturer(){
        return manufacturer;
    }
    //Get price without vat
    public float getPriceWithoutVAT(){
        return priceWithoutVAT;
    }
    //Get vat
    public float getVAT(){
        return vat;
    }
    //Get stock info
    public Stock getStockInfo(){
        return stockInfo;
    }
    //******************************************Calcualte price with vat methods****************************************
    public float priceWithVAT(){
        float priceWithVat;
        priceWithVat=((vat/100)*priceWithoutVAT)+priceWithoutVAT;
        return priceWithVat;
    }

    /*********************************************Save product in file*************************************************
     *
     *Saves the Product information to the destination file.
     *
     *******************************************************************************************************************/
     public void saveProductName(String fileName){
         FileWriter addProductName = null;
        try{
            addProductName = new FileWriter(fileName,true);
            addProductName.append(getName());
            addProductName.append(System.getProperty("line.separator"));
            addProductName.close();
            addProductName = null;

        }//end try
        catch (IOException ioe){}//end catch
    }

    /*********************************************Register product*****************************************************/
     public void register(String fileNameA,String fileNameB){
         this.save(fileNameA);
         this.saveProductName(fileNameB);
     }

     public abstract void display(JTextField categoryTextField,JTextField productNameTextField,
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
                                        JTextField guaranteeTextField);
}
