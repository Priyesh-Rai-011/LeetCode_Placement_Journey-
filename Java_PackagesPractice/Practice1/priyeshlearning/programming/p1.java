package Practice1.priyeshlearning.programming;
import Practice1.priyeshlearning.life.*;
import java.util.Scanner;
class Personal extends priyeshlearning.life.P1 {
    int age = 20;
    void details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name :");
        String name = sc.next();
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        System.out.println("Enter you hobbies");
        String hobby = sc.next();
    }
}
public class p1 {
    public static void main(String[] args) {
        System.out.println("Package - programming");
        Personal priyesh = new Personal();
        System.out.println(priyesh.age);
        priyesh.details();
    }
}
