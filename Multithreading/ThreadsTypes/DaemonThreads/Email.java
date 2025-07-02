package Multithreading.ThreadsTypes.DaemonThreads;

public class Email {
    private String title;
    private String description;
    private String name;
    private String subject;
    private boolean checked = false;

    public Email(String title, String description, String name, String subject) {
        this.title = title;
        this.description = description;
        this.name = name;
        this.subject = subject;
    }

    public void sendEmail() {
        Thread threadSender = new Thread(new EmailSender(this, Actions.SEND));
        threadSender.start();
    }

    public void checkEmail(){
        Thread threadChecker = new Thread(new EmailChecker(this.getName()));
        threadChecker.setDaemon(true);
        threadChecker.start();
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }
}
