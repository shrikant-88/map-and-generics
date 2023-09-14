package genrics;

public class genrics1 {
    public static void main(String[] args) {
        Student<Integer,String> s1 = new Student<Integer,String>(19, "shrikant");
        s1.disp();
    }
}
