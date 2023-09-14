package MAP;
import java.util.*;

public class map_student {

    public static void main(String[] args) {

    student s1 = new student("sikander", 19, "noida");
    student s2 = new student("shrikant", 19, "delhi");
    student s3 = new student("rohit", 20, "patna");

    HashMap<Integer,student> h = new HashMap<>();
    h.put(1, s1);
    h.put(2, s2);
    h.put(3, s3);
    
    Collection<student> obj =  h.values();
    
    Iterator<student>itr = obj.iterator();

    while (itr.hasNext()) {
        System.out.println(itr.next());
        System.out.println("_________________________________________________________");
    }


    }
}
