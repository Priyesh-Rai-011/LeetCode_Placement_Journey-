import java.util.Scanner;
public class L21_while_loop {
    public static void main(String[] args) {
        System.out.println("Hello....!");
        Scanner sc = new Scanner(System.in);
        int n=1;
//  ( While ) loop
        while (n <= 4){
            System.out.println(n+") "+"-.-.-.-.");
            n++;
        }
        System.out.println("--------------------------");

//  ( do - while ) loop
        int m=1;
        do {
            System.out.println(m+") "+"-.-.-.-.");
            m++;
        }while (m<=4);

        System.out.println("--------------------------");

        int o=5;
        do {
            System.out.print(o+") "+"-.-.-.-.");
            o++;
        }while (o<=4);
    }
}
