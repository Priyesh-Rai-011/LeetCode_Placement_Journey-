public class l33_VAR_ARGS {
//   Example of Varargs
    static int sum(int x,int ...arr){
        int result=x;
        for (int element: arr){
            result += element;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println("---- Varargs ----");
//        System.out.println("Sum of nothing is : "+sum());// ---> This will throw an error
        System.out.println("Sum of 4 & 5 is : "+sum(4,5));
        System.out.println("Sum of 4, 3 & 5 is : "+sum(4,3,5));
        System.out.println("Sum of 4, 3, 7 & 5 is : "+sum(4,3,7,5));
        System.out.println("Sum of 4, 3, 7, 5 & 1 is : "+sum(4,3,7,5,1));
    }
}
