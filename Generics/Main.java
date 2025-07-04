package Generics;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args){
        DeliveryInput<String> delivery1 = new DeliveryInput<>();
        DeliveryInput<Integer> delivery2 = new DeliveryInput<>();
        delivery1.addItem("Apple");
        delivery1.addItem("Banana");
        delivery1.addItem("Cheese");
        delivery2.addItem(2);
        delivery2.addItem(3);
        delivery2.addItem(4);
        System.out.println(delivery1.getItems());
        System.out.println(delivery2.getItems());
    }
}
