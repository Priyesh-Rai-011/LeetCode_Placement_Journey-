package area_volume;

public class cylinder extends Shape {
    // double d1,d2;
    cylinder(double d1,double d2){
        super(d1,d2);
    }
    public double area(){
        System.out.print("CYLINDER || Calculating surface area : ");
        return (2*(3.14d)*(d1)*(d2))+(2*(3.14d)*(d1*d1));
    }
    public double vol(){
        System.out.print("CYLINDER || Calculating volume : ");
        return (3.14d)*(d1*d1)*(d2);
    }
}
  