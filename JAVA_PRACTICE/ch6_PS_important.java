//           ********************    I M P O R T A N T    ********************
public class ch6_PS_important {
    public static void main(String[] args) {
//  Question 1
//        System.out.println("---- Calculating sum of elements in an array ----");
//        float[] num = {12.3f,23.5f,19.2f,93.7f,46.1f};
//        float sum=0;
// //        for (int i=0; i<= num.length; i++){
// //            sum = sum+num[i];
// //        } /*this was showing some error....I don't know why*/
//        for (float element:num){
//            sum=sum+element;
//        }
//        System.out.println("Sum of the elements is : "+sum);


//  Question 2
//        System.out.println("-- Checking weather a value is present or not --");
//        int[] num = {15,2,76,10,10,73,7,11,2};
//        for (int i=0; i< num.length; i++){
//            System.out.print(num[i]+", ");
//        }
//
//        Scanner sc = new Scanner(System.in);
//        System.out.print("\n"+"Enter the value you want to find : ");
//        int val = sc.nextInt();
//
//        boolean test = false;
//        for(int element:num){
//            if(element == val){
//                test=true;
//                break;
//            }
//        }
//        System.out.println("Is "+val+" present in the array : "+test);
//  Question 3
//        System.out.println("-- Calculating Average Marks --");
//        float [] marks = {78.5f,81f,74.5f,92.5f,67};
//        System.out.println("The Array is : ");
//        float sum=0;
//        for (float elements: marks){   //(for-each) loop
//            System.out.print(elements+", ");
//            sum+=elements;
//        }System.out.println();
//
//        float avg=(sum/marks.length);
//        System.out.println("Average marks of the array is : "+avg);


//  Question 4
//        System.out.println("-- Add two matrices of size 2X3 --");
//        int [][] matrix_1 = {{1,0,0},
//                             {0,0,1}};
//        int [][] matrix_2 = {{0,0,1},
//                             {1,0,0}};
//        int [][] matrix_3 = new int[2][3];
//        for (int i=0; i< matrix_1.length; i++){
//            for (int j=0; j<3; j++){
//                matrix_3[i][j]=matrix_1[i][j]+matrix_2[i][j];
//            }
//        }
//        System.out.println("After adding-up both matrices : Matrix-3");
//        for (int i=0; i< matrix_3.length; i++){
//            for (int j=0; j<3; j++){
//                System.out.print(matrix_3[i][j]+" ");
//            }System.out.println();
//        }


//  Question 5
//        System.out.println("-- Reversal of an Array --");
//        float [] array = {12.2f,23.4f,4.6f,72.5f,11.11f,7.11f,15.2f};
//        System.out.print("Array before reversal : ");
//        for (float elements: array){
//            System.out.print(elements+", ");
//        }                       System.out.println();
//        int len=array.length;
//        int mid=Math.floorDiv(array.length,2);
//        for (int i=0; i<mid; i++){
//            float temp = array[i];
//            array[i]=array[len-1-i];
//            array[len-1-i]=temp;
//        }
//        System.out.print("Array after reversal : ");
//        for (float elements: array){
//            System.out.print(elements+", ");
//        }


//  Question 6
//        System.out.println("-- Finding maximum element in an array --");
//        float [] array = {12.2f,23.4f,4.6f,72.5f,11.11f,7.11f,15.2f};
//        System.out.print("Array:    ");        for (float element : array) {
//                                                   System.out.print(element + ", ");
//                                               }        System.out.println();
//        for (int i=0; i< array.length; i++){  //sorting the array
//            for (int j=i+1; j< array.length; j++){
//                if (array[i]>array[j]){
//                    float temp;
//                    temp=array[i];
//                    array[i]=array[j];
//                    array[j]=temp;
//                }
//            }
//        }
//        System.out.print("Sorted Array :    ");        for (float element : array) {
//                                                           System.out.print(element + ", ");
//                                                       }        System.out.println();
//        System.out.println("Largest element in the array is : "+array[array.length-1]);


//  Question 7
//        System.out.println("-- Finding minimum element in an array --");
//        float [] array = {12.2f,23.4f,4.6f,72.5f,11.11f,7.11f,15.2f};
//        System.out.print("Array :    ");         for (float element: array){
//                                                     System.out.print(element+", ");
//                                                 }        System.out.println();
//        for (int i=0; i< array.length; i++){
//            for (int j=i+1; j< array.length; j++){
//                if (array[i]>array[j]){
//                    float temp;
//                    temp=array[i];
//                    array[i]=array[j];
//                    array[j]=temp;
//                }
//            }
//        }
//        System.out.print("Sorted Array:    ");        for (float element: array){
//                                                            System.out.print(element+", ");
//                                                      }        System.out.println();
//        System.out.println("Minimum element in the array is : "+array[0]);


//  Question 8
//        System.out.println("-- Check if the array is sorted or not --");
//        float [] array = {12.2f,23.4f,4.6f,72.5f,11.11f,7.11f,15.2f};
//                                               for (float element: array){
//                                                   System.out.print(element+", ");
//                                               }System.out.println();
//        System.out.print("status : ");
//        boolean is_sorted=true;
//        for (int i=0; i< array.length-1; i++){
//            if (array[i]>array[i+1]){
//                is_sorted=false;
//                break;
//            }
//        }
//        if (is_sorted){            System.out.println("Array is sorted");}
//        else {                     System.out.println("Array is not sorted");}
    }
}
