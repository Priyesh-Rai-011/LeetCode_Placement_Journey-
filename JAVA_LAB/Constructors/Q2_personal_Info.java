package Constructors;
import java.util.Scanner;
class Person{
    String name;  int age;
    Person(){
        this.age=0;
        this.name="Unknown";
    }
    Person(String n,int a){
        this.name=n;
        this.age=a;
    }
    void displayInfo(){
        System.out.println("My name is "+name);
        System.out.println("I am "+age+" years old..!");
    }
}
public class Q2_personal_Info {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----  Displaying Personal Info Of A Person  ----");
        System.out.println("Enter the name  & age of a person : ");
        String name= sc.nextLine();
        int age = sc.nextInt();
        System.out.println("------------------------------------");

        Person P1 = new Person();
        P1.displayInfo();

        Person P2 = new Person(name,age);
        P2.displayInfo();

    }
}
