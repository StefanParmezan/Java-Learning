package CollectionsFramework.QueueAndDeque;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Deque<String> HospitalDeque = new LinkedList<>();
        Queue<String> HospitalQueue = new LinkedList<>();
        HospitalQueue.add("Dima");
        HospitalQueue.add("Stefan");
        HospitalQueue.add("Brian");
        HospitalQueue.add("Raj");
        HospitalQueue.add("Alex");

        HospitalDeque.add("Dima");
        HospitalDeque.add("Stefan");
        HospitalDeque.add("Brian");
        HospitalDeque.add("Raj");
        HospitalDeque.add("Alex");
        System.out.println(HospitalQueue);
        HospitalQueue.poll();
        System.out.println(HospitalQueue);
        HospitalQueue.poll();
        System.out.println(HospitalQueue);
        HospitalQueue.poll();
        System.out.println(HospitalQueue);

        System.out.println(HospitalDeque);
        HospitalDeque.pollLast();
        System.out.println(HospitalDeque);
        HospitalDeque.pollLast();
        System.out.println(HospitalDeque);
        HospitalDeque.pollLast();
        System.out.println(HospitalDeque);
    }
}
