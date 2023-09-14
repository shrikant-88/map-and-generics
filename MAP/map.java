package MAP;
import java.util.HashMap;
//import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.*;
//import java.util.Set.*;

public class map {
    
    public static void main(String[] args) {
        Map<Integer,String> m1 = new HashMap<> ();
        m1.put(0001, "shrikant");
        m1.put(0002, "rohit");
        m1.put(0003, "manish");
        m1.put(0005, "suraj");

        System.out.println(m1); 
        
        System.out.println(m1.get(0001));
        // fatching value present at spacific key!
       // now iterating using iterator :

       Set<Entry<Integer, String>>s = m1.entrySet();
       Iterator<Entry<Integer, String>> itr = s.iterator();

       while(itr.hasNext()){
        Map.Entry<Integer, String> obj = itr.next();
        System.out.println(obj.getKey()+" : "+ obj.getValue());
       }
            
        }

    }
