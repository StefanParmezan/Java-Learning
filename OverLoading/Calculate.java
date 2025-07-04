package OverLoading;


public class Calculate {
    double num1;
    double num2;

    public Calculate(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public Calculate(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int Addition(int num1, int num2) {
        return num1 + num2;
    }
    public double Addition(double num1, double num2) {
        return num1 + num2;
    }
    public int Substraction(int num1, int num2) {
        return num1 - num2;
    }
    public double Substraction(double num1, double num2) {
        return num1 - num2;
    }
    public int Multiplication(int num1, int num2) {
        return num1 * num2;
    }
    public double Multiplication(double num1, double num2) {
        return num1 * num2;
    }
    public int Division(int num1, int num2) {
        return num1 / num2;
    }
    public double Division(double num1, double num2) {
        return num1 / num2;
    }
    public double getNum1(){
        return num1;
    }
    public double getNum2(){
        return num2;
    }

}
