package LAB_Test;
import java.util.Scanner;

class Factorial{
    int val;
    int find_fact(int x){
        int fact=1;
        if (x == 0){return 1;}
        if (x == 1){return 1;}
        else {
            for (int i=x;i>0;i--){
                fact=fact*i;
            }
        }
        System.out.println("Factorial of "+x+" is : "+fact);
        return fact;
    }
}
public class Q1 {
    public static void main(String[] args) {
        System.out.println("------- Permutation & Combination --> Factorial -------");
        Scanner sc = new Scanner(System.in);
        Factorial f = new Factorial();
//        f.find_fact(5);
//        System.out.println(f.val);
        System.out.println("Calculating C(n,r) = (n!)/(r!)(n-r)! ");
        System.out.print("Enter the value of (n) : ");
        int n = sc.nextInt();
        System.out.print("Enter the value of (r) : ");
        int r = sc.nextInt();
        int a=f.find_fact(n);
        int b=f.find_fact(r);
        int c=f.find_fact(n-r);
//        float res = (f.find_fact(n))/(f.find_fact(r)*f.find_fact(n-r));
        float res = (a)/(b*c);
        System.out.println("Combination of C(n,r) is : "+res);
    }
}
