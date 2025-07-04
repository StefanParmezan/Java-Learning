package CollectionsFramework.Iterator;

import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class Numbers {

    public static TreeSet<Integer> Sort(ArrayList<Integer> numbers) {
        Iterator<Integer> iterator = numbers.iterator();
        for(iterator = numbers.iterator(); iterator.hasNext();) {
            if(iterator.next() % 3 == 0) {
                iterator.remove();
            }
        }
        TreeSet<Integer> set = new TreeSet<Integer>(numbers);
        return set;

    }
}
