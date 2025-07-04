package CollectionsFramework.List;

public class Magazine {
    public static void main(String [] args){
        Client client1 = new Client("Dima");
        client1.addToShopList(Products.APPLE);
        client1.addToShopList(Products.BREAD);
        client1.addToShopList(Products.CHICKEN);
        Client client2 = new Client("David");
        client2.addToShopList(Products.JUICE);
        client2.addToShopList(Products.ORANGE);
        client2.addToShopList(Products.MILK);
        Client client3 = new Client("Daniel");
        client3.addToShopList(Products.APPLE);
        client3.addToShopList(Products.MILK);
        client3.addToShopList(Products.ORANGE);
        client1.displayClient();
        client2.displayClient();
        client3.displayClient();
        Client.getClientList();
        System.out.println(client1);
    }
}
