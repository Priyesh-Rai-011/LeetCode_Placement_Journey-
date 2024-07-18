package ex5_custom_package;

public class rectangle extends area_volume.Shape {
    // double d1,d2;
    rectangle(double d1, double d2){    
        super(d1,d2);
    }
    public double area(){
        System.out.print("RECTANGLE || Calculating area : ");
        return (this.d1)*(this.d2);
    }

    public static void main(String[] args) {
        rectangle rec = new rectangle(10,10);
        System.out.println(rec.area());
        System.out.println(rec.d1);
        System.out.println(rec.d2);
    }
}
  