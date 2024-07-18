import java.util.Arrays;
import java.util.Scanner;
public class array_of_objects {
    public static void main(String[] args) {
        System.out.println("array of objects");
        Scanner sc = new Scanner(System.in);

//        array of objects
        String[] arr = new String[4];
        for (int i=0; i<arr.length; i++){
            arr[i] = sc.next();
        }
        System.out.println(Arrays.toString(arr));
    }
}





















