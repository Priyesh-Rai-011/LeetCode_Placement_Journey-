//           **************************   IMPORTANT   **************************
import java.util.Scanner;
import java.util.Random;
class Game{
    int user_choice,comp_choice;     int count =0;
    public Game(){
        Random random = new Random();
        this.comp_choice = random.nextInt(100);
    }
    public void take_user_input(){
        System.out.println("--  You have choose between 0 to 100  --");
        System.out.print("Enter the number you choose...? : ");
        Scanner sc = new Scanner(System.in);
        this.user_choice = sc.nextInt();
    }
    boolean is_correct_number(){
        count++;
        if (user_choice==comp_choice)        {System.out.println("You have guessed the number correctly...!"); return true;}
        else if (user_choice<comp_choice)     {System.out.println("Number guessed is less then computer generated number...!");}
        else if (user_choice>comp_choice){System.out.println("Number guessed is greater then computer generated number...!");}
        System.out.println("You took "+count+" attempts---->");
        return false;
    }
}
public class EX3_inheritance_guessthenumber {
    public static void main(String[] args) {
        System.out.println("-- Guess the number Game --");
        boolean b = false;
        Game g1 = new Game();
        while (!b){
            g1.take_user_input();
            b = g1.is_correct_number();
        }
        System.out.println("Computer choice was : "+g1.comp_choice);
    }
}
