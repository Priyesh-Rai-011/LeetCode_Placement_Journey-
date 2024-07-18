package Lab6;
import java.util.Scanner;
class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
    static float add(float a, float b, float c, float d){
        return (a+b+c+d  );
    }
}
class Q2{
    public static void main(String[] args){
        System.out.println(Adder.add(11,11));
        System.out.println(Adder.add(11,11,11));
    }
}