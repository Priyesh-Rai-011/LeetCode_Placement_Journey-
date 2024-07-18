package MathsForDSA.V1;
// Finding hte nth magic number
// AMAZON QUESTION
import java.util.Scanner;

public class Q5_nth_MagicNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");    int num = sc.nextInt();
        System.out.println(num+" in Binary format is : "+convToBinary(num));
        System.out.println("So the "+num+"th Magic Number is : "+nthMagicNo(convToBinary(num)));
    }
    static String convToBinary(int num){
        StringBuilder binary = new StringBuilder();
        if (num == 0){return "0";}
        while (num>0){
            int rem = num%2;
            binary.insert(0,rem);
            num /= 2;
        }
        return binary.toString();
    }
    static int nthMagicNo(String binNum){
        int sum=0;
        for (int i = binNum.length()-1; i >= 0; i--) {
            char charAtI = binNum.charAt(i);
            if (charAtI == '1') {
                sum = (int) (sum + Math.pow(5,binNum.length()-i));
                System.out.print(5+"^"+(binNum.length()-i)+" + ");
            }
        }System.out.println("0");
        return sum;
    }
}
