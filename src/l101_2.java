import java.io.*;
import java.util.*;
public class l101_2 {
    public static void main(String[] args) {
        System.out.println("- - - - - - - - - - - - - - - - - - - -");
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        File f = new File("priyesh.txt");
        try {
            f.createNewFile();
        }catch (IOException e){
            System.out.print("EXCEPTION(in file) :  ");
            System.out.println(e.getMessage());
        }

    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        try {
            FileWriter fw = new FileWriter("priyesh.txt");
            fw.write("PRIYESH RAI\n");
            fw.write("Wants to achieve something good in life...\n");
            fw.write("but, he is unable to find a way right now...\n");
            fw.write("not even able to get respect from his batch mates\n");
            fw.write("BUT, He will definitely find a way....!\n");
            fw.write("He will....!\n");
        // ------------- why do we use close method -------------------
        fw.close();
           fw.write("does it work...!?");
        // --------------------------------
        }catch (IOException e){
            System.out.print("EXCEPTION :  ");
            System.out.println(e.getMessage());
        }
    //++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        try {
            FileReader fr = new FileReader("priyesh.txt");
            String str = "--------<<<<<<<{{{{{{{(((((((([[[[]]]]))))))))}}}}}}}>>>>>>>--------";     int i;
            while ((i = fr.read()) != -1){
//                str = str + (char)i;
                System.out.print((char) i);
//                System.out.println("----------------------------");
            }
            fr.close();
            System.out.println(str);
        }catch (FileNotFoundException e){
            System.out.print("EXCEPTION(not found) :  ");
            System.out.println(e.getMessage());
        }catch (IOException e){
            System.out.print("EXCEPTION(in reading the file) :  ");
            System.out.println(e.getMessage());
        }
    }
}
