package l83_Exception_Class;
import java.util.Scanner;
import java.security.PrivateKey;

class Person{
    private String name; private int id;
    public Person(String n,int id){this.name=n;    this.id=id;}

    @Override
    public String toString() {
        return "This person is : "+this.name+"\nand\n"+"His identity is :"+this.id;
    }
}
public class a_toString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.next();
        System.out.println("----------------------------------------");
        Person p = new Person(name,20);
        System.out.println(p);
    }
}
