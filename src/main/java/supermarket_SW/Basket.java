/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket_SW;

import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

/**
 *
 * @author Angelos
 */
public class Basket extends ProductList{

    private int numberOfItems,numberOfDifferentItems;
    private double totalCost;
    private ArrayList<Integer> productsQuantities;

/*****************************************************Constructors*****************************************************/
    public Basket(){
        super();
        numberOfItems=0;
        numberOfDifferentItems=0;
        totalCost=0;
        productsQuantities=new ArrayList<Integer>();
    }

    public Basket(ArrayList<Product> products,ArrayList<Integer> productsQuantities) {
        super(products);
        setNumberOfItems();
        setNumberOfDifferentItems();
        setTotalCost();
        setProductsQuantities(productsQuantities);
    }
/*******************************************************Setters********************************************************/
    public final void setNumberOfItems() {
        numberOfItems=0;
        for(int i=0;i<productsQuantities.size();i++){
            numberOfItems=productsQuantities.get(i)+numberOfItems;
        }
    }

    public final void setTotalCost() {
        totalCost=0;
        for(int i=0;i<products.size();i++){
            totalCost=totalCost+(products.get(i).priceWithVAT()*productsQuantities.get(i));
        }
    }

    public final void setNumberOfDifferentItems() {
        numberOfDifferentItems=products.size();
    }

    public final void setProductsQuantities(ArrayList<Integer> productsQuantities){
        this.productsQuantities=productsQuantities;
    }
/*******************************************************Getters********************************************************/
    public int getNumberOfItems() {
        return numberOfItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public int getNumberOfDifferentItems() {
        return numberOfDifferentItems;
    }

    public ArrayList<Integer> getProductsQuantities() {
        return productsQuantities;
    }
/*****************************************************Other methods****************************************************/
   //Add product to Basket
    public void add(Product product,Integer quantity){
        products.add(product);
        productsQuantities.add(quantity);
        this.setNumberOfItems();
        this.setNumberOfDifferentItems();
        this.setTotalCost();
    }

   //Remove product from Basket and from the JTable
    public void remove(javax.swing.JTable basketTable,javax.swing.JTextField numberOfItemsTextField,
            javax.swing.JTextField numberOfDifItemsTextField,javax.swing.JTextField totalCostTextField,String name){
        Product product=search(name);//Frind the product
        productsQuantities.remove(products.indexOf(product));//Remove the quantity of the product from the basket
        products.remove(product);//Remove the product from the basket
        this.setNumberOfItems();
        this.setNumberOfDifferentItems();
        this.setTotalCost();
        this.display(basketTable,numberOfItemsTextField,numberOfDifItemsTextField,totalCostTextField);//Refresh basket table
    }

    //Display the products of the Basket
    public void display(javax.swing.JTable basketTable,javax.swing.JTextField numberOfItemsTextField,
            javax.swing.JTextField numberOfDifItemsTextField,javax.swing.JTextField totalCostTextField){

        String columns[] = {"Name","Category","ID","Retail Price (£)","Quantity"}; //JTable columns names
        Object data[][]=new Object[products.size()][columns.length];//Table dimensions

        for(int i=0;i<data.length;i++){
            data[i][0]=products.get(i).getName();
            data[i][1]=products.get(i).getCategory();
            data[i][2]=products.get(i).getID();
            data[i][3]=products.get(i).priceWithVAT();
            data[i][4]=productsQuantities.get(i);

        }
       DefaultTableModel model = new DefaultTableModel(data, columns);//Set table model
       basketTable.setModel(model);//add model to JTable

       numberOfItemsTextField.setText(String.valueOf(getNumberOfItems()));//Display number of items of Basket
       numberOfDifItemsTextField.setText(String.valueOf(getNumberOfDifferentItems()));//Dispaly number of different
       totalCostTextField.setText(String.valueOf(getTotalCost()));//Display total cost
    }

    //Remove product from Basket
    public void clearAll(javax.swing.JTable basketTable){
        products.clear();//Clear products from Basket
        productsQuantities.clear();//Clear quantities from Basket
        String columns[] = {"Name","Category","ID","Retail Price (£)","Quantity"}; //JTable columns names

        DefaultTableModel model = new DefaultTableModel(columns, 0);//Set the new table model
        //model.setRowCount(0);//Empty model
        basketTable.setModel(model);//Set empty table
    }
}
