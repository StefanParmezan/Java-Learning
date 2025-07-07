package StreamAPI.Day1;

import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.stream.Collectors;

public class ShopService {
    private static ShopService instance = new ShopService();
    private ShopService(){}

    public static ShopService getInstance(){
        return instance;
    }

    private int calculatePrice(List<Products> products){
        int result = 0;
        for(Products p : products){
            result += p.getPrice();
        }
        return result;
    }

    protected List<Products> sortProducts(List<Products> products, Sorters sorter) throws Exception {
        switch (sorter){
            case sortByPrice ->{
                return products.stream().sorted(Comparator.comparingInt(Products::getPrice)).collect(Collectors.toList());
            }

            case sortByValue ->{
                return products.stream().sorted(Comparator.comparing(Enum::name)).collect(Collectors.toList());
            }
        }
        throw new Exception("Invalid sorter!");
    }
}
