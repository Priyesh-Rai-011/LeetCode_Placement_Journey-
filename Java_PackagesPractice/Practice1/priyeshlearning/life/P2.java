package Practice1.priyeshlearning.life;
class C2 extends C1{
    void c2(){   System.out.println("priyeshlearning || life || P2");   }
}
public class P2 {
    public int x=5;    protected int y=10;    int z=20;    private int a=95;

    public static void main(String[] args) {
        System.out.println("priyeshlearning || life");
        C2 obj2 = new C2();
        obj2.c2();
    //         only public protected & no-specifiers can be used in classes of same package
        System.out.println(obj2.x);
        System.out.println(obj2.y);
        System.out.println(obj2.z);
    }
}
