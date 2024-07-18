package l83_Exception_Class;
import java.util.Scanner;
class My_exception extends Exception{
//    int age=0;
    public My_exception()      {System.out.println("your age is :         .......");}
    @Override
    public String toString()   {return "toString";}
    @Override
    public String getMessage() {return "Get Message";}
}
public class l83_2 {
    public static void display_age(int age){
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("Your age is : "+age);
        System.out.println("----------------------");
        System.out.println("----------------------");
        System.out.println("----------------------");
    }
    public static void validate_age (int n) throws My_exception{
        if (n<0){
            try {
                throw new My_exception();
            }
            catch (Exception e){
                System.out.println(e.getMessage()+" || Age can't be less than 0 ...!");
                System.out.println(e.toString());
                System.out.println(e);
            }
        }
        if (n>100){
            try {
                throw new My_exception();
            }
            catch (Exception e){
                System.out.println(e.getMessage()+" || Age is greater than 100");
                System.out.println(e.toString());
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("---------- Custom exception ------------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int n = sc.nextInt();
//        validate_age(n);
        display_age(n);
    }
}
