package Package_PracticeSet.subclass_AccessModifiers.Package1;
class Calculator1_1{
    int n1=2;
    public int n2=20;
    protected int n3=39;
    private int n4=40;
    void calc(int a,int b){
        System.out.println("Sum of the numbers is : "+(a+b));
    }
}
public class Q1_1 {
    public static void main(String[] args) {
        System.out.println("Package 1");
        Calculator1_1 CASIO = new Calculator1_1();
        CASIO.calc(10,20);
        System.out.println(CASIO.n1);
        System.out.println(CASIO.n2);
        System.out.println(CASIO.n3);
//        System.out.println(CASIO.n4);
    }
}
