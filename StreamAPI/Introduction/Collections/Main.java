package StreamAPI.Introduction.Collections;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> shoplist = new LinkedList<>();
        shoplist.add("bread");
        shoplist.add("milk");
        shoplist.add("cheese");
        User user = new User(shoplist);
        System.out.println(user.sort());
    }
}
