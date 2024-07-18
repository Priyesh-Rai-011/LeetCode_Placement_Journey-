import java.util.Scanner;
////  Question 1 & 2
//abstract class Pen{
//     abstract void write();     abstract void refill();
//}
//class FountainPen extends Pen{
//    void write(){    System.out.println("FOUNTAIN PEN    ||    is used for writing ........!");  }
//    void refill(){    System.out.println("No ink   ||    Refilling the PEN..........!");   }
//    void changeNib(){    System.out.println("The nib got broken   ||    Change the nib.....!");}
//}
//public class ch11_PS {
//    public static void main(String[] args) {
//        System.out.println("------- Question 1 & 2 -------");
//        Pen ref;
//        ref = new FountainPen();
//        ref.write();
//        ref.refill();
//        FountainPen Reynolds = new FountainPen();
//        Reynolds.write();
//        Reynolds.refill();
//        Reynolds.changeNib();
//    }
//}


////  Question 3 & 5 (demonstrating polymorphism)
//class Monkey{
//    void jump(){System.out.println("MONKEY    ||    Jumping....");}
//    void bite(){System.out.println("MONKEY    ||    Biting....");}
//}
//interface BasicAnimal{
//    void eat();    void sleep();
//}
//class Human extends Monkey implements BasicAnimal{
//    public void eat(){System.out.println("HUMAN    ||    Eating....");}
//    public void sleep(){System.out.println("HUMAN    ||    Sleeping....");}
//}
//public class ch11_PS {
//    public static void main(String[] args) {
//        System.out.println("------- Question 3 -------");
//        Human Priyesh = new Human();
//        Priyesh.bite();
//        Priyesh.jump();
//        Priyesh.eat();
//        Priyesh.sleep();
//        System.out.println("--------------- Q5 - Demonstrating Polymorphism ----------------");
//        Monkey Ranajoy = new Human();
//        Ranajoy.bite();
//        Ranajoy.jump();
//    }
//}


//// Question 4
//abstract class Telephone{
//    abstract void ring();
//    abstract void lift();
//    abstract void disconnect();
//}
//class SmartPhone extends Telephone{
//    void ring(){System.out.println("");}
//    void lift(){System.out.println("");}
//    void disconnect(){System.out.println("");}
//}
//public class ch11_PS {
//    public static void main(String[] args) {
//        System.out.println("------- Question 4 -------");
////  demonstrating polymorphism
//        Telephone NOKIA = new SmartPhone();
//        NOKIA.lift();
//        NOKIA.ring();
//        NOKIA.disconnect();
//    }
//}


////  Question 6 & 7
//interface TVRemote{
//    void powerON();    void powerOFF();    void setChannel();
//}
//interface SmartTVRemote extends TVRemote{
//    void AndroidMode();    void subscriptionGames();
//}
//class TV implements TVRemote{
//    public void powerON(){System.out.println("Switching on the TV .....!");}
//    public void powerOFF(){System.out.println("Switching off the TV .....!");}
//    public void setChannel(){System.out.println("SELECTING A CHANNEL ......!");}
//}
//public class ch11_PS {
//    public static void main(String[] args) {
//        System.out.println("--------------- Question 6 & 7 -----------------");
//        TV Sony = new TV();
//        Sony.powerON();
//        Sony.setChannel();
//        Sony.powerOFF();
//    }
//}
