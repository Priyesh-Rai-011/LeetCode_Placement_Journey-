package Lab10;
interface Numbers{
    int process(int x,int y);
}
class Sum implements Numbers{
    int x,y;
    public int process(int x,int y){this.x=x; this.y=y;
        int sum=x+y;
        System.out.println("Sum of "+x+"& "+y+" is : "+sum);
        return sum;
    }
}
class Average implements Numbers{
    int x,y;
    public int process(int x, int y) {
        this.x=x; this.y=y;
        int avg=(x+y)/2;
        System.out.println("Average of "+x+"& "+y+" is : "+avg);
        return avg;
    }
}
public class Q1 {
    public static void main(String[] args) {
        Sum obj1 = new Sum();
        obj1.process(10,20);
        Average obj2 = new Average();
        obj2.process(10,30);
    }
}
