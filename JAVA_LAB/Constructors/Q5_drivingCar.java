package Constructors;

class Car{
    String make,model; int year;
    Car(String make,String model,int yr){
        this.make=make;
        this.model=model;
        this.year=yr;
    }
    void startEngine(){
        System.out.println("Engine Started >>>>>>> !!");
    }
    void drive(){
        System.out.println("Driving the >> "+make+" | "+model+" | "+year);
    }
}
public class Q5_drivingCar {
    public static void main(String[] args) {
        System.out.println("----  Driving Car  ----\n\n");

        Car AstonMartin = new Car("Aston Martin","Sports",2011);
        AstonMartin.startEngine();
        AstonMartin.drive();
    }
}
