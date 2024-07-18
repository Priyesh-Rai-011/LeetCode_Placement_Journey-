import java.util.Scanner;
import java.util.Random;
public class EX2_rock_paper_scissors {
    public static void main(String[] args) {
        System.out.println("ROCK , PAPER & SCISSORS");
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
         int comp_choice = random.nextInt(3);
        System.out.println("ROCK(0) ---> PAPER(1) ---> SCISSOR(2)");
        System.out.print("What do you choose ...? : ");
         int user_choice = sc.nextInt();


        if (user_choice > 2){System.out.println("Wrong Choice...!  Choose again");
        }
        else {
            System.out.println("You Choose : "+user_choice);
            System.out.println("Computer choose : "+comp_choice);
            System.out.println("ROCK(0) ---> PAPER(1) ---> SCISSOR(2)");


            if(comp_choice == user_choice){ System.out.println(" It's a Draw");
            }
            else if (comp_choice == 0) {
                if      (user_choice == 1) { System.out.println("You Won...!"); }
                else if (user_choice == 2) { System.out.println("Computer Won...!"); }
            }
            else if (comp_choice == 1) {
                if      (user_choice == 0) {System.out.println("Computer Won...!"); }
                else if (user_choice == 2) {System.out.println("You won...!"); }
            } else if (comp_choice == 2) {
                if      (user_choice == 0) {System.out.println("You won...!");}
                else if (user_choice == 1) {System.out.println("Computer won...!");}
            }
        }

    }
}
