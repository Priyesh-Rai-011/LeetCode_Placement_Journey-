package Methods;
import java.util.Scanner;
public class Q7_factorial {

    static int getFactorial(int num){
        if (num == 0 || num == 1){
            return 1;
        }
        else if (num < 0) {
            throw new Error("Enter a +ve number");
        }
        else {
//            while (num < 1){
                int fact = num;
                fact = fact * getFactorial(num-1);
//            }
            return fact;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----  Factorial  ----");
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        System.out.println("Factorial of "+num+" : "+getFactorial(num));
    }
}
