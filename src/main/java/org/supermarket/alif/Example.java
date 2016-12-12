package org.supermarket.alif;

import java.util.List;

public class Example {
    public static void main(String[] args) {

        //HOW TO: use the ProductList
        AlProductList   productList = new AlProductList();       // Instantiate the ProductList
        List<AlProduct> products    = productList.getProducts(); //Get the Products of the ProductList. If there are no
                                                                 // products in the system, the return

        for(AlProduct p : products) {                            // Loop through the products to find the one you are
            if(p.getId().equals("some_id")) {                    // looking for
                //Do something
            }
        }


        //HOW TO: use the Basket
        AlBasket basket = new AlBasket();                        // Create a new basket. A new basket is always empty
        for(AlProduct p : products) {                            // Loop through the products to find the one you are
            if(p.getId().equals("some_id")) {                    // looking for. Use the COPY constructor to add the
                basket.addNewProduct(new AlProduct(p));          // product to the basket
            }
        }

        //HOW TO: use the Basket
        AlWishList wishList = new AlWishList("some_customer"); // Create a new WL for a specific customer.
        for(AlProduct p : products) {                                        // On creation a new file is create that
            if(p.getId().equals("some_id")) {                                // Stores the WL of this customer.
                wishList.addNewProduct(new AlProduct(p));                    // On addNewProduct(..) the files is
            }                                                                // The file is automatically updated
        }
    }
}
