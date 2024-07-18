import java.util.Scanner;
public class L24_break_continue {
    public static void main(String[] args) {
        System.out.println("---- Break & Continue ----");
//
//  This is an illustration of ( break )
//        for (int i=0 ; i<5 ; i++){
//            System.out.println(i+" : JAVA is great ----> But my teacher is not that good..!");
//            if (i==2){
//                System.out.println("Ending the loop..!");
//                break;
//            }
////            break;
//            System.out.println("The loop ends here");
//        }
////  This is an illustration of ( continue )
//        System.out.println("-------------------------------------------------");
//
//        for (int i=0; i<5; i++){
//            System.out.println(i+ " : JAVA is great ----> But my teacher is not that good..!");
//            if(i == 2){
//                System.out.println("Ending the loop..!");
//                continue;
//            }
////           continue;
//            System.out.println(i + " : JAVA is great ----> But my teacher is not that good..!");
//        }
        int i=0;
        do {
            i++;
            System.out.println(i + " : JAVA is great ----> But my teacher is not that good..!");
            if (i == 2) {
                System.out.println("Ending of the loop..!");
                continue;
//                break;
            }
            System.out.println(i + " : JAVA is great ----> But my teacher is not that good..!");
        } while (i<5);
        System.out.println("Loop ends here..!");
    }
}
