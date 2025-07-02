package Multithreading.ThreadsTypes.DaemonThreads;

public class EmailSender implements Runnable {
    Email email;
    Actions action;
    public EmailSender(Email email, Actions actions) {
        this.email = email;
        this.action = actions;
    }
    @Override
    public void run() {
        System.out.println("Email sender started");
        switch (action){
            case SEND -> EmailDataBase.add(email);
        }
    }
}
