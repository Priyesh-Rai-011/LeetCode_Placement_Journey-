package area_volume;

public class circle extends Shape {
    // double d1;
    circle(double d1){
        super(d1,-1);
    }
    public double area(){
        System.out.print("CIRCLE || Calculating area : ");
        return (3.14d)*(d1)*(d1);
    }
}
  