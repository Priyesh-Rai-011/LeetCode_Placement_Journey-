import java.util.Scanner;

public class L81_Handelling_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------- Handling Specific Exception -------");
        int[] arr = new int[7];
        arr[0]=7;
        arr[1]=17;
        arr[2]=69;
        System.out.println("dividing two numbers of an array");
        System.out.print("Enter index of array"); int ind1 = sc.nextInt();
        System.out.print("Enter number you want to divide the value with : "); int num = sc.nextInt();
        try {
            System.out.println("The value at index is : "+arr[ind1]);
//            float d = arr[ind1]/num;
            System.out.println("The value after dividing (number in array with value) is : "+arr[ind1]/num);
        }
        catch (ArithmeticException e){
            System.out.println("Some exception occurred..!");
            System.out.println(e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Some exception occurred..!");
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("Some exception occurred..!");
            System.out.println(e);
        }
    }
}
