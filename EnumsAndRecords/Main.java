package EnumsAndRecords;

public class Main {
    public static void main(String[] args) {
        Worker Anton = Worker.PROGRAMMER;
        Worker Misha = Worker.BARISTA;
        Worker Andrey = Worker.COOKER;
        Anton.display();
        Misha.display();
        Andrey.display();
        System.out.println(Anton.CalculateSalaryPerDay(Anton.getSalary()));
        Person Dima = new Person("Dima", 26, "Programmer");
        Person Michail = new Person("Michail", 26, "Unemployed");

    }
}