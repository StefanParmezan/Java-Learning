package LambdaExpressions.PersonsExample;

public class Invalide extends Person {
    int Disability;
    public Invalide(String name, int age, int Disability) {
        super(name, age);
        this.Disability = Disability;
    }
    IPersonActions PersonActions = (Disability) -> {
        if (Disability == 0) {
            return "Run forest run";
        }
        return "Sorry, give me wheelchair";
    };

    public int getDisability() {
        return Disability;
    }

    public void setDisability(int disability) {
        Disability = disability;
    }

    public IPersonActions getPersonActions() {
        return PersonActions;
    }

    public void setPersonActions(IPersonActions personActions) {
        PersonActions = personActions;
    }
}
