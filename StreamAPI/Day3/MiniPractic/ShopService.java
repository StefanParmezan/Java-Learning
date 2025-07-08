package StreamAPI.Day3.MiniPractic;

import java.awt.List;
import java.util.ArrayList;

public class ShopService {
    private static ShopService shopService = new ShopService();
    private static ShopData shopData = new ShopData();
    private ShopService() {}
    public static ShopService getInstance() {
        return shopService;
    }

    public int buyProductByCategory(String category) {
        return shopData.getProducts().entrySet().stream().filter(s -> s.getValue().equalsIgnoreCase(category)).map(s -> s.getKey().getPrice()).mapToInt(Integer::intValue).sum();
    }

    public int buyRandomProductByCategory(String category) {
        return shopData.getProducts()
                .entrySet().stream().filter(s -> s.getValue().equalsIgnoreCase(category)).findAny().map(s -> s.getKey().getPrice()).stream().mapToInt(Integer::intValue).sum();
    }

    public boolean allProductsMorePrice (int price){
        return shopData.getProducts().entrySet().stream().allMatch(s -> s.getKey().getPrice() > price);
    }
}
