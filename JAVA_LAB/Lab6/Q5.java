package Lab6;
import java.lang.String;
import java.util.Scanner;
class needed {
    int roll;
    float cgpa;
    String name;
    void getDetails(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name of student: ");
        name=sc.next();
        System.out.print("Enter roll number of student: ");
        roll=sc.nextInt();
        System.out.print("Enter CGPA received: ");
        cgpa=sc.nextFloat();
    }
    void display(){
        System.out.println("Name is "+name);
        System.out.println("Roll number is "+roll);
        System.out.println("CGPA is "+cgpa);
    }

}
public class Q5 {
    public static void main(String[] args){
        needed obj1 = new needed();
        System.out.print("Enter number of students : ");
        Scanner sd= new Scanner(System.in);
        int n=sd.nextInt();
        for(int i=0;i<n;i++){
            obj1.getDetails();
            obj1.display();
        }
        System.out.println("---------------");
    }
}
