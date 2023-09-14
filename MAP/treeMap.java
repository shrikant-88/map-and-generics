package MAP;

import java.util.Collection;
import java.util.Iterator;
import java.util.TreeMap;

public class treeMap {
    public static void main(String[] args) {
        TreeMap<Integer,student> map = new TreeMap<>();
        map.put(234547, new student("rohit", 20, "patna"));
        map.put(253453, new student("manish kumar", 21, "delhi"));
        map.put(212334, new student("sikander kumar", 19, "noida"));
        
        Collection<student> c = map.values();
        
        // iterating over a treemap using Iterator:
        Iterator<student> itr = c.iterator();
        while (itr.hasNext()) {
            System.out.println("----------------------------------------------------");
            System.out.println(itr.next());
            System.out.println("----------------------------------------------------");
        }
    }
}
