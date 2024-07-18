package AbstractClass_Interfaces;
interface Drawable{
    void draw();
}
class Circle2 implements Drawable{
    @Override
    public void draw() {System.out.println("draw Circle");}
}
class Triangle2 implements Drawable{
    @Override
    public void draw() {System.out.println("draw Triangle");}
}
public class draw {
    public static void main(String[] args) {
        System.out.println("Drawing different shapes : ");
        Drawable s;
        s = new Circle2(); s.draw();
        s = new Triangle2(); s.draw();

    }
}
