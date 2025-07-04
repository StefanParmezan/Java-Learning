package Generics;

import java.util.ArrayList;
import java.util.List;

public class DeliveryInput<T>{
    private List<T> items = new ArrayList<>();

    public List<T> getItems() {
        return items;
    }

    public void setItems(List<T> items) {

        this.items = items;
    }

    public void addItem(T item){
        this.items.add(item);

    }

}
