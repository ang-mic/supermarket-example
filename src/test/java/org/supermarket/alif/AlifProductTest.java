package org.supermarket.alif;


import org.junit.Test;
import supermarket_SW.Product;
import supermarket_SW.ProductList;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.*;


import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

public class AlifProductTest {

//    @Test
//    public void saveProductToTextFile() {
//        AlProduct testProduct = new AlProduct("product_1", "category_1", new Date(), "image/path", 10.0, 0.2, 50.0, 10,
//                                              100, 5);
//
//        File productsNamesfile = new File("product_identifiers.txt");
//        testProduct.saveDetails(true);
//        testProduct.saveIdentifier(productsNamesfile, true);
//    }

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

//    @Test
//    public void deleteProductFromFile() {
//        AlProduct testProduct = new AlProduct("product_to_be_deleted", "category_1", new Date(), "image/path", 10.0,
//                                              0.2, 50.0, 10, 100, 5);
//        testProduct.saveDetails(true);
//        testProduct.saveIdentifier(new File("product_identifiers.txt"), true);
//        testProduct.deleteDetails();
//    }

//    @Test
//    public void editProductInFile() {
//        AlProduct testProduct = new AlProduct();
//        testProduct.loadDetails("product_1_1481379668885");
//        testProduct.setName("TEST");
//        testProduct.updateDetails();
//    }

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


//    @Test
//    public void performUpdate() {
//        AlProductList products = new AlProductList();
//
//        AlProduct testProduct = new AlProduct("product_to_be_deleted", "category_1", new Date(), "image/path",
//                                               10.0,
//                                               0.2, 50.0, 10, 100, 5);
//        products.addNewProduct(testProduct);
//        testProduct.setName("BLABLA");
//        testProduct.updateDetails();
//
//    }

    @Test
    public void userUtilClass() {
        AlUtil util = AlUtil.getInstance().setPropertiesFile("config_test.properties");
        System.out.println(util.getProductsFilePath());
        System.out.println(util.getProductsIdsFilePath());
    }


    @Test
    public void loadProductById() {
        AlUtil util   = AlUtil.getInstance();
        util.setPropertiesFile("config_test.properties");
        String testId = "test_product_1_0001";

        AlProduct testProduct = new AlProduct();
        testProduct.loadDetails(testId, util.getProductsFilePath());

        assertTrue("It was: " + testProduct.getId() + " expected: " + testId, testProduct.getId()
                                                                                         .equals(testId));
    }

    @Test
    public void loadAllProducts() {
        AlUtil.getInstance().setPropertiesFile("config_test.properties");

        AlProductList productList = new AlProductList();
        assertTrue(productList.getProducts().size() == 3);
        assertTrue(productList.getProducts().get(0).getId().equals("test_product_1_0001"));
        assertTrue(productList.getProducts().get(1).getId().equals("test_product_2_0002"));
        assertTrue(productList.getProducts().get(2).getId().equals("test_product_3_0003"));
    }

    @Test
    public void addToWishlist() {
        AlWishList wishList = new AlWishList("Alif");
        AlProduct testProduct1 = new AlProduct("product_to_be_deleted", "category_1", new Date(), "image/path", 10.0,
                                               0.2, 50.0, 10, 100, 5);
        wishList.addNewProduct(testProduct1);
    }

    @Test
    public void loadWishlist() {
        AlWishList wishList = new AlWishList("Alif");
        wishList.getProducts().forEach(p -> System.out.println(p.toString()));
        AlProduct p = new AlProduct();
        p.setId("product_to_be_deleted_1481563921485565433");
        wishList.removeProduct(p);
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
