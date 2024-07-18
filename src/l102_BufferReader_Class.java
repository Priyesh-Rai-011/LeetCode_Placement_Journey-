import java.io.BufferedReader;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class l102_BufferReader_Class {
    public static void main(String[] args) throws IOException{
        System.out.println("------- I/O EXCEPTION -------");
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
//        FileReader fr = new FileReader("2.txt");

        System.out.print("Enter your name : ");
        String name = br.readLine();
        System.out.println("Welcome "+name);





        System.out.println("---------------------");
        System.out.println("Enter some lines");
        String str ="";
        String lines = "";
        String end = lines+"end";
        System.out.println("---------------------");

        while (!end.equals(lines) ){
            lines = br.readLine();
            str = str.concat(lines);
        }
        System.out.println("---------------------");
        String l2 = lines;
        System.out.println(str);
    }
}
