import java.util.Scanner;
//public class l82_nested_try_catch {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int[] marks = new int[3];
//        marks[0]=7;
//        marks[1]=17;
//        marks[2]=69;
//        System.out.println("------- Nested try & catch -------");
//        System.out.print("Enter any index in the array... : "); int ind = sc.nextInt();
////-------------------------------------------------------------------------------------------------
//        System.out.println("Welcome to my programming world....!");
//        System.out.println(marks[ind]);
//        System.out.println("end of program");
////-------------------------------------------------------------------------------------------------
//        try {
//            System.out.println("Welcome to my programming world....!");
//            try {
//                System.out.println(marks[ind]);
//            }
//            catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Exception in level 2 : Sorry this index doesn't exist...!");
//            }
//        }
//        catch (Exception e){
//            System.out.println("Exception in level 1");
//        }
//        System.out.println("-----  END OF PROGRAM  -----");
//    }
//}


public class l82_nested_try_catch {
    public static void main(String[] args) {
        System.out.println("Quick Quiz");
        Scanner sc = new Scanner(System.in);
        int[] marks = new int[7];
        marks[0]=8;
        marks[1]=18;
        marks[2]=28;
        marks[3]=38;
        marks[4]=48;
        marks[5]=58;
        marks[6]=68;
        boolean flag = true;
        while (flag){
            System.out.print("Enter any index in the marks array : ");
            int i = sc.nextInt();
            try {
                try {
                    System.out.println("The element at index i is : "+marks[i]);
                    flag = false;
                }
                catch (ArrayIndexOutOfBoundsException e){
                    System.out.println("This index does not exist in this array....!");
                    System.out.println("Exception at level 2....!");
                }
            }
            catch(Exception e){
                System.out.println("Exception at level 1...!");
            }
        }
    }
}