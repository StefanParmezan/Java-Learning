package StreamAPI.Day3.MiniPractic;

class Main {
    public static void main(String[] args) {
        System.out.println(ShopService.getInstance().buyProductByCategory("Fruits"));
        System.out.println(ShopService.getInstance().buyRandomProductByCategory("Fruits"));
        System.out.println(ShopService.getInstance().allProductsMorePrice(15));
    }
}
