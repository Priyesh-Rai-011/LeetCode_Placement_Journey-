package area_volume;

public class Shape{
    public double d1,d2;
    public Shape(double d1,double d2){
        this.d1=d1;
        this.d2=d2;
    }
    public double getdim1(){
        return this.d1;
    }
    public double getdim2(){
        return this.d2;
    }
    public void setdim1(double dim1){
        this.d1 = dim1;
    }
    public void setdim2(double dim2){
        this.d2 = dim2;
    }
     public static void main(String[] args){
         System.out.println("------- Calculating surface area & volume of various Shapes -------");
         Shape S = new Shape(10,10);
         System.out.println(S.d1);
         System.out.println(S.d2);
         System.out.println("-------------------------------------------------------");
     }
}  