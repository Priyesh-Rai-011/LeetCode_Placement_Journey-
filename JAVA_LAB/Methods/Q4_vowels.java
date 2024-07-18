package Methods;
//import javax.swing.plaf.IconUIResource;
import java.util.Scanner;

public class Q4_vowels {
    static boolean isVowel(char ch){
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
    static void vowelCount(String str){
        int count =0;
        str = str.toLowerCase();
        for (int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if (isVowel(ch)){
                count++;
            }
        }
        System.out.println("There are "+count+" vowels in the String....");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----  Counting Vowels  ----");
        System.out.print("Enter the String : ");
        String str = sc.next();

        vowelCount(str);
    }
}
