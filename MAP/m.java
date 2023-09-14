package MAP;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Map.Entry;

public class m {
    public static void main(String[] args) {
        
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1, "shrikant");
        hm.put(2,"rohit" );
        hm.put(3,"rahul");

        Set<Entry<Integer,String>> s = hm.entrySet();
        Iterator<Entry<Integer,String>> itr = s.iterator();
        while (itr.hasNext()) {
            Entry<Integer,String> e = itr.next();
            System.out.println(e.getKey()+" : "+e.getValue());
        }
    }
}
