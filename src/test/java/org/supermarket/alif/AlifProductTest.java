package org.supermarket.alif;


import org.junit.Test;

import java.io.*;


import static org.junit.Assert.assertTrue;

public class AlifProductTest {

    @Test
    public void saveProductToTextFile() {
        AlProduct testProduct = new AlProduct("product_1", "category_1", "01/01/2016", "image/path", 10.0, 0.2,
                                              50.0, 10, 100, 5);

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
        testProduct.loadDetails(file, "product_1_1481215698275");
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
