package Multithreading.Methods.Sleep;

public class Timer implements Runnable {
    private Integer seconds;
    private Integer repeats;

    @Override
    public void run() {
        try {
            SleepTimer();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public Timer(Integer time, Integer repeats) {
        this.seconds = time;
        this.repeats = repeats;
    }

    public void SleepTimer() throws InterruptedException {
        int seconds = this.seconds * 1000;
        for(int i = 0; i < this.repeats; i++){
            System.out.println(i);
            Thread.sleep(seconds);
        }
    }
}
