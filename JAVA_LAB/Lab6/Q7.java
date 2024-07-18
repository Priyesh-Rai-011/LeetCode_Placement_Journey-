package Lab6;
import java.util.Scanner;
class Numbers{
    int n;  int arr[];
    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements ");
        this.n = sc.nextInt();
        this.arr = new int[n];
        for (int i=0; i<n; i++){
            System.out.print("Enter the "+i+"element :");
            this.arr[i] = sc.nextInt();
        }
    }
    void display(){
        for (int i=0; i<n; i++){
            System.out.print(arr[i]+", ");
        }
        System.out.println();
    }
    void swap(){
        int max_index=0,min_index=0;
        int max=arr[0], min=arr[0];
        for (int i=0; i<n; i++){
            if(arr[i] > max){
                max=arr[i];
                max_index=i;
            }
            if (arr[i] < min){
                min=arr[i];
                min_index=i;
            }
        }
        int temp = arr[max_index];
        arr[max_index] = arr[min_index];
        arr[min_index]=temp;
    }
}
class Q7 {
    public static void main(String[] args) {
        Numbers n = new Numbers();
        n.read();
        System.out.println("Before swapping");
        n.display();
        n.swap();
        System.out.println("After swapping");
        n.display();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("enter the number of elements ");
//        int n = sc.nextInt();
//        int arr[] = new int[n];
//        for (int i = 0; i < n; i++) {
//            System.out.println("Enter Element :  ");
//            arr[i] = sc.nextInt();
//        }
//
//        int max = arr[0];
//        int min = arr[0];
//        int max_index = 0;
//        int min_index = 0;
//        for (int i = 0; i < n; i++) {
//            if (arr[i] > max) {
//                max = arr[i];
//                max_index = i;
//            }
//            if (arr[i] < min) {
//                min = arr[i];
//                min_index = i;
//            }
//        }
//        int temp = arr[max_index];
//        arr[max_index] = arr[min_index];
//        arr[min_index] = temp;
//        System.out.println("after swapping ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+" ,");
//        }
//        sc.close();
    }
}
