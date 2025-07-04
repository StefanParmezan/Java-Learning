package CollectionsFramework.List;

import java.time.LocalDate;

public enum Products {
    APPLE(25), JUICE(18), ORANGE(11), MILK(31), CHICKEN(40), BREAD(34);
    int price;

    Products(int price){
        this.price = price;
        LocalDate UseByDate = LocalDate.of(2025,4,30);
    }
}
