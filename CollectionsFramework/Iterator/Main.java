package CollectionsFramework.Iterator;

import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>(20);
        Random rand = new Random();

        for(int i = 0; i < 20; i++){
            num.add(rand.nextInt(100));
        }
        System.out.println(num);
        List<Integer> sortednum = new ArrayList<>(Numbers.Sort(num));
        System.out.println(sortednum);
    }
}
