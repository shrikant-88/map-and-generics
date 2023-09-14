package MAP;

public class student {
    private String name;
    private int age;
    private String city;

    student(String name ,int age ,String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String toString(){

        return  "name = "+name+"\n" +"age =  "+age+"\n"+"city =  "+ city;
    }
   
}
