package Abstract;

public class Bird extends Animal {
    private boolean fly;

    public Bird(String name, int age, boolean fly) {
        super(name, age);
        this.fly = fly;
    }

    @Override
    public void SayHello() {
        System.out.println("Чик чирик");
    }
}
