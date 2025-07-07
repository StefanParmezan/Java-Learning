package StreamAPI.Day2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        WorkingWithList workingWithList = new WorkingWithList();
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Africa");
        list.add("Cherry");
        list.add("Apple");
        System.out.println(workingWithList.filterByValue(list, "A"));
        System.out.println(workingWithList.toUpperList(list));
        System.out.println(workingWithList.removeDuplicates(list));
        System.out.println(workingWithList.toStupidList(list));
        System.out.println(workingWithList.sortByAlphabet(list));
    }
}
