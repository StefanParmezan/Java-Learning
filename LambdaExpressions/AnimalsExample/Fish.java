package LambdaExpressions.AnimalsExample;

public class Fish extends Animal {
    private boolean CanSwim = true;
    public Fish(String name, int age, boolean CanSwim) {
        super(name, age);
        this.CanSwim = CanSwim;
    }

    public boolean getCanSwim() {
        return CanSwim;
    }

    public void setCanSwim(boolean canSwim) {
        CanSwim = canSwim;
    }

    Go go = (name) -> name + " swimming";
}
