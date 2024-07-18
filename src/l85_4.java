import java.util.Scanner;
public class l85_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------");
        System.out.println("Enter two numbers : ");
        float a = sc.nextFloat();        float b = sc.nextFloat();
        while (true){
            try {
                System.out.println("----------------------------");
                System.out.println("a = "+a+" || b = "+b);
                System.out.println("Division (a/b) = "+a/b);
                if (b==0){throw new Exception("------> A no. can't be divided by 0");}
            }catch (Exception e){
                System.out.println("EXCEPTION : ");
                System.out.println(e.getMessage());
                break;
            }finally {
                System.out.println("------------------");
                System.out.println("Finally value of b is : "+b);
                System.out.println("----------------------------");
            }
            b--;
        }
    }
}
