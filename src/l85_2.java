import java.util.Scanner;
public class l85_2{
    public static void main(String[] args) {
        System.out.println("--------------------");
        int age=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        try {
            age = sc.nextInt();
            if (age<0)          {throw new Exception("----> Age can't be -ve");}
            if (age<18 || age<0){throw new Exception("----> You are below 18");}
        }catch (Exception e){
            if(age <0){
                System.out.println("--------------------------");
                System.out.println("Exception : age can not be -ve");
                System.out.println(e);
                System.out.println("--------------------------");
            }
            if (age<18 || age<0){
                System.out.println("--------------------------");
                System.out.println("Exception : you are below 18");
                System.out.println(e);
                System.out.println("--------------------------");
            }
        }
        finally {
            System.out.println("--------------------------");
            System.out.println("     ENJOY YOR DAY");
            System.out.println("--------------------------");
        }
//        catch (Exception e){}
    }
}
