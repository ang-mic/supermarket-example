package org.supermarket.alif;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AlProductList {

    private List<String>    ids;
    private List<AlProduct> products;

    public AlProductList(File identifiersFile, File productsFile) {
        this.ids = loadProductIdentifiers(identifiersFile);
        this.products = loadAllProducts(productsFile);
    }

    //No need to use this outside of the class
    //    public List<String> getIds() {
    //        return ids;
    //    }

    public List<AlProduct> getProducts() {
        return products;
    }

    public List<AlProduct> loadAllProducts(File productsFile) {
        List<AlProduct> products = new ArrayList<>();
        for (String id : this.ids) {
            AlProduct product = new AlProduct();
            product.loadDetails(productsFile, id);
            products.add(product);
        }

        return products;
    }

    private List<String> loadProductIdentifiers(File identifiersFile) {
        ArrayList<String> identifiers = new ArrayList<>();

        try (Scanner fileIn = new Scanner(identifiersFile)) {
            while (fileIn.hasNextLine()) {
                identifiers.add(fileIn.nextLine());
            }
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return identifiers;
    }
}
