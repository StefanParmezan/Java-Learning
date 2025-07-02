package Multithreading.ThreadsTypes.DaemonThreads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class EmailDataBase {
    private static final List<Email> emails = new CopyOnWriteArrayList<>();

    public static void add(Email email) {
        emails.add(email);
    }

    public static void Display() {
        for(Email email : emails) {
            System.out.println("Title: " + email.getTitle() + " | Sender: " + email.getName());
        }
    }

    public static List<Email> getEmails() {
        return emails;
    }
}
