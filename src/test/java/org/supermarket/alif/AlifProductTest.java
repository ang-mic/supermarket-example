package org.supermarket.alif;


import org.junit.Test;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AlifProductTest {

    @Test
    public void saveProductToTextFile() {
        AlProduct testProduct = new AlProduct("product_1", "category_1", new Date(), "image/path", 10.0, 0.2, 50.0, 10,
                                              100, 5);

        File productsFile      = new File("products.txt");
        File productsNamesfile = new File("product_identifiers.txt");
        testProduct.saveDetails(productsFile, true);
        testProduct.saveProductName(productsNamesfile, true);
    }

    @Test
    public void loadSingleProductFromTextFile() {

        AlProduct testProduct       = new AlProduct();
        File      file              = new File("products.txt");
        File      productsNamesfile = new File("product_identifiers.txt");
        testProduct.loadDetails(file, "product_1_1481304274288");
        System.out.println(testProduct.toString());
    }

    @Test
    public void loadAllProductFromTextFile() {
        File          identifiersFile = new File("product_identifiers.txt");
        File          productsFile    = new File("products.txt");
        AlProductList productList     = new AlProductList(identifiersFile, productsFile);


        productList.getProducts()
                   .forEach(p -> System.out.println(p.toString()));
    }

    @Test
    public void formatDate() {
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/YYYY");
        Date             date        = new Date();
        String           dateStr     = DATE_FORMAT.format(date);

        assertTrue("Must be: " + dateStr, dateStr.equals("09/12/2016"));
    }

    @Test
    public void productCopyConstructor() {
        AlProduct testProduct1 = new AlProduct("product_1", "category_1", new Date(), "image/path", 10.0, 0.2,
                                               50.0, 10,
                                              100, 5);

        AlProduct testProduct2 = new AlProduct(testProduct1);

        assertFalse(testProduct1 == testProduct2); //Check the reference
        assertTrue(testProduct2.getId().equals(testProduct1.getId()));
        assertTrue(testProduct2.getName().equals(testProduct1.getName()));
        assertTrue(testProduct2.getCategory().equals(testProduct1.getCategory()));
        assertTrue(testProduct2.getExpiryDate().equals(testProduct1.getExpiryDate()));
    }

    /*
    * storage
    *   products
    *       product_identifiers.txt
    *       products.txt
    *       wish_list
    *           ...
    *           ...
    *           cust_name_wish_list.txt
    *   people
    *       customers.txt
    *       employees.txt
    *
    * */
}
