import java.util.Scanner;
public class ch4_PS {
    public static void main(String[] args) {
        System.out.println("Practice Set - chapter 4");

//  Question 2.
//        System.out.println("Enter your marks below -");
//         Scanner sc = new Scanner(System.in);
//        System.out.print("Enter marks in sub-1 : ");         float m1 = sc.nextFloat();
//        System.out.print("Enter marks in sub-2 : ");         float m2 = sc.nextFloat();
//        System.out.print("Enter marks in sub-3 : ");         float m3 = sc.nextFloat();

//         float avg = (m1+m2+m3)/30f;

//        System.out.println("Your overall percentage is : "+ avg*10 +"%");
//        if (avg > 40 && m1 > 33 && m2 > 33 && m3 > 33){   System.out.println("Congratulations...! , you have passed th exam.");   }
//        else {            System.out.println("Sorry,but yuu failed. Better luck next time.");     }

//  Question 3
//        System.out.println("Income tax calculation");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter your salary : ");         float sal = sc.nextFloat();
//        if( sal > 250000 && sal < 500000){
//            System.out.println("5% income tax would be imposed.");
//            float tax = (sal*5)/100;
//            System.out.println("------Income TAX paid : " + tax);
//        }
//        else if( sal > 500000 && sal < 1000000){
//            System.out.println("20% income tax would be imposed.");
//            float tax = (sal*20)/100;
//            System.out.println("------Income TAX paid : " + tax);
//        }
//        else if( sal > 1000000){
//            System.out.println("30% income tax would be imposed.");
//            float tax = (sal*30)/100;
//            System.out.println("------Income TAX paid : " + tax);
//        }
//        else {
//            System.out.println("No tax would be deducted..!");
//            System.out.println("------Income TAX paid : 0");
//        }

//  Question 4

//        System.out.print("enter any number from 1-7 : ");
//        Scanner sc = new Scanner(System.in);
//        int day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("It's .... Monday");
//            case 2 -> System.out.println("It's .... Tuesday");
//            case 3 -> System.out.println("It's .... Wednesday");
//            case 4 -> System.out.println("It's .... Thursday");
//            case 5 -> System.out.println("It's .... Friday");
//            case 6 -> System.out.println("It's .... Saturday");
//            case 7 -> System.out.println("It's .... Sunday");
//        }

//  Question 5
  Scanner scanner = new Scanner(System.in);
  System.out.print("Enter a year: ");
  int year = scanner.nextInt();
  if (isLeapYear(year)) {
      System.out.println(year + " is a leap year.");
  } else {
      System.out.println(year + " is not a leap year.");
  }
  scanner.close();
    }
    public static boolean isLeapYear(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    return true;
                }
                else {
                    return false;
                }
            }
            else {
                return true;
            }
        }
        else {
            return false;
        }
    }
}

//   ********************  Question 6  ***********************
//        System.out.println("---- Finding the type of website from the URL ----");
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the website's URL : ");        String url = sc.next();
//        if      (url.endsWith(".org")) {  System.out.println("It's an Organisational website"); }
//        else if (url.endsWith(".com")) {  System.out.println("It's a Commercial website");   }
//        else if (url.endsWith(".in"))  {  System.out.println("It's an Indian website");   }
//    }
//}
