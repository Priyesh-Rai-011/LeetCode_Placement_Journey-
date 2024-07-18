package AbstractClass_Interfaces;
import java.util.Scanner;

interface Resizable{
    void resize(float percent);
}
class Rectangle2 implements Resizable{
    private float length,width;
    public Rectangle2(float length,float width){
        this.length=length;this.width=width;
    }

    @Override
    public void resize(float percent) {
        this.length = (length*percent)/100;
        this.width = (width*percent)/100;
    }

    @Override
    public String toString() {
        return "Rectangle : length = "+length+" || width = "+width;
    }
}
public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Resizing the length & width of the Rectangle");
        System.out.print("Enter the length & width : ");
        float l = sc.nextFloat();float b = sc.nextFloat();

        Rectangle2 R = new Rectangle2(l,b);
        System.out.println(R);
        System.out.print("Enter the % by which you want to resize the Rectangle : ");
        float per = sc.nextFloat();
        R.resize(per);
        System.out.println(R);
    }
}
