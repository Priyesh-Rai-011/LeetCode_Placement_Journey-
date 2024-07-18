package Methods;

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Q9_removeDuplicates {
    static int[] removeDuplicate(int[] num){
        if(num == null || num.length == 0){
            throw new IllegalArgumentException("The array must not be empty OR null");
        }
        int[] uniArray = new int[num.length];
        int nuiCount = 0;
        for (int i=0; i<num.length; i++){
            boolean isDuplicate = false;
            for (int j=0; j<nuiCount; j++){
                if (num[i] == uniArray[j]){
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate){
                uniArray[nuiCount] = num[i];
                nuiCount++;
            }
        }
        return Arrays.copyOf(uniArray,nuiCount);
    }
    public static void main(String[] args) {
        System.out.println("----  Removing Duplicate Elements in teh array  ----");
        int[] num = {10,20,22,30,9,22,40,50,9,9,60,70,9};
        int[] uniNum = removeDuplicate(num);

        System.out.println("Array with duplicate elements : ");
        printArray(num);
        System.out.println("Array without duplicate elements : ");
        printArray(uniNum);

        System.out.println("\n-----------------------------------------------");

    }
    static void printArray(int[] arr){
        for (int elem : arr){
            System.out.print(elem+", ");
        }        System.out.println();
    }
}
