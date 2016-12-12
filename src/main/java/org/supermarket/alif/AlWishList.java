package org.supermarket.alif;

import java.util.ArrayList;

public class AlWishList extends AlProductList {

    private AlWishList() {
        this.productsFilePath = "";
        this.identifiersFilePath = "";
        this.products = new ArrayList<AlProduct>();
    }

    public AlWishList(String customerName) {
        this.productsFilePath = customerName + "_" + "wishlist_product_identifiers.txt";
        this.identifiersFilePath = customerName + "_" + "wishlist_products.txt";
        this.products = loadAllProducts();
    }
}
