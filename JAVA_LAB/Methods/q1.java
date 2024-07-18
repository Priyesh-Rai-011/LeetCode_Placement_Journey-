package Methods;
import java.util.Scanner;

public class q1 {
    static void inputArray(float[] a){
        Scanner sc = new Scanner(System.in);
        System.out.println("You can enter "+a.length+" numbers.");
        System.out.println("Enter : ");
        for (int i=0; i<a.length; i++){
            a[i] = sc.nextFloat();
        }
    }
    static void displayArray(float[] a){
        System.out.println("Your array is :");
        for (float element : a) {
            System.out.print(element+",  ");
        }System.out.println();
    }
    static float calculateAverage(float[] a){
        float avg=0, sum=0;
        for (float element : a){
            sum = sum + element;
        }
        avg = sum/a.length;
        return avg;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Calculating Average in an Array....!!!!");
        System.out.print("Enter the size of the array :");
        int l = sc.nextInt();
        float[] array = new float[l];

        inputArray(array);
        displayArray(array);
        System.out.println("----------------------------------------------");
        System.out.println("Average value of the ARRAY is : "+calculateAverage(array));
    }
}
