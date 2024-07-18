package SESSIONAL.Q1;
//import Q1.*;
public class NoTriangleform_Exception extends Exception{
    int a,b,c;
    NoTriangleform_Exception(int a,String msg){
        this.a=a;
        System.out.println("Length of side is : "+this.a+"\n"+msg);
    }
    NoTriangleform_Exception(int a,int b,int c,String msg){
        this.a=a;   this.b=b;   this.c=c;
        System.out.println("A triangle can't be formed with these sides :-->  "+a+","+b+","+c);
    }
}
