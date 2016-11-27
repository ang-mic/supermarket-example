
package supermarket_SW;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Angelos
 */
public class Stock {

     //Utility atrribute for date format
    protected static final SimpleDateFormat DMY=new SimpleDateFormat("dd/MM/yyyy");//format

    //Attributes
    private int maxLevel,minLevel,currentQuantity;
    private Order /*estimatedOrder,*/lastOrder;

    //Constructor without parameters
     public Stock(){
        maxLevel=0;
        minLevel=0;
        currentQuantity=0;
        lastOrder = new Order();

    }

    //Constructor with parameters
     public Stock(int maxLevel,int minLevel,int currentQuantity,String orderID,int quantity,float orderCost){
         setMaxLevel(maxLevel);
         setMinLevel(minLevel);
         setCurrentQuantity(currentQuantity);
         setLastOrder(orderID,quantity,orderCost);
     }

     //*************************************************Setter methods**************************************************

     //Set max level
     public final void setMaxLevel(int maxLevel){
        if(maxLevel>0){
            this.maxLevel=maxLevel;
        }
        else{
            JOptionPane.showMessageDialog(null,"Max quantity level of a product in stock should be greater than "
                                            + "'0' and Min quantity level");
        }
     }
     //Set min level
     public final void setMinLevel(int minLevel){
         this.minLevel=minLevel;
         if(minLevel>=0 && minLevel<this.maxLevel){
            this.minLevel=minLevel;
        }
        else{
            JOptionPane.showMessageDialog(null,"Min quantity level of a product in stock should be smaler "
                                          + "Max quantity level");
        }
     }
     //Set min level
     public final void setCurrentQuantity(int currentQuantity){
         if(currentQuantity<=this.maxLevel && currentQuantity>=this.minLevel){
            this.currentQuantity=currentQuantity;
         }
         else{
            JOptionPane.showMessageDialog(null,"Current Quantity should be between Max and Min quantity level");
        }
     }
     //Set estimated order
     public final void setLastOrder(String orderID,int quantity, Float orderCost){
         this.lastOrder=new Order(orderID,quantity,orderCost);
     }

     //*************************************************Getter methods**************************************************

     //Get max level
     public int getMaxLevel(){
         return maxLevel;
     }
     //Get min level
     public int getMinLevel(){
         return minLevel;
     }
     //Get current quantity
     public int getCurrentQuantity(){
         return currentQuantity;
     }
     //Get last order
     public Order getLastOrder(){
         return lastOrder;
     }

     //*************************************************Save methods****************************************************
     public void save(FileWriter saveStock)throws IOException{

            saveStock.append(String.valueOf(getMaxLevel()));
            saveStock.append(System.getProperty("line.separator"));
            saveStock.append(String.valueOf(getMinLevel()));
            saveStock.append(System.getProperty("line.separator"));
            saveStock.append(String.valueOf(getCurrentQuantity()));
            saveStock.append(System.getProperty("line.separator"));
            lastOrder.save(saveStock);

     }

     //*************************************************Load methods****************************************************
     public void load(BufferedReader load) throws IOException, ParseException {
        setMaxLevel(Integer.parseInt(load.readLine()));
        setMinLevel(Integer.parseInt(load.readLine()));
        setCurrentQuantity(Integer.parseInt(load.readLine()));
        lastOrder.load(load);
    }

    //*************************************************display methods**************************************************
     public void display(JTextField currentQuantityTextField,JTextField maxLevelTextField,
                         JTextField minLevelTextField,JTextField lastOrdDateTextField,
                         JTextField lastOrdQuantityTextField,JTextField lastOrdCostTextField){

        currentQuantityTextField.setText(String.valueOf(getCurrentQuantity()));
        maxLevelTextField.setText(String.valueOf(getMaxLevel()));
        minLevelTextField.setText(String.valueOf(getMinLevel()));
        lastOrder.displayLastOrder(lastOrdDateTextField, lastOrdQuantityTextField, lastOrdCostTextField);
     }
}
