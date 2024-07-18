package AbstractClass_Interfaces;
interface Camera{
    void click();
    void record();
}
interface Radio{
    float freq=0;
    default void freq(float freq){
        System.out.println("Playing Radio at "+freq+"Hz - frequency");
    }
}
interface GPS{
    default void coordinates(float latitude, float longitude){
        System.out.println("You are at : "+latitude+" latitude & "+longitude+" longitude");
    }
}

abstract class SmartPhone implements Camera,Radio,GPS{
    @Override
    public void click() {
        System.out.print("Clicking photo from : ");
    }

    @Override
    public void record() {
        System.out.print("Recording video from : ");
    }

//    @Override
//    public void freq(float freq) {}
//    @Override
//    public void coordinates(float latitude, float longitude) {}
}

class Samsung extends SmartPhone{
    @Override
    public void click() {
        super.click();
        System.out.println(" from Samsung Galaxy S10 : ");
    }

    @Override
    public void record() {
        super.record();
        System.out.println(" from Samsung Galaxy S10 : ");
    }
}
class Vivo extends SmartPhone{
    @Override
    public void click() {
        super.click();
        System.out.println(" from VIVO V12 : ");
    }

    @Override
    public void record() {
        super.record();
        System.out.println(" from VIVO V12 : ");
    }
}
class Google extends SmartPhone{
    @Override
    public void click() {
        super.click();
        System.out.println(" from Google Pixel 2 : ");
    }

    @Override
    public void record() {
        super.record();
        System.out.println(" from Google Pixel 2 : ");
    }
}
class iPhone extends SmartPhone{
    @Override
    public void click() {
        super.click();
        System.out.println(" from iPhone 13 Pro MAX : ");
    }

    @Override
    public void record() {
        super.record();
        System.out.println(" from iPhone 13 Pro MAX : ");
    }
}
public class Phone {
    public static void main(String[] args) {
        Samsung S10 = new Samsung();
        S10.click();
        S10.record();
        S10.freq(93.5f);
        S10.coordinates(34.82f,92.874f);

        System.out.println("----------oo0oo---------");

        iPhone iP13 = new iPhone();
        iP13.click();
        iP13.record();
        iP13.freq(101.45f);
        iP13.coordinates(72.7645f,92.35f);
    }
}
