//     ----------------   we can create CUSTOM Exceptions using exception class  ------------
import java.util.Scanner;


//      Goooo...........! see the exception package for more


public class l83_Exception_class {
    private static void validateAge(int age){
        if (age<0){
            System.out.println("Age can't be negative");
        }
    }
    public static void main(String[] args) {
        System.out.println("-- Exception Class  --");
    }
}
