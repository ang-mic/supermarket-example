package org.supermarket.alif;

import java.util.ArrayList;

public class AlWishList extends AlProductList {

    private AlWishList() {
        this.PRODUCTS_FILE_PATH    = "";
        this.IDENTIFIERS_FILE_PATH = "";
        this.products = new ArrayList<AlProduct>();
    }

    public AlWishList(String customerName) {
        this.PRODUCTS_FILE_PATH    = customerName + "_" + AlUtil.getInstance().getWishlistFilePath();
        this.IDENTIFIERS_FILE_PATH = customerName + "_" + AlUtil.getInstance().getWishlsitIdsFilePath();
        this.products = loadAllProducts();
    }
}
