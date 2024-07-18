package Lab4;
import java.util.Scanner;
public class Q5_2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter your complete name :");
        String name = sc.nextLine();
        System.out.println("NAME :-->  "+name);
        int l = name.length();        String n = name.toUpperCase();        String n2 = name.toLowerCase();
        System.out.println(l);
        System.out.println(n);
        System.out.println(n2);
        System.out.println("--------------------");
        String rev="->";
        for (int i=0; i<l; i++){
            System.out.print(name.charAt(i));
        }
        System.out.println();
        System.out.println("--------------------");
        int i=l-1;
        String temp = "";
        do {
//            i = l;
            System.out.print(name.charAt(i));
             temp = temp+name.charAt(i);
            rev = temp;
            i--;
//            rev= String.valueOf(name.charAt(i));
        }while (i != -1);
        System.out.println();
        System.out.println("--------------------");
        System.out.println("Reverse name is : ");
        System.out.println(rev);
    }
}
