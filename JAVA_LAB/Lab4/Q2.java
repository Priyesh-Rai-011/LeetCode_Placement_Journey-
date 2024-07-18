package Lab4;
import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        System.out.println("---- day corresponding to number ----");
        System.out.print("enter any number from 1-7 : ");
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        switch (day) {
            case 1 -> System.out.println("It's .... Monday");
            case 2 -> System.out.println("It's .... Tuesday");
            case 3 -> System.out.println("It's .... Wednesday");
            case 4 -> System.out.println("It's .... Thursday");
            case 5 -> System.out.println("It's .... Friday");
            case 6 -> System.out.println("It's .... Saturday");
            case 7 -> System.out.println("It's .... Sunday");
        }
    }
}
