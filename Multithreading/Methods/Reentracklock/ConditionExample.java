package Multithreading.Methods.Reentracklock;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionExample {

    private static final ReentrantLock lock = new ReentrantLock();
    private static final Condition taskDone = lock.newCondition();

    private static boolean isTaskCompleted = false;

    public static void main(String[] args) {

        // Потоки-читатели (ждут завершения задачи)
        for (int i = 1; i <= 3; i++) {
            new Thread(new TaskReader(i), "Читатель-" + i).start();
        }

        // Поток-писатель (выполняет задачу и будит остальных)
        new Thread(new TaskWriter(), "Писатель").start();
    }

    static class TaskReader implements Runnable {
        private final int id;

        public TaskReader(int id) {
            this.id = id;
        }

        @Override
        public void run() {
            lock.lock();
            try {
                System.out.println("[" + Thread.currentThread().getName() + "] Жду завершения задачи...");

                while (!isTaskCompleted) {
                    taskDone.await(); // ждём сигнала
                }

                System.out.println("[" + Thread.currentThread().getName() + "] Задача завершена! Продолжаю работу...");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        }
    }

    static class TaskWriter implements Runnable {
        @Override
        public void run() {
            lock.lock();
            try {
                System.out.println("[" + Thread.currentThread().getName() + "] Начинаю выполнение задачи...");

                Thread.sleep(5000); // имитация долгой работы
                isTaskCompleted = true;

                System.out.println("[" + Thread.currentThread().getName() + "] Задача выполнена. Отправляю сигнал всем");

                taskDone.signalAll(); // будим всех читателей
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            } finally {
                lock.unlock();
            }
        }

    }
}