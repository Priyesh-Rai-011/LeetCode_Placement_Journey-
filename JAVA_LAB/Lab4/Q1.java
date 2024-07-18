package Lab4;
import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        System.out.println("---- Grade to corresponding marks ----");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks in all the subjects : ");
        System.out.print("Subject 1 : ");
        float m1 = sc.nextFloat();
        System.out.print("Subject 2 : ");
        float m2 = sc.nextFloat();
        System.out.print("Subject 3 : ");
        float m3 = sc.nextFloat();
        System.out.print("Subject 4 : ");
        float m4 = sc.nextFloat();
        System.out.print("Subject 5 : ");
        float m5 = sc.nextFloat();

        float total = (m1+m2+m3+m4+m5);
        float avg = (m1+m2+m3+m4+m5)/5f;
        System.out.println("Your total marks is : "+total);
        System.out.println("Your average marks is : "+avg);

        if (total > 450 && total < 500){
            System.out.println("1st Grade");
        }
        else if (total > 400 && total < 450) {
            System.out.println("2nd Grade");
        }
        else if (total > 350 && total < 400) {
            System.out.println("2nd Grade");
        }
        else if (total > 300 && total < 350) {
            System.out.println("2nd Grade");
        }
        else if (total > 250 && total < 300) {
            System.out.println("2nd Grade");
        }
        else if (total > 200 && total < 250) {
            System.out.println("2nd Grade");
        }
        else {
            System.out.println("You have failed the exam..!");
        }
    }
}
