package StreamAPI.Day3.MiniPractic;

import StreamAPI.Day1.Products;

import java.util.HashMap;
import java.util.Map;

public class ShopData {
    private static Map<Product, String> products = new HashMap<>();
    public ShopData() {
        products.put(Product.APPLE, Product.APPLE.getCategory());
        products.put(Product.CHIPS, Product.CHIPS.getCategory());
        products.put(Product.CHOCOLATE, Product.CHOCOLATE.getCategory());
        products.put(Product.COOKIE, Product.COOKIE.getCategory());
        products.put(Product.ORANGE, Product.ORANGE.getCategory());
        products.put(Product.BANANA, Product.BANANA.getCategory());
    }

    public Map<Product, String> getProducts() {
        return products;
    }
}
