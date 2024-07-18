import java.util.Scanner;

public class l79_try_catch_block {
    public static void main(String[] args) {
        System.out.println("--------------------");
//        float k;
        Scanner sc = new Scanner(System.in);
//        k=sc.nextInt();
//        System.out.println("Integer part of 1000 divided by k is : "+(1000f/k));
        int a = 6000;
        System.out.print("enter number to be divided by 6000 :");
        int b = sc.nextInt();
    //// without try
//        int c = a/b;
//        System.out.println("The result is : "+c);
    // with try
        try {
            int c = a/b;
            System.out.println("The result is : "+c);
        }
        catch (Exception e){
            System.out.println("We failed to divide : Reason");
            System.out.println("A number can't be devided by "+e);
        }
        System.out.println("End of program...");
    }
}
