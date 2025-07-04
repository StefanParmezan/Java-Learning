package DataTypes;

public class Main {
    public static void main(String[] args){
        int a = 5;
        double b = 5.5;
        // Примитивные типы данных хранят в себе область памяти
        String Kislota = "H2SO4";
        int[] ints = new int[5];
        ints[0] = 1;
        ints[1] = 2;
        ints[2] = 3;
        ints[3] = 4;
        ints[4] = 5;
        Kislota = "HCL";
        Person person1 = new Person();
        person1.name = "Stefan";
        System.out.println(person1);
        Integer c = 2;
        String Apple1 = "Apple";
        String Apple2 = "Apple";
        System.out.println(Apple1 == Apple2);
        System.out.println(Apple1.equals(Apple2));
    }
}
