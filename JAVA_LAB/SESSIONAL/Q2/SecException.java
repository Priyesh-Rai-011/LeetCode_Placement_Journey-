package SESSIONAL.Q2;

public class SecException extends Exception{
    SecException(int s,String msg){
        System.out.println("Seconds - "+s+"\n"+msg);
    }
}
