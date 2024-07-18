import java.util.Scanner;
interface SI{
    void method1();    void method2();
}
interface Child_SI extends SI{
    void method3();    void method4();
}
class SC implements Child_SI{
    public void method1() {    System.out.println("METHOD 1");  }
    public void method2() {    System.out.println("METHOD 2");  }
    public void method3() {    System.out.println("METHOD 3");  }
    public void method4() {    System.out.println("METHOD 4");  }
}
public class l58_intrface_nheritance {
    public static void main(String[] args) {

    }
}

//              *******************     ANOTHER EXAMPLE      *******************

//import java.util.Scanner;
//interface CNG_Car{
//    void drive();   void cng_kit();
//}
//interface Peterol_car{
//    void drive();
//    void petrol_kit();
//}
//class Hybrid_Car implements Peterol_car,CNG_Car{
//    @Override
//    public void drive() {
//        System.out.println("Driving a Hybrid Class....");
//    }
//    public void cng_kit(){
//        System.out.println("Using the CNG kit for Hybrid car...");
//    }
//    public void petrol_kit(){
//        System.out.println("Using the Petrol kit for Hybrid car...");
//    }
//}
//public class l58_intrface_nheritance {
//    public static void main(String[] args) {
//        System.out.println("---- multiple inheritance using interface ----");
//        Hybrid_Car Polo_GT = new Hybrid_Car();
//        Polo_GT.drive();
//        Polo_GT.cng_kit();
//        Polo_GT.petrol_kit();
//    }
//}


//              *******************     ANOTHER EXAMPLE      *******************
//import java.io.*;
//interface intfA{    void prutorName();      }
//interface intfB extends intfA {    void prutorInstitute();      }
//// class implements both interfaces and provides
//// implementation to the method.
//class sample implements intfB {
//    public void prutorName(){     System.out.println("prutor"); }
//    public void prutorInstitute(){    System.out.println("IITK"); }
//
//}
//
//public class l58_intrface_nheritance {
//    public static void main(String[] args) {
//        sample ob1 = new sample();
//// calling the method implemented
//// within the class.
//        ob1.prutorName();
//        ob1.prutorInstitute();
//    }
//}