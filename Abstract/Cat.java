package Abstract;

public class Cat extends Animal {
    private boolean moustache;

    public Cat(String name, int age, boolean moustache) {
        super(name, age);
        this.moustache = moustache;
    }

    @Override
    public void SayHello() {
        System.out.println("Мяу");
    }
}
