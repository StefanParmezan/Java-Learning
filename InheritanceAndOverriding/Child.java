package InheritanceAndOverriding;

public class Child extends Man{
    String LoveToy;
    public Child(String name, int age, String LoveToy) {
        super(name, age);
        this.LoveToy = LoveToy;
    }

    @Override
    public void Hello(){
        System.out.println("Hello I'm Child");
    }

}
