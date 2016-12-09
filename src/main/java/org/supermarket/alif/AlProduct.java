package org.supermarket.alif;

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JTextArea;

/**
 * @author Alif
 *         <p>
 *         Refactoring
 *         FIXME: Remove round method, use the Math.round instead
 *         FIXME: Change expiryDate type from String to Date
 *         FIXME: Rename imagePath attribute to imagePath
 *         FIXME: Change the edit(...) to save the product as well, instead of just modify the attributes
 */
public class AlProduct {

    private static final SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/YYYY");

    private String id, name, category, imagePath;
    private double price, priceVAT;
    private double weight;
    private int    stock, minStock, maxStock;
    private Date expiryDate;

    public AlProduct() {
        this.name = "";
        this.id = generateId();
        this.category = "";
        this.expiryDate = new Date();
        this.imagePath = "";
        this.price = 0;
        this.priceVAT = 0;
        this.weight = 0;
        this.stock = 0;
        this.minStock = 0;
        this.maxStock = 0;
    }

    public AlProduct(String name, String category, Date expiryDate, String imagePath, double priceWithoutVAT, double
            VAT, double weight, int stock, int maxStock, int minStock) {
        setName(name);
        setId(generateId());
        setCategory(category);
        setExpiryDate(expiryDate);
        setImagePath(imagePath);
        setPrice(priceWithoutVAT);
        setPriceWVAT(VAT);
        setWeight(weight);
        setStock(stock);
        setMaxStock(maxStock);
        setMinStock(minStock);
    }

    /**
     * This is a COPY constructor, allows you to create a copy of an existing object. It solve the problem with the
     * object reference we saw yesterday
     *
     * @param product
     */
    public AlProduct(AlProduct product) {
        setName(product.getName());
        setId(product.getId());
        setCategory(product.getCategory());
        setExpiryDate(product.getExpiryDate());
        setImagePath(product.getImagePath());
        setPrice(product.getPrice());
        setPriceWVAT(product.getPriceWVAT());
        setWeight(product.getWeight());
        setStock(product.getStock());
        setMaxStock(product.getMaxStock());
        setMinStock(product.getMinStock());
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(double weight) {
        this.weight = Math.round(weight);
    }

    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = new Date(expiryDate.getTime());
    }

    public void setPrice(double price) {
        this.price = Math.round(price);
    }

    public void setPriceWVAT(double priceWVAT) {
        this.priceVAT = Math.round(priceWVAT + (priceWVAT * 0.2));
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    public void setMaxStock(int maxStock) {
        this.maxStock = maxStock;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getWeight() {
        return weight;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public double getPrice() {
        return price;
    }

    public double getPriceWVAT() {
        return priceVAT;
    }

    public int getStock() {
        return stock;
    }

    public int getMinStock() {
        return minStock;
    }

    public void setMinStock(int minStock) {
        this.minStock = minStock;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getMaxStock() {
        return maxStock;
    }

    // public boolean checkForOrder (int inStock, int minQuantity) {
    //         boolean checkForReorder = false;
    //         if (inStock <= minQuantity )
    //         {
    //             checkForReorder = true;DropWizard
    //         }
    //         return checkForReorder;
    //     }

    public void display(JTextArea src) {
        src.append(toString());
    }

    /**
     * It saves the details of the Product into a text file
     * <p>
     * <b>
     * Note_1: I refactored this method. Instead of passing a FileWriter as argument, we pass the destination File
     * and a boolean flag 'append' which indicates if we append or not to the file. The advantage of this
     * implementation is that logic for saving the Product is not encapsulated in this method. We open a
     * BufferedWriter and when it is done, it automatically close itself because it implements the Closable Interface
     * . I will explain it to you in person.
     * </br>
     * </br>
     * Note_2: I believe it is better if you don't save the name of every attribute in the file
     * </b>
     *
     * @param file
     * @param append
     */
    public void saveDetails(File file, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))) {
            writer.write(toString());
            writer.write("\r\nMax. Stock: " + maxStock);
            writer.write("\r\nImage File: " + imagePath);
            writer.write("\r\n###########\r\n");
            writer.flush();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }


    }

    public void edit(String ID, String name, String category, double weight, double price, Date expiryDate, int
            stock, int minStock, int maxStock, String imagePath) {
        setId(ID);
        setName(name);
        setCategory(category);
        setWeight(weight);
        setPrice(price);
        setPriceWVAT(price);
        setExpiryDate(expiryDate);
        setStock(stock);
        setMinStock(minStock);
        setMaxStock(maxStock);
        setImagePath(imagePath);

    }

//    public void getDetails(JTextField ID, JTextField name, JTextField category, JTextField weight, JTextField price,
//                           JTextField expiryDate, JTextField stock, JTextField minStock, JTextField maxStock,
//                           JTextField imagePath) {
//
//        ID.setText(String.valueOf(getId()));
//        name.setText(getName());
//        category.setText(getCategory());
//        weight.setText(String.valueOf(getWeight()));
//        price.setText(String.valueOf(getPrice()));
//        expiryDate.setText(getExpiryDate());
//        stock.setText(String.valueOf(getStock()));
//        minStock.setText(String.valueOf(getMinStock()));
//        maxStock.setText(String.valueOf(getMaxStock()));
//        imagePath.setText(getImagePath());
//    }

    //
    @Override
    public String toString() {
        return "AlProduct id: " + getId() + "\r\n" + "AlProduct Name: " + getName() + "\r\n" + "Category: " +
                getCategory() + "\r\n" + "Weight: " + getWeight() + "\r\n" + "Price (£): " + getPrice() +
                "\r\n" + "Price (incl. VAT): " + getPriceWVAT() + "\r\n" + "Expiry Date: " + DATE_FORMAT.format(
                getExpiryDate()) + "\r\n" + "Stock: " + getStock() + "\r\n" + "Min. Stock: " + getMinStock();
    }


    public void loadDetails(File file, String productId) {

        try (Scanner fileIn = new Scanner(file)) {

            while (fileIn.hasNextLine()) { //TODO: Reduce the iterations

                final String line = fileIn.nextLine();

                if (line.contains(productId)) {
                    this.id = line.substring(16).trim(); //Use the current 'line'
                    this.name = fileIn.nextLine().substring(18);
                    this.category = fileIn.nextLine().substring(10);
                    this.weight = Double.parseDouble(fileIn.nextLine().substring(8));
                    this.price = Double.parseDouble(fileIn.nextLine().substring(11));
                    this.priceVAT = Double.parseDouble(fileIn.nextLine().substring(18));
                    this.expiryDate = DATE_FORMAT.parse(fileIn.nextLine().substring(13));
                    this.stock = Integer.parseInt(fileIn.nextLine().substring(7));
                    this.minStock = Integer.parseInt(fileIn.nextLine().substring(12));
                    this.maxStock = Integer.parseInt(fileIn.nextLine().substring(12));
                    this.imagePath = fileIn.nextLine().substring(12);

                    break; // Allows you to break out of the loop
                }
            }
        }
        catch (FileNotFoundException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void saveProductName(File file, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file, append))) {
            writer.write(id + "\n");
            writer.flush();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    private String generateId() {
        return name + "_" + new Date().getTime();
    }
}