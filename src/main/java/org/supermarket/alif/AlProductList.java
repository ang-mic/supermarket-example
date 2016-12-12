package org.supermarket.alif;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlProductList {

    //TODO: Get them from Resources
    //TODO: Hardcode the paths for Al
    protected String PRODUCTS_FILE_PATH;
    protected String IDENTIFIERS_FILE_PATH;
    protected List<AlProduct> products;

    public AlProductList() {
        PRODUCTS_FILE_PATH    = AlUtil.getInstance().getProductsFilePath();
        IDENTIFIERS_FILE_PATH = AlUtil.getInstance().getProductsIdsFilePath();
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
        newProduct.saveDetails(PRODUCTS_FILE_PATH, true);
        saveIdentifier(newProduct.getId(), true);
        products.add(newProduct);
    }

    /**
     * Removes an existing product from the system.
     */
    public void removeProduct(AlProduct existingProduct) {
        existingProduct.deleteDetails(PRODUCTS_FILE_PATH);
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
    protected List<AlProduct> loadAllProducts() {
        List<AlProduct> products           = new ArrayList<>();
        List<String>    productIdentifiers = loadProductIdentifiers();

        for (String id : productIdentifiers) {
            AlProduct product = new AlProduct();
            product.loadDetails(id, PRODUCTS_FILE_PATH);
            if(id.equals(product.getId())) products.add(product);  // the product only if exists
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
