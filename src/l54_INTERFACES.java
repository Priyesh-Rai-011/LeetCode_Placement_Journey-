import java.util.Scanner;
interface Bicycle{
    int maxspeed=100;
    void applybreak(int decrement);    void speedup(int increment);
}
interface HornBicycle{
    void police_horn();
    void normal_horn();
}
class AvonCycle implements Bicycle, HornBicycle{
    int speed=7;
    public void applybreak(int decrement){
        System.out.println("Seed was : "+speed);
        System.out.println("Applying Break...!");
        speed = speed - decrement;
        System.out.println("Seed is : "+speed);
    }
    public void speedup(int increment){
        System.out.println("Speed was : "+speed);
        System.out.println("Speeding up...!");
        speed = speed + increment;
        System.out.println("Speed is :"+speed);
    }
    public void police_horn(){ System.out.println("nee-nore  nee-nore  nee-nore  nee-nore.......!"); }
    public void normal_horn(){ System.out.println("tring  tring  tring  tring  ......!");}
}
public class l54_INTERFACES {
    public static void main(String[] args) {
        System.out.println("-- INTERFACE --");
        AvonCycle C = new AvonCycle();
        C.speedup(10);
        System.out.println("----------------------------------------------");
        C.applybreak(5);
        System.out.println("----------------------------------------------");
        C.normal_horn();
        C.police_horn();

    //  you can create/access properties in Interfaces
        System.out.println(C.maxspeed);
    //  But....You can't modify the properties in Interface as they are final   (can't be modified)
    //    AvonCycle.maxspeed=120; //----> this will show an error
        System.out.println(AvonCycle.maxspeed);
    }
}
