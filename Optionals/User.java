package Optionals;

import java.util.Optional;
import java.util.OptionalInt;

public class User {
    String name;
    String email;
    String Password;

    public User(String name, String email ,String Password){
        this.name = name;
        this.Password = Password;
    }

    public void Display() {
        System.out.println("Name: " + this.getName());
        System.out.println("Email: " + this.getEmail());
        System.out.println("Password: " + this.getPassword());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }
}
