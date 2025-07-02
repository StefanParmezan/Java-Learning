package Multithreading.ThreadsTypes.DaemonThreads;

public class EmailChecker implements Runnable {
    private String name;

    public EmailChecker(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for(Email email : EmailDataBase.getEmails()){
            if(email.getSubject().equals(name) && !email.isChecked()){
                System.out.println();
                System.out.println("\u001B[1;4;32mHey bro, new email!\u001B[0m");
                System.out.println("Email sender: " + email.getName());
                System.out.println("Email name: " + email.getTitle());
                System.out.println("Email description: " + email.getDescription());
                email.setChecked(true);
            }
        }
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        this.run();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
