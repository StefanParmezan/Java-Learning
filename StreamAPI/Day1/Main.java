package StreamAPI.Day1;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        List<Products> products = new ArrayList<>();
        products.add(Products.BREAD);
        products.add(Products.APPLE);
        products.add(Products.SUGAR);
        products.add(Products.GOLD_APPLE);
        System.out.println(ShopService.getInstance().sortProducts(products, Sorters.sortByValue));
        System.out.println(ShopService.getInstance().sortProducts(products, Sorters.sortByPrice));
    }
}
