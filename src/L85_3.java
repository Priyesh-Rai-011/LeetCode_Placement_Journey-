import java.util.Scanner;
public class L85_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------------------");
        System.out.print("Enter a no. for multiplication table - greater than 5 : ");
        int n = sc.nextInt();
        try {
            for (int i =1;i<=10;i++){
                if (n<5){throw new Exception("Enter a no. > 5");}
                else {
                    System.out.println(n+" X "+i+" = "+(n*i));
                }
            }
        }catch (Exception e){
            System.out.println("EXCEPTION : ");
//            System.out.println(e);
//            System.out.println(e.toString());
            System.out.println(e.getMessage());

        }finally {
            System.out.println("++++++++++++++++++++++++++++++++");
        }
    }
}
