package org.supermarket.alif;

import java.util.ArrayList;

public class AlBasket extends AlProductList{

    public AlBasket() {
        this.products = new ArrayList<AlProduct>();
    }

    @Override
    public void addNewProduct(AlProduct newProduct) {
        products.add(newProduct);
    }


    @Override
    public void removeProduct(AlProduct existingProduct) {
        for(AlProduct p : products) {
            if(p.getId().equals(existingProduct.getId()) ) {
                products.remove(p);
                break;
            }
        }
    }


}
