package org.supermarket.alif;


import org.junit.Test;
import supermarket_SW.ProductList;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AlifProductTest {

    @Test
    public void saveProductToTextFile() {
        AlProduct testProduct = new AlProduct("product_1", "category_1", new Date(), "image/path", 10.0, 0.2, 50.0, 10,
                                              100, 5);

        File productsNamesfile = new File("product_identifiers.txt");
        testProduct.saveDetails(true);
        testProduct.saveIdentifier(productsNamesfile, true);
    }

    @Test
    public void loadSingleProductFromTextFile() {
        AlProduct testProduct = new AlProduct();
        testProduct.loadDetails("product_1_1481372235150");
        System.out.println(testProduct.toString());
    }

    @Test
    public void loadAllProductFromTextFile() {

        AlProductList productList = new AlProductList();

        productList.getProducts()
                   .forEach(p -> System.out.println(p.toString()));
    }

    @Test
    public void formatDate() {
        //TODO: Fix the set method
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/YYYY");
        Date             date        = new Date();
        String           dateStr     = DATE_FORMAT.format(date);

        assertTrue("Must be: " + dateStr, dateStr.equals("10/12/2016"));
    }

    @Test
    public void productCopyConstructor() {
        AlProduct testProduct1 = new AlProduct("product_1", "category_1", new Date(), "image/path", 10.0, 0.2, 50.0, 10,
                                               100, 5);

        AlProduct testProduct2 = new AlProduct(testProduct1);

        assertFalse(testProduct1 == testProduct2); //Check the reference
        assertTrue(testProduct2.getId().equals(testProduct1.getId()));
        assertTrue(testProduct2.getName().equals(testProduct1.getName()));
        assertTrue(testProduct2.getCategory().equals(testProduct1.getCategory()));
        assertTrue(testProduct2.getExpiryDate().equals(testProduct1.getExpiryDate()));
    }

    @Test
    public void loadProperties() throws IOException {
        Properties prop = new Properties();
        prop.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
        String testProp = prop.getProperty("test");
        System.out.println(testProp);
    }

    @Test
    public void addNewProductToSystem() {
        AlProduct testProduct = new AlProduct("product_1", "category_1", new Date(), "image/path", 10.0, 0.2, 50.0, 10,
                                               100, 5);

        AlProductList productList = new AlProductList();
        productList.addNewProduct(testProduct);
        List<AlProduct> products = productList.getProducts();

        assertTrue(products.get(products.size() - 1) == testProduct);
    }

    @Test
    public void removeElement() {
        List<String> tempLines = new ArrayList<>();
        tempLines.add("ok_a");
        tempLines.add("ok_b");
        tempLines.add("ok_c");
        tempLines.add("##");
        tempLines.add("ok_1");
        tempLines.add("ok_2");
        tempLines.add("ok_3");
        tempLines.add("ok_4");
        tempLines.add("ok_5");
        tempLines.add("ok_6");
        tempLines.add("ok_7");
        tempLines.add("##");
        tempLines.add("ok_9");
        tempLines.add("ok_10");
        tempLines.add("ok_11");
        tempLines.add("##");

        //remove
        ListIterator<String> it = tempLines.listIterator();

        while (it.hasNext()) {
            if(it.next().contains("1")) {
                do {
                    it.remove();
                } while(!it.next().equals("##")); //Set the right Product separator
                it.remove();
                break;
            }
        }

        tempLines.forEach(x -> System.out.println(x));
    }

    @Test
    public void deleteProductFromFile() {
        AlProduct testProduct = new AlProduct("product_to_be_deleted", "category_1", new Date(), "image/path", 10.0,
                                              0.2, 50.0, 10, 100, 5);
        testProduct.saveDetails(true);
        testProduct.saveIdentifier(new File("product_identifiers.txt"), true);
        testProduct.deleteDetails();
    }

    @Test
    public void editProductInFile() {
        AlProduct testProduct = new AlProduct();
        testProduct.loadDetails("product_1_1481379668885");
        testProduct.setName("TEST");
        testProduct.updateDetails();
    }

    @Test
    public void removeProductFormSystem() {
        AlProduct testProduct1 = new AlProduct("product_to_be_deleted", "category_1", new Date(), "image/path",
                                               10.0,
                                              0.2, 50.0, 10, 100, 5);
        AlProduct testProduct2 = new AlProduct("product_to_be_deleted", "category_1", new Date(), "image/path",
                                               10.0,
                                              0.2, 50.0, 10, 100, 5);
        AlProduct testProduct3 = new AlProduct("product_to_be_deleted", "category_1", new Date(), "image/path",
                                               10.0,
                                              0.2, 50.0, 10, 100, 5);
        AlProduct testProduct4 = new AlProduct("product_to_be_deleted", "category_1", new Date(), "image/path",
                                               10.0,
                                              0.2, 50.0, 10, 100, 5);
        AlProductList products = new AlProductList();
        products.addNewProduct(testProduct1);
        products.addNewProduct(testProduct2);
        products.addNewProduct(testProduct3);
        products.addNewProduct(testProduct4);

        AlProduct testProduct = new AlProduct(testProduct3);
        products.removeProduct(testProduct);
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
