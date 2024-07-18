package area_volume;

public class square extends Shape {
    // double d1,d2;
    square(double d1, double d2){
        super(d1,d2);
    }
    public double area(){
        System.out.print("SQUARE || Calculating area : ");
        return (this.d1)*(this.d2);
    }
}
  