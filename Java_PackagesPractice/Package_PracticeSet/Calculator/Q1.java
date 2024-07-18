package Package_PracticeSet.Calculator;
import java.math.*;
class Calculator{
    public void calculate(int a, int b){
        System.out.println("Calculating your result -");
        System.out.println("Sum of the numbers is : "+(a+b));
    }
}
class ScCalculator{
    public void calculate(int a, int b){
        System.out.println("sin(a+b) = "+ Math.sin(a+b));
    }
}
class hybCalculator{
    public void calculate(int a,int b){
        System.out.println("sin(a+b) = "+ Math.sin(a+b));
        System.out.println("Sum of the numbers is : "+(a+b));
    }
}
public class Q1 {
    public static void main(String[] args) {
        System.out.println("------- Question 1 - Calculator -------");
        hybCalculator CASIO = new hybCalculator();
        CASIO.calculate(10,20);
    }
}
