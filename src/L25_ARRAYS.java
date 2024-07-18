import java.util.Scanner;
public class L25_ARRAYS {
    public static void main(String[] args) {
        System.out.println("---- ARRAYS ----");
//      Declaration and memory allocation
        int[] marks = new int[5];
        marks[0]=100;
        marks[1]=33;
        marks[2]=83;
        marks[3]=74;
        marks[4]=82;
//        marks[5]=49; ----> This will show am error;
        for (int i=0; i<=4; i++){
            System.out.print(marks[i]+" ,");
        }
//        System.out.println(marks[4]);
    }
//  3 ways to create an array in java....
}
