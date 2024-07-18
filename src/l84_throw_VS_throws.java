//import java.beans.PropertyEditorSupport;
import java.util.Scanner;
//import java.lang.Throwable;
//import java.lang.String;
//class No_Exception extends Exception{
//    public No_Exception(String msg){
//        System.out.println(msg);
//    }
//}
class NegRad_Exception extends Exception{
    @Override
    public String toString() {
        return "toString   : Radius can not be -ve";
    }
    @Override
    public String getMessage() {
        return "getMessage : Radius can not be -ve";
    }
    public NegRad_Exception(String msg){
        System.out.println(msg);
    }
}

public class l84_throw_VS_throws {
    public static double area(int r) throws NegRad_Exception{
//        System.out.println("Calculating are of circle");
        int rad=r;
        if (rad<0){throw new NegRad_Exception("Radius can not be -ve");}
        double area = Math.PI*rad*rad;
        return area;
    }
//    public static void divide(int a,int b) throws No_Exception{
//        int r=0;
//        try {
//            r = a/b;
//            if (b<0){
//                throw new No_Exception("A number can't be divided by 0");
//
//            }
//        }catch (No_Exception e){
//            System.out.println("Exception");
//        }
//        System.out.println("RESULT :: (a/b) = "+r);
//    }
    public static void main(String[] args) {
        System.out.println("-------  Throw vs Throws  -------");
//        try {
//            divide(7,0);
//        }catch (No_Exception e ){
//            System.out.println("EXCEPTION");
//        }

        System.out.println("Calculating area of the circle");
        System.out.println("----------------------------------------");
        System.out.print("Enter the radius of the circle : ");
        Scanner sc = new Scanner(System.in);
        try {
            int radius= sc.nextInt();
            double ar = area(radius);
            System.out.println(ar);
        }catch (NegRad_Exception e){
            System.out.println("EXCEPTION");
        }
    }
}
