package Lab5;

public class Q4_2 {
    public static int count;
    Q4_2(){count++;}
    public static void main(String[] args) {
        System.out.println("counting no of objects made : ");
        Q4_2 obj1 = new Q4_2();
        Q4_2 obj2 = new Q4_2();
        Q4_2 obj3 = new Q4_2();
        Q4_2 obj4 = new Q4_2();
        Q4_2 obj5 = new Q4_2();
        Q4_2 obj6 = new Q4_2();
        Q4_2 obj7 = new Q4_2();
        Q4_2 obj8 = new Q4_2();
        System.out.println("---------");
        System.out.println(count);
    }
}
