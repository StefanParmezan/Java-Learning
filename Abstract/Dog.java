package Abstract;

public class Dog extends Animal {
    private boolean fangs;
    public Dog(String name, int age, boolean fangs) {
        super(name, age);
        this.fangs = fangs;
    }

    @Override
    public void SayHello() {
        System.out.println("Гав");
    }
}
