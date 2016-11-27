
package supermarket_SW;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Angelos
 */
public class Order {

    //Utility atrribute for date format
    protected static final SimpleDateFormat DMY=new SimpleDateFormat("dd/MM/yyyy");//format

    //Attributes
    private String orderID;
    private int quantity;
    private Date orderDate/*,deliveryDate*/;
    private float orderCost;
   // private ArrayList<Supplier> suppliers;
   // private Supplier suppliers;

    //Constructor without parameters
     public Order(){
        orderID="";
        quantity=0;
        orderDate=new Date();
        orderCost=0;
        //deliveryDate=new Date();
        //suppliers=new ArrayList<Supplier>();
        //suppliers=new Supplier();
    }

     //Constractor with parameters
     public Order(String orderID,int quantity,float orderCost){
         setOrderID(orderID);
         setQuantity(quantity);
         setOrderCost(orderCost);
         setOrderDate();
        // setDeliveryDate();
         //setSuppliers(suppliers);
     }

     //*************************************************Setter methods**************************************************

     //Set order ID
     public final void setOrderID(String orderID){

         if(!orderID.equals("")){
           this.orderID=orderID;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide Order Id");
        }
     }
     //Set quantity
     public final void setQuantity(int quantity){
        if(quantity>0){
            this.quantity=quantity;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide Order Quantity");
        }
    }

     //Set order date
     public final void setOrderDate(){
          this.orderDate=new Date();
     }
     public void setOrderDate(Date orderDate){
          this.orderDate=orderDate;
     }

     public final void setOrderCost(float orderCost) {
        if(orderCost>=0){
            this.orderCost=orderCost;
        }
        else{
            JOptionPane.showMessageDialog(null,"Invalide Order Cost");
        }
    }

    //*************************************************Getter methods**************************************************

     //Get orderID
     public String getOrderID(){
         return orderID;
     }
     //Get quantity
     public int getQuantity(){
         return quantity;
     }
    //Get order date
     public Date getOrderDate(){
         return orderDate;
     }
     public float getOrderCost() {
        return orderCost;
    }

     //Get delivery date
//     public Date getDeliveryDate(){
//         return deliveryDate;
//     }

//     //Get suppliers
//     public ArrayList<Supplier> getSuppliers(){
//         return suppliers;
//     }

    //*************************************************Save methods*****************************************************
    public void save(FileWriter saveOrder)throws IOException{

            saveOrder.append(orderID);
            saveOrder.append(System.getProperty("line.separator"));
            saveOrder.append(String.valueOf(quantity));
            saveOrder.append(System.getProperty("line.separator"));
            saveOrder.append(DMY.format(getOrderDate()));
            saveOrder.append(System.getProperty("line.separator"));
            saveOrder.append(String.valueOf(orderCost));
            saveOrder.append(System.getProperty("line.separator"));

     }
     //*************************************************Load methods****************************************************
     public void load(BufferedReader load) throws IOException, ParseException {

                   setOrderID(load.readLine());
                   setQuantity(Integer.parseInt(load.readLine()));
                   setOrderDate((Date)DMY.parse(load.readLine()));
                   setOrderCost(Float.parseFloat(load.readLine()));
    }
    //*******************************************Display last order methods*********************************************
     public void displayLastOrder(JTextField lastOrdDateTextField,JTextField lastOrdQuantityTextField,
                                  JTextField lastOrdCostTextField){
        lastOrdDateTextField.setText(DMY.format(getOrderDate()));
        lastOrdQuantityTextField.setText(String.valueOf(getQuantity()));
        lastOrdCostTextField.setText(String.valueOf(getOrderCost()));
     }
    //*************************************************Cancel methods***************************************************

     //This method put each line of a text fil into an ArrayList of stings
    private ArrayList<String> saveText(){
       FileReader loadDetails = null;
       String record;
        record = null;

       //Create an ArrayList to store the lines from text file
       ArrayList<String> lineKeeper = new ArrayList<String>();

      try{
             loadDetails=new FileReader("orders.txt");
             BufferedReader bin=new BufferedReader (loadDetails);
             record=new String();
             while (((record=bin.readLine()) != null)){//Read the file and store it into the ArrayList line by line*
                 lineKeeper.add(record);
             }//end while
             bin.close();
             bin=null;
      }//end try
      catch (IOException ioe) {}//end catc

      return lineKeeper;
    }


    public void cancel(){
        Integer Pointer=0;
        FileWriter editDetails = null;
        ArrayList<String> lineKeeper = saveText();

        if(lineKeeper.contains(getOrderID())){
            Pointer=lineKeeper.indexOf(getOrderID());
            Pointer=Pointer-1;
            while(!(lineKeeper.get(Pointer).equals("$$$"))){
                lineKeeper.remove(Pointer+1);
            }//end for
        }
        try{
            editDetails= new FileWriter("orders.txt",false);
            for( int i=0;i<lineKeeper.size();i++){
                editDetails.append(lineKeeper.get(i));
                editDetails.append(System.getProperty("line.separator"));
            }//end for
            editDetails.close();
            editDetails = null;
        }//end try
        catch (IOException ioe) {}//end catch
    }
}
