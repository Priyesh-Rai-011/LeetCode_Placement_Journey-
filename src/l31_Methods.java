import java.util.Scanner;
public class l31_Methods {
    int logic(int x, int y){
        int z;
        if(x>y) {  z=x+y;    }
        else    {  z=(x+y)*5;}
        return z;
    }
    public static void main(String[] args) {
        System.out.println("---- Methods ----");
        l31_Methods obj = new l31_Methods();
        int a=5,b=7,c;
        c=obj.logic(a,b);

        int a1=2,b1=1,c1;
        c1=obj.logic(a1,b1);

        System.out.println(c);
        System.out.println(c1);
    }
}
