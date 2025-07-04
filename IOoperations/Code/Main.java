package IOoperations.Code;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Hello enter you username and enter cars");
        Client client1 = new Client("Dima");
        Client client2 = new Client("David");

        client1.AddCar(Car.Car1);
        client1.AddCar(Car.Car2);
        client1.AddCar(Car.Car3);
        client2.AddCar(Car.Car4);
        client2.AddCar(Car.Car5);
        client2.AddCar(Car.Car6);

    }
}
