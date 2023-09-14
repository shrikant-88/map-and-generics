package genrics;
public class Student<T,E>
{
  
    T obj;
    E obj2;
    
    Student(T obj,E obj2){
        this.obj = obj;
        this.obj2 = obj2;
    }

    public void disp(){
        System.out.println("age = "+obj+"\n"+"name = "+ obj2 );
    }

      @Override
    public String toString() {
        return  obj + " : " + obj2 ;
    }
    
}
