import java.util.Scanner;
public class ch5_PS {
    public static void main(String[] args) {
        System.out.println("Practice Set - Chapter-4");
//  Question 1
        System.out.println("-- Reverse star pattern --");
        for (int i=4; i>0; i--) {
            for (int j = 0; j < i; j++) {
                System.out.print("* ");
            }
            System.out.print("\n");
        }
        System.out.println("--------------------------");

//  Question 2
//        System.out.println("For how many numbers , do you want to find the sum ...?");
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int i=0, total=0;
//        while (i<=n){
//            total=total+i;
//            i++;
//            continue;
//        }
//        System.out.println("Sum of first n natural numbers is : "+total);

//  Question 3
//        System.out.print("Multiplication Table");
//        System.out.print("Enter any number : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        System.out.println("Multiplication table of "+n+" is :");
//        for (int i=1; i<=10; i++){
//            System.out.println(n+" X "+i+" = "+n*i);
//        }
//  Question 4
//        System.out.println("---- Factorial of a given number ----");
//        System.out.print("Enter a number : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//
//        if (n==0){
//            System.out.println("Factorial of 0 is : 1");
//        }
//        else if (n==1) {
//            System.out.println("Factorial of 1 is : 1");
//        }
//        else{
//        System.out.println("Factorial of the give number is : ");
//            int fact = 1;
//            for (int i=1; i<=n; i++){
//                System.out.print(i+"*");
//                fact = fact * i;
//            }
//            System.out.println("\n"+"Factorial of "+n+" is : "+fact);
//        }
//  Question 5
//        System.out.println("---- Factorial of a given number ----");
//        System.out.print("Enter any number : ");
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if (n==0){
//            System.out.println("Factorial of 0 is : 1");
//        }
//        else if (n==1) {
//            System.out.println("Factorial of 1 is : 1");
//        }
//        else {
//            System.out.println("Factorial of the given number is : ");
//            int i=1;
//            int fact=1;
//            while (i<=n){
//                System.out.print(i+"*");
//                fact=fact*i;
//                i++;
//            }
//            System.out.println("\n"+"Factorial of the given number is : "+fact);
//        }
//  Question 9
//        System.out.println("---- sum of numbers occurring in multiplication table of 8 ----");
//        System.out.println("Multiplication table of 8");
//        for (int i=1; i<=10; i++){
//            System.out.println("8 X "+i+" = "+8*i);
//        }
//        System.out.println("---------------There sum would be---------------");
//        int sum=0;
//        for (int i=1; i<=10; i++){
//            System.out.print(8*i+"+");
//            sum = sum + 8*i;
//        }
//        System.out.print("\n"+"Sum of the numbers occurring in the table of 8 ");
//        System.out.println("= "+sum);
    }
}
