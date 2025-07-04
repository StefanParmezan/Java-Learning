package StreamAPI.Introduction.Collections;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class User {
    private List<String> shoplist = new LinkedList<>();

    public User(List<String> shoplist) {
        this.shoplist = shoplist;
    }

    public List<String> getShoplist() {
        return shoplist;
    }

    public void setShopList(List<String> shoplist) {
        this.shoplist = shoplist;
    }

    public List<String> sort() {
        return shoplist.stream().sorted().collect(Collectors.toList());
    }
}
