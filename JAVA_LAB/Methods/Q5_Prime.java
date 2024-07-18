package Methods;
import java.util.Scanner;

public class Q5_Prime {
    static boolean isPrime(int num){
        if (num <=0){
            return false;
        } else if (num == 0 && num == 1) {
            return false;
        }
        else {
            for (int i=2; i<num; i++){
                if (num%i == 0){
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----  Prime numbers  ----");
        System.out.print("Enter a number : ");
        int num = sc.nextInt();

        if (isPrime(num) == false){System.out.println("It's not a prime number.");}
        else {System.out.println("It's a prime number...!!");}
    }
}
