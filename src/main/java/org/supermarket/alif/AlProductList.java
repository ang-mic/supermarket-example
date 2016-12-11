package org.supermarket.alif;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlProductList {

    private final static String IDENTIFIERS_FILE_PATH = "product_identifiers.txt";

    private List<AlProduct> products;

    public AlProductList() {
        this.products = loadAllProducts();
    }


    public List<AlProduct> getProducts() {
        return products;
    }

    /**
     * Adds new product to the system. It is an aggregated call of Product.saveDetails(...) and Product.saveIdentifier
     * (...)
     */
    public void addNewProduct(AlProduct newProduct) {
        newProduct.saveDetails(true);
        saveIdentifier(newProduct.getId(), true);
        products.add(newProduct);
    }

    /**
     * Removes an existing product from the system.
     */
    public void removeProduct(AlProduct existingProduct) {
        existingProduct.deleteDetails();
        for(AlProduct p : products) {
            if(p.getId().equals(existingProduct.getId()) ) {
                products.remove(p);
                break;
            }
        }
    }

    /**
     * Loads all the product from the storage (file), this operation relies on the IDs of each product
     *
     * @return the existing Products
     */
    private List<AlProduct> loadAllProducts() {
        List<AlProduct> products           = new ArrayList<>();
        List<String>    productIdentifiers = loadProductIdentifiers();

        for (String id : productIdentifiers) {
            AlProduct product = new AlProduct();
            product.loadDetails(id);
            products.add(product);
        }

        return products;
    }

    /**
     * Loads the Product IDs for the storage (file)
     *
     * @return all the IDs that exist in the system
     */
    private List<String> loadProductIdentifiers() {
        ArrayList<String> identifiers = new ArrayList<>();

        try (Scanner fileIn = new Scanner(new File(IDENTIFIERS_FILE_PATH))) {
            while (fileIn.hasNextLine()) {
                identifiers.add(fileIn.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return identifiers;
    }

    private void saveIdentifier(String productId, boolean append) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(IDENTIFIERS_FILE_PATH, append))) {
            writer.write(productId + "\n");
            writer.flush();
        }
        catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
