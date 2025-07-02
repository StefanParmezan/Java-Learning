package Multithreading.DataStructures.BlockingQueue;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

class Client {
    String name;

    public Client(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class BlockingQueueExample {

    public static void main(String[] args) {
        BlockingQueue<Client> clientQueue = new LinkedBlockingQueue<>();

        // Поток-производитель: создаёт клиентов
        new Thread(() -> {
            int i = 0;
            while (i < 20) {
                try {
                    Thread.sleep(700); // приходит новый клиент каждые 1 секунда
                    Client client = new Client("Клиент #" + (++i));
                    System.out.println("Пришёл: " + client);
                    clientQueue.put(client); // добавляем в очередь
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }).start();

        // Поток-потребитель: обслуживает клиентов
        new Thread(() -> {
            while (true) {
                try {
                    Thread.sleep(1000); // обслуживаем раз в секунду
                    Client client = clientQueue.take(); // ждём клиента
                    System.out.println("Обслуживаю: " + client);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    break;
                }
            }
        }).start();
    }
}