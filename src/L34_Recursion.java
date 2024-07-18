import java.util.Scanner;
public class L34_Recursion {
////                  Factorial of a given number-----( Recursive approach )
    static int factorial(int n){
        if (n==0 || n==1){
            System.out.println("Factorial of 0 or 1 is : 1");
            return 1;
        }
        else {
            int fact=1;
            fact = n * factorial(n-1);
            return fact;
        }
    }
////                  Factorial of a given number-----( Iterative approach )
//    static int factorial(int n){
//        if(n==0 || n==1){
//            System.out.println("Factorial of 0 or 1 is : 1");
//            return 1;
//        }
//        else {
//            int product = 1;
//            for (int i=n; i>1; i--){
//                product=product*i;
//            }
//            return product;
//        }
//    }
    public static void main(String[] args) {
        System.out.println("---- Recursion ----");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of whose factorial you want to calculate : ");
        int num = sc.nextInt();
        System.out.println("Factorial of the given number is : "+factorial(num));
    }
}
