package IOoperations.Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Client {
    String name;
    ArrayList<Car> ClientCars = new ArrayList<>(15);

    public void AddCar(Car car){
        ClientCars.add(car);
    }

    public Client(String name) throws IOException {
        this.name = name;
    }
    public void DisplayCars(){
        System.out.println("User with name " + name + " have cars: \n");
        for(Car car : this.ClientCars){
            System.out.println("Model: " + car.getModel() + " | Speed: " + car.getSpeed() + " | mileAge " + car.getMileAge() + " | allwheelDrive: " + car.getAllWheelDrive()+ " | price: " + car.getPrice());
        }
    }
}
