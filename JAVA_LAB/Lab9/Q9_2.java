package Lab9;
import java.util.Scanner;
public class Q9_2 {
    public static void main(String[] args) {
        System.out.println("-------");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any String : your name:-  ");
        String name = sc.next();
//        String n1 = toUpperCase(name);
        System.out.println("String  after changing the cases to upper : "+name.toUpperCase());
        System.out.println("String  after changing the cases to lower : "+name.toLowerCase());
        System.out.println("---------Reversing the string---------");
        String reverse = "";
        for(int i=0;i<name.length();i++){
            char ch = name.charAt(i);
            reverse = ch+reverse;
        }
        System.out.println("Reverse string is : "+reverse);
        System.out.println("-------------Compare two string------------");
        System.out.print("Enter another string : ");
        String str2 = sc.next();
        if (name.length() == str2.length()){
            System.out.println("Both Strings are of equal lengths ...");
            for (int i=0;i<name.length();i++){
                if(name.charAt(i) == str2.charAt(i)){
                    System.out.println("These strings are equal..");
                }
                else {
                    System.out.println("These strings are not equal");
                }
            }
        }
        else {
            System.out.println("Strings are not even of equal lengths...");
        }
        System.out.println("--------------Concat two strings---------------");
        System.out.println("String 1 : "+name+"  &  String 2 : "+str2);
        System.out.println(str2.concat(name));
    }
}
