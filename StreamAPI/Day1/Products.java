package StreamAPI.Day1;

public enum Products {
    APPLE(20),
    BANANA(30),
    MILK(70),
    BREAD(40),
    SUGAR(80);
    int price;

    private Products(int price){
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
