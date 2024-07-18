package Package_PracticeSet.subclass_AccessModifiers.Package2;
//import Package_PracticeSet.subclass_AccessModifiers.Package1.Package_PracticeSet.subclass_AccessModifiers.Package1.*;
class Calculator1_2 {
    int n1 = 2;
    public int n2 = 20;
    protected int n3 = 39;
    private int n4 = 40;

    void calc(int a, int b) {
        System.out.println("sin(a+b) : " + Math.sin(a+b));
    }
}
public class Q1_2 {
    public static void main(String[] args) {
        System.out.println("Package 2");
        Calculator1_2 CASIO = new Calculator1_2();
        CASIO.calc(10,20);
        System.out.println(CASIO.n1);
        System.out.println(CASIO.n2);
        System.out.println(CASIO.n3);
        System.out.println("------------------------------------------");
//        Calculator1_1
    }
}
