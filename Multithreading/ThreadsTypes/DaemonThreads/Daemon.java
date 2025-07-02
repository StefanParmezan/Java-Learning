package Multithreading.ThreadsTypes.DaemonThreads;

public class Daemon {
    public static void main(String[] args) throws InterruptedException {
        Email email1 = new Email("Hello", "Hello bro!", "Bob", "Fred");
        email1.sendEmail();
        email1.checkEmail();
        Email email2 = new Email("My money", "Hey bro, get my money!", "Anton", "George");
        email2.sendEmail();
        email2.checkEmail();
        Email email3 = new Email("I love", "I love cookies!", "John", "Anton");
        email3.sendEmail();
        email3.checkEmail();
        Email email4 = new Email("Best programming language", "Java", "Fable", "Anton");
        email4.sendEmail();
        Email email5 = new Email("Best Barista", "It's Maks", "Stefan", "Anton");
        email5.sendEmail();

        Thread.currentThread().sleep(3000);
    }
}
