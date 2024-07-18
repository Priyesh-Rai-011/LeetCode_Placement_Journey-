import java.util.Scanner;
public class l6ex1_marks {
    public static void main(String[] args) {
        System.out.println("hello.!");
        System.out.println("Calculating marks/percentage of a Student");
        Scanner sc = new Scanner(System.in);
        System.out.print("Marks in subject 1 : ");        float m1 = sc.nextFloat();
        System.out.print("Marks in subject 2 : ");        float m2 = sc.nextFloat();
        System.out.print("Marks in subject 3 : ");        float m3 = sc.nextFloat();
        System.out.print("Marks in subject 4 : ");        float m4 = sc.nextFloat();
        System.out.print("Marks in subject 5 : ");        float m5 = sc.nextFloat();
        System.out.println("----------------------------------------------------");
        float total = m1+m2+m3+m4+m5;
        float per = (total*100)/500;
        System.out.print("Total marks are : "+total+"    ||    ");
        System.out.println("Percentage : "+per+" %");
    }
}
