package Multithreading.AtomicDatatypes.AtomicReference;

import java.util.concurrent.atomic.AtomicReference;

public class UserUpdater {
    AtomicReference<User> userRef;

    public UserUpdater(User userOld) {
        this.userRef = new AtomicReference<>(userOld);
    }

    public void addClicks(int count){
        boolean success;

        do {
            User userOld = userRef.get();
            User newUser = new User(userOld.name(), userOld.clicks() + count);
            success = userRef.compareAndSet(userOld, newUser);
        }
        while (!success);
    }

    public User getCurrentUser(){
        return userRef.get();
    }
}
