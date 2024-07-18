package Lab7;
import java.util.Scanner;
class manf_2d{
    float length,breadth;   float sheet_cost=40;
    manf_2d(float l,float b){
        this.length=l;  this.breadth=b;
    }
    void dimetions(){
//        length=l;  breadth=b;
        float area = length*breadth;
        System.out.println("The area of the sheet is : "+area+" sq unit");
        float cost_2d = (area)*(sheet_cost);
        System.out.println("Cost of manufacturing the sheet : "+cost_2d);
    }

}
class manf_3d extends manf_2d{
    float height;   float box_cost=60;
    manf_3d(float l, float b, float h){
        super(l,b);
        this.height=h;
    }
    @Override
    void dimetions(){
        float volume = length*breadth*height;
        System.out.println("The volume of the sheet is : "+volume+" sq unit");
        float cost_3d = volume*box_cost;
        System.out.println("Cost of manufacturing the box : "+cost_3d);
//        super(l,b);
//        this.length=length;  this.breadth=breadth;
//        height = h;
    }
}
public class Q1 {
    public static void main(String[] args) {
        System.out.println("------- for 2 dimensions -------");
        manf_2d obj1 = new manf_2d(10,10);
        obj1.dimetions();
        System.out.println("------- for 3 dimensions -------");
        manf_3d obj2 = new manf_3d(10f,10,20f);
        obj2.dimetions();
    }
}
//