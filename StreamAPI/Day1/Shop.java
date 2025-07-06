package StreamAPI.Day1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {
    Shop instance = new Shop();
    private Shop(){}

    public Shop getInstance(){
        return instance;
    }

    private int calculatePrice(List<Products> products){
        int result = 0;
        for(Products p : products){
            result += p.getPrice();
        }
        return result;
    }

    private List<Products> sortProducts(List<Products> products, Sorters sorter) throws Exception {
        switch (sorter){
            case sortByPrice ->{
                return products.stream().sorted((p1, p2) -> p1.getPrice() - p2.getPrice()).collect(Collectors.toList());
            }

            case sortByValue ->{

            }
        }
        throw new Exception("Invalid sorter!");
    }
}
