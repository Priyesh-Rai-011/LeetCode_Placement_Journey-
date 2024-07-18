import java.util.Scanner;
public class l16_conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name : ");        String name = sc.next();
        System.out.println("Hello..! : "+name);

//  ( if - else ) condition ..
//        System.out.println(" if-else condition...!");
//        int a = 18;
//        System.out.print("Enter the age of the boy : ");        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if(age > a)    {  System.out.println("Yes, he can have a driving licence..!");    }
//        else           {  System.out.println("No, he can't have a driving licence now..!");   }

//  ( Switch Case statements)
//        System.out.println("switch - case statement...!");
        int age;
        Scanner SC = new Scanner(System.in);
        System.out.print("Enter your age : ");        age = SC.nextInt();
        if (age>100){
            System.out.println("DON'T LIE.......You are already dead by now.......!");
        }
        else {

        switch (age) {
            case 18 ->{            System.out.println("You are going to become an adult.");
                                   System.out.println("You are going to become an adult.");
                                   System.out.println("You are going to become an adult.");
                                   System.out.println("You are going to become an adult.");
            }
            case 21 -> System.out.println("You are going to get a job");
            case 60 -> System.out.println("You are going to retire ..!");
            case 55 -> System.out.println("You are going to retire soon");
            default -> System.out.println("You are just Enjoying your life, working hard ...!");
        }
        }
    }
}
