import java.util.Scanner;
public class ch7_PS {
//  Question 1
//    static int table(int n){
//        for (int i=1; i<=10; i++){
//            System.out.println(n+" X "+i+" = "+(n*i));
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        System.out.println("-- Multiplication Table of a Number --");
//        System.out.print("Enter the number whose multiplication table you want : ");
//        Scanner sc = new Scanner(System.in);
//        int num = sc.nextInt();
//        System.out.println("multiplication table of the number is : ");
//        System.out.println(table(num));
//    }


// Question 2
//    static int pattern(int r){
//        for (int i=1; i<=r; i++){
//            for (int j=0; j<i; j++){
//                System.out.print("*"+" ");
//            }
//            System.out.println();
//        }
//        return 0;
//    }
//    public static void main(String[] args) {
//        System.out.println("-- Printing Pattern --");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("How many rows do you want in your pattern..? : ");
//        int rows = sc.nextInt();
//        System.out.println("The pattern is as follows : ");
//        System.out.println(pattern(rows));
//    }


//  Question 3
//    static int sum(int n){
//        int s=0;
//        for (int i=0; i<=n; i++){
//            s+=i;
//        }
//        return s;
//    }
//    public static void main(String[] args) {
//        System.out.println("-- Sum fo first n natural numbers --");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number up to which you want to find the sum : ");
//        int num = sc.nextInt();
//        System.out.println("Sum is : "+sum(num));
//    }


//  Question 4
//    static void pattern(int r){
//        for(int i=r;i>0;i--){
//            for(int j=0;j<i;j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("-- Pattern Printing --");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows : ");
//        int row = sc.nextInt();
//        System.out.println("The pattern is as follows");
//        pattern(row);
//    }


//  Question 5 --------- incomplete ---------
//    static void fibonacci(int n){
//        for (int i=0; i<n; i++){
//            int sum = 0;
//            sum = sum + fibonacci();
//        }
//    }
//    public static void main(String[] args) {
//        System.out.println("-- Fibonacci series --");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the number upto which you want to print the fibonacci series");
//        int n = sc.nextInt();
//
//    }


//  Question 6
//    static float avg(int[] ar){
//        float sum=0;
//        for (int element : ar) {
//            sum = sum + element;
//        }
//        float avg = sum/ar.length;
//        return avg;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of terms in the array : ");
//        int n = sc.nextInt();
//        int[] array = new int[n];
//        System.out.print("Enter the elements of the array :: ");
//        for (int i=0; i<n; i++){
//            array[i] = sc.nextInt();
//        }
//        System.out.print("Average value of the array is : "+avg(array));
//        avg(array);
//    }


//  Question 6
//    static String pattern(int r){
//        String tobe="*";
//        if (r<0) {
//            return "\n";
//        }
//        int t = r;
//        tobe = tobe+pattern(t--);
//        return "";
//    }
//    public static void main(String[] args) {
//        System.out.println("-- Pattern (using recursion) --");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows : ");
//        int rows = sc.nextInt();
//        pattern(rows);
//    }


//  Question 7 (pattern problem using recursion)
        static void space(int i){
            if (i==0){
                return;
            }
            System.out.print("  ");
            space(--i);
        }
        static void symbol(int i){
            if (i==0){
                return;
            }
            System.out.print("  * ");
            symbol(--i);
        }
        static void patternlower(int i, int t){
            if (i==0){
                return;
            }
            space(t-i);
            symbol(i);
            System.out.println();
            patternlower(--i,t);
        }
        static void patternupper(int i, int t){
            if (i==0){
                return;
            }
            space(i);
            symbol(t-i);
            System.out.println();
            patternupper(--i, t);
        }
        static void totalpattern(int i){
            patternupper(i,i);
            patternlower(i,i);
        }
        public static void main(String[] args) {
            totalpattern(5);
        }
    }

