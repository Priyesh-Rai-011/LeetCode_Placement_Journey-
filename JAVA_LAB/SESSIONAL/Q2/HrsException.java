package SESSIONAL.Q2;

public class HrsException extends Exception{
    HrsException(int h,String msg){
        System.out.println("Hours - "+h+"\n"+msg);
    }
}
