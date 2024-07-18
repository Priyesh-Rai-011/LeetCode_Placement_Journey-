package SESSIONAL.Q2;

public class MinException extends Exception{
    MinException(int m,String msg){
        System.out.println("Minutes - "+m+"\n"+msg);
    }
}
