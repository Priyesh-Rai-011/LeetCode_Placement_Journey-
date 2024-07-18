import java.util.Scanner;
interface camera2{
    void takeShot();    void recordVideo();
    private void focus(){System.out.print("Focussing on the OBJECT    ||    ");}
    //  this is a private method -- so it can't be implemented in the clsses
    //  it can't be implemented DIRECTLY
    //  so , what's the use of it.......???????
    default void record4KVideo(){        // IF logic of your DEFAULT method gets too big.....
        // you can use  (private method) to implement in the place of the default method
        focus();
        System.out.println("Recording Video in 4K  ............");
    }
//  if we create default method.....then we don't have to implement it ALL the CLASSES using the interface
//  you just have to describe the method in the interface only
//  you can OVER-RIDE the method in the CLASS later  --  if you want to use it .
}
interface wifi2{
    String[] getNetworks();  //     --> string array
    void connecttoNetwork(String network);
}
class CellPhone2{
    void takeSnap(){System.out.println("CLICK : Taking a Snap...!");}
    void pickCall(){System.out.println("Connecting...........");}
}
class SamrtPhone2 extends CellPhone2 implements camera2,wifi2{
    public void takeShot(){System.out.println("CLICK : Taking a Snap...!");}
    public void recordVideo(){System.out.println("Recording Video......!");}
    //    public void record4KVideo(){System.out.println("SNAP    ||    Recording Video in 4K  ............");}
    public String[] getNetworks(){  //      -->  a function of datatype (string array)    -- will return string array
        System.out.print("Getting List of Networks......There are 4 networks  \n");
        String[] networkList = {"Anonymous","KIIT-WIFI-NET","IQOO Neo 6","aruba-ap"};  //       -->  string array
        return networkList;
    }
    public void connecttoNetwork(String network){
        System.out.println("Connecting to : "+network);
    }
}
public class l59_Polymorphiism_in_Interface {
    public static void main(String[] args) {
        System.out.println("------- POLYMORPHISM IN INTERFACES -------");
        System.out.println("-- Default Methods --");
        SamrtPhone2 A7 = new SamrtPhone2();
        String[] wifi = A7.getNetworks();
        for (String network : wifi){    System.out.print(network+"    ||    ");    }System.out.println();
        A7.connecttoNetwork("KIIT-WIFI-NET");
        System.out.println("---------------------------------------------------");
        System.out.println("           ----------- CAMERA -----------");
        A7.takeShot();
        A7.recordVideo();
        A7.record4KVideo();
        System.out.println("---------------------------------------------------");
        camera2 NIKKON = new SamrtPhone2();     // this is a smartphone , but it can only be used as a camera...
        NIKKON.record4KVideo();
    }
}
