package Lab9;
interface motor{
    float capacity=250;
    void run();    void consume();
}
class Washing_Machine implements motor{
    public void run(){System.out.println("washing machine || motor is running");}
    public void consume(){System.out.println("Washing machine || motor in consuming energy up");
                          System.out.println("The capacity of washing machine's motor is : "+capacity+" W/hr");}
}
public class Q8_2 {
    public static void main(String[] args) {
        System.out.println("-------");
//        Washing_Machine obj1 = new motor();
        motor obj = new Washing_Machine();
        obj.run();
        obj.consume();
    }
}
