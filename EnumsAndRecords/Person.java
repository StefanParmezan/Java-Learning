package EnumsAndRecords;

public record Person(String name, int age, String work) {
    public Person(String name, int age, String work) {
        this.name = name;
        this.age = age;
        if (age < 0) {
            throw new IllegalArgumentException("Age must be a positive integer!");
        }
        if(work != "Unemployed") {
            if (age < 18) {
                this.work = "Unemployed";
                throw new IllegalArgumentException("You baby bro!");
            }
        }
        if (age > 25) {
            throw new IllegalArgumentException("Ahhhahaha bro, go work!");
        }
        this.work = work;
    }
}
