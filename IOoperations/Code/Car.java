package IOoperations.Code;

import java.util.TreeSet;

public enum Car {
    Car1("Toyota", 2013, 80, 20000, false, 700000),
    Car2("Kia", 2015, 90, 15000, true, 1000000),
    Car3("Lada", 2018, 75, 30000, false, 590000),
    Car4("Skoda", 2020, 95, 18000, false, 630000),
    Car5("Семёрка", 2012, 80, 40000, false, 400000),
    Car6("BMW", 2023, 120, 18000, true, 2000000);

    static TreeSet<Car> Cars = new TreeSet<>();
    private String model;
    private int releaseYear;
    private int speed;
    private int mileAge;
    private boolean allwheelDrive;
    private int price;

    Car(String model, int releaseYear, int speed, int mileAge, boolean allwheelDrive, int price) {
        this.model = model;
        this.releaseYear = releaseYear;
        this.speed = speed;
        this.mileAge = mileAge;
        this.allwheelDrive = allwheelDrive;
        this.price = price;

    }
    public static void DisplayCars(){
        Cars.add(Car.Car1);
        Cars.add(Car.Car2);
        Cars.add(Car.Car3);
        Cars.add(Car.Car4);
        Cars.add(Car.Car5);
        Cars.add(Car.Car6);

        for(Car car : Cars){
            System.out.println("Model: " + car.getModel() + " Speed: " + car.getSpeed() + " mileAge " + car.getMileAge() + " allwheelDrive: " + car.getAllWheelDrive()+ " price: " + car.getPrice());
        }
    }

    public static TreeSet<Car> getCars() {
        return Cars;
    }

    public String getModel() {
        return model;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public int getSpeed() {
        return speed;
    }

    public int getMileAge() {
        return mileAge;
    }

    public boolean getAllWheelDrive() {
        return allwheelDrive;
    }

    public int getPrice() {
        return price;
    }
}
