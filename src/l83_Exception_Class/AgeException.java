package l83_Exception_Class;

public class AgeException extends Exception{
    int age;
    public AgeException(int age,String msg){
        this.age=age;
        System.out.println("Your age is "+this.age+"\n"+msg);
    }
}
