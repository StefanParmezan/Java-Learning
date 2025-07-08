package StreamAPI.Day3.MiniPractic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum Product {
    APPLE(15, "Fruits"),
    BANANA(20, "Fruits"),
    CHIPS(40, "Sneak"),
    CHOCOLATE(50, "Chocolate"),
    COOKIE(30, "Sneak"),
    ORANGE(50, "Fruits");

    private final int price;
    private final String category;
    Product(int price, String category) {
        this.category = category;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
    public String getCategory() {
        return category;
    }
}
