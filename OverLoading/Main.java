package OverLoading;

public class Main {
    public static void main(String[] args) {
        Calculate Example = new Calculate(2.5, 3.2);
        System.out.println(Example.Addition(Example.getNum1(), Example.getNum2()));
        System.out.println(Example.Multiplication(Example.getNum1(), Example.getNum2()));
        System.out.println(Example.Division(Example.getNum1(), Example.getNum2()));
        System.out.println(Example.Substraction(Example.getNum1(), Example.getNum2()));
        Calculate Example2 = new Calculate(2, 2);
        System.out.println(Example2.Substraction(Example2.getNum1(), Example2.getNum2()));
        System.out.println(Example2.Multiplication(Example2.getNum1(), Example2.getNum2()));
        System.out.println(Example2.Division(Example2.getNum1(), Example2.getNum2()));
        System.out.println(Example2.Substraction(Example2.getNum1(), Example2.getNum2()));
    }
}
