package SESSIONAL.Q2;
import java.util.Scanner;
class Time{
    int hours,minutes,seconds;
    Time(int h,int m,int s){
        this.hours=h;
        this.minutes=m;
        this.seconds=s;
        try {
            if (h>24 || h<0){throw new HrsException(h,"Hours can't be more than 24");}
            if (m>60 || m<0){throw new MinException(h,"Minutes can't be more than 60");}
            if (s>60 || s<0){throw new SecException(h,"Seconds can't be more than 60");}
        }
        catch (HrsException e){
            System.out.println("EXCEPTION : incorrect hour");
        }
        catch (MinException e){
            System.out.println("EXCEPTION : incorrect minutes");
        }
        catch (SecException e){
            System.out.println("EXCEPTION : incorrect seconds");
        }
        System.out.println("Time is : "+h+":"+m+":"+s);
        System.out.println("------------------------");
    }
}

public class Q2 {
    public static void main(String[] args) {
        System.out.println("        ------- Time Exception -------");
        System.out.println("-------- Demonstrating a 24 hour clock -------");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the current time in your watch : ");
        int h = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        System.out.println("------------------------");
        Time T = new Time(h,m,s);
    }
}
