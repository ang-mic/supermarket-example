/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package supermarket_SW;

import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author Angelos
 */
public class WishList extends ProductList {
    Integer  numberOfProducts;
    Customer listOwner;

    /*****************************************************Constructors*****************************************************/
    public WishList() {
        super();
        numberOfProducts = 0;
        listOwner = null;
    }

    public WishList(Customer listOwner) {
        this();
        this.listOwner = listOwner;
    }

    public WishList(ArrayList<Product> products, Customer listOwner) {
        super(products);
        setNnumberOfProducts();
        setListOwner(listOwner);
    }

    /**********************************************************Setters*****************************************************/
    public final void setNnumberOfProducts() {
        this.numberOfProducts = products.size();
    }

    public final void setListOwner(Customer listOwner) {
        this.listOwner = listOwner;
    }

    /**********************************************************Getters*****************************************************/
    public Integer getNnumberOfProducts() {
        return numberOfProducts;
    }

    public Customer getListOwner() {
        return listOwner;
    }

    /**********************************************************Other Methods***********************************************/

    //Add product to Wish List
    public void add(Product product) {
        products.add(product);
        this.edit();
    }

    //Remove product from Wish List and from the JTable
    public void remove(javax.swing.JTable wishListTable, String name) {
        Product product = search(name);//Frind the product
        products.remove(product);//Remove the product from the basket
        setNnumberOfProducts();
        display(wishListTable);//Refresh basket table
        this.edit();
    }

    //Display the products of the Wish List
    public void display(javax.swing.JTable wishlistTable) {

        String columns[] = {"Name", "Category", "ID", "Retail Price (£)"}; //JTable columns names
        Object data[][]  = new Object[products.size()][columns.length];//Table dimensions

        for (int i = 0; i < data.length; i++) {
            data[i][0] = products.get(i)
                                 .getName();
            data[i][1] = products.get(i)
                                 .getCategory();
            data[i][2] = products.get(i)
                                 .getID();
            data[i][3] = products.get(i)
                                 .priceWithVAT();
        }
        DefaultTableModel model = new DefaultTableModel(data, columns);//Set table model
        wishlistTable.setModel(model);//add model to JTable
    }

    //Remove product from Wish List
    public void clearAll(javax.swing.JTable wishListTable) {
        products.clear();//Clear products from Basket
        String columns[] = {"Name", "Category", "ID", "Retail Price (£)"}; //JTable columns names

        DefaultTableModel model = new DefaultTableModel(columns, 0);//Set the new table model
        //model.setRowCount(0);//Empty model
        wishListTable.setModel(model);//Set empty table

        this.edit();
    }

    public void save() {
        FileWriter addCustomerDetails = null;
        String     filePath           = "Wish Lists" + "/" + listOwner.getUsername() + "WishList.txt";
        try {
            addCustomerDetails = new FileWriter(filePath, true);
            addCustomerDetails.append(listOwner.getUsername());
            addCustomerDetails.append(System.getProperty("line.separator"));
            for (int i = 0; i < products.size(); i++) {
                addCustomerDetails.append(products.get(i)
                                                  .getName());
                addCustomerDetails.append(System.getProperty("line.separator"));
            }
            addCustomerDetails.close();
            addCustomerDetails = null;
        }//end try
        catch (IOException ioe) {
        }//end catch
    }

    public void load(String keyWord) {
        String             filePath = "Wish Lists" + "/" + keyWord + "WishList.txt";
        FileReader         loadDetails;
        String             record;
        ArrayList<Product> wishList = new ArrayList<Product>();

        try {
            loadDetails = new FileReader(filePath);
            BufferedReader bin = new BufferedReader(loadDetails);
            while (((record = bin.readLine()) != null)) {
                if ((record).contentEquals(keyWord)) {
                    while ((record != null)) {
                        //Search the product from the ProductList and add it to the LishList
                        wishList.add(MainFrame.allProducts.search(record = bin.readLine()));
                    }//end while
                }//end if
            }//end while
            bin.close();
        }//end try
        catch (IOException ioe) {
        }//end catch
        this.setProducts(wishList);//Put the items in the ArryList of the WishList
    }

    //Apply all the changes to wish list from the gui to the text file
    public void edit() {
        FileWriter addCustomerDetails = null;
        String     filePath           = "Wish Lists" + "/" + listOwner.getUsername() + "WishList.txt";
        try {
            addCustomerDetails = new FileWriter(filePath, false);
            addCustomerDetails.append(listOwner.getUsername());
            addCustomerDetails.append(System.getProperty("line.separator"));
            for (int i = 0; i < products.size(); i++) {
                addCustomerDetails.append(products.get(i)
                                                  .getName());
                addCustomerDetails.append(System.getProperty("line.separator"));
            }
            addCustomerDetails.close();
            addCustomerDetails = null;
        }//end try
        catch (IOException ioe) {
        }//end catch
    }
}
