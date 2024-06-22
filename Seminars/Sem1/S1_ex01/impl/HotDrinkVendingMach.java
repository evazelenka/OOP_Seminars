package Seminars.Sem1.S1_ex01.impl;

import java.util.ArrayList;
import java.util.List;

import Seminars.Sem1.S1_ex01.Product;
import Seminars.Sem1.S1_ex01.VendingMachine;

public class HotDrinkVendingMach extends VendingMachine{

    
    public HotDrinkVendingMach() {
        this.products = new ArrayList<>();
    }

    public HotDrinkVendingMach(List<Product> products) {
        this.products = products;
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }

    public Product getProduct(String name, int temp, float volume) {
        for(Product product : products){
            HotDrink drink = (HotDrink) product;
            if(drink.getName().equals(name) && drink.getVolume() == volume && drink.getTemp() == temp ){
                products.remove(product);
                return product;
            }
        }

        throw new RuntimeException("No such product: " + name);
    }

    

}
