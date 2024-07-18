package Q5_Package.P2;
import Q5_Package.P1.calculator1_1;
import Q5_Package.P1.calculator1_1;

class calculator1_2{
    public void calc(int a, int b){
        System.out.println("sin(a+b) : " + (Math.sin(a+b)));
    }
}
public class Q5 {
    public static void main(String[] args) {
        System.out.println("------- Access Modifiers -------");
        calculator1_1 CASIO = new calculator1_1();
        System.out.println(CASIO.n2);
//        System.out.println(CASIO.n3);
        CASIO.calc(20,40);
        System.out.println("----------------------------------------------------");
        calculator1_2 CASIO2 = new calculator1_2();
        CASIO2.calc(34,92);
    }
}
