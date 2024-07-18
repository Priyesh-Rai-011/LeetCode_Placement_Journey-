package LAB_Test;
import java.util.Scanner;
class Rational{
    Scanner sc = new Scanner(System.in);
    double num,den;
    void set_rational(){
        System.out.print("Enter the numerator : ");
        this.num=sc.nextInt();
        System.out.print("Enter the denominator : ");
        this.den=sc.nextInt();
    }
    void show(){
        System.out.println("Your Rational number is : "+num+"/"+den);
    }
}
public class Q2 {
    static Rational add(Rational o1,Rational o2){
        Rational N = new Rational();
        N.num = o1.num*o2.den+ o2.num* o1.den;
        N.den = o1.den*o2.den;
        System.out.println("Adding "+o1.num+"/"+o1.den+"  &  "+o2.num+"/"+o2.den+" : "+N.num+"/"+N.den);
        double val = N.num/N.den;
        System.out.println("After calculation the answer will be : "+val);
        return N;
    }
    public static void main(String[] args) {
        System.out.println("For first rational number");
        Rational obj1 = new Rational();
        obj1.set_rational();
        obj1.show();
        System.out.println("For second rational number");
        Rational obj2 = new Rational();
        obj2.set_rational();
        obj2.show();
        System.out.println("--------------------");
        add(obj1,obj2);
    }
}
