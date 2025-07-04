package CollectionsFramework.List;

import java.util.ArrayList;
import java.util.LinkedList;

public class Client {
    String name;
    ArrayList<Products> ShopList = new ArrayList<Products>(20);
    public Client(String name) {
        this.name = name;
        ClientList.add(this);
    }

    static LinkedList<Client> ClientList = new LinkedList<>();


    public void addToShopList(Products product) {
        ShopList.add(product);
    }
    public void displayClient(){
        System.out.println("------------------------------");

        System.out.println("Клиент " + this.name);

        System.out.print("Имеет продукты: \n");
        for (Products product : ShopList) {
            System.out.print("Название " + product + " Стоимость " + product.price);
            System.out.println();
        }
        System.out.println("------------------------------\n");
    }
    static public void getClientList(){
        System.out.print("[ ");
        for (Client client : ClientList) {
            System.out.print(client.name + " ");
        }
        System.out.print("]");
    }
}
