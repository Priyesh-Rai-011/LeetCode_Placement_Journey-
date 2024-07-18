//package JAVA_PRACTICE.ex5_custom_package.area_volume;
package ex5_custom_package;
//import ex5_custom_package.area_volume.*;
public class sphere extends area_volume.Shape {
    // double d1;
    sphere(double d1){
        super(d1,-1);
    }
    public double area(){
        System.out.print("SPHERE || Calculating surface area :  ");
        return 4*(3.14d)*(d1*d1);
    }
    public double vol(){
        System.out.print("SPHERE || Calculating volume : ");
        return (4/3)*(3.14d)*(d1*d1*d1);
    }
    public static void main(String[] args){
        System.out.println("------- Calculating surface area & volume of various Shapes -------");
        sphere s = new sphere(10.00d);
        System.out.println(s.area());
        System.out.println(s.vol());
//        s.vol();
    }

}
  