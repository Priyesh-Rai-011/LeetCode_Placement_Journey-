import java.io.*;
import java.util.Scanner;

public class l101_Files {
    public static void main(String[] args) throws IOException {
        System.out.println("------- I/O FILE HANDLING ------");
    // code to CREATE a file
        File my_file = new File("cwh_101.txt");
        try {
            my_file.createNewFile();
        }catch (IOException e){
            System.out.print("EXCEPTION :  ");
            System.out.println(e.getMessage());
        }
    // code to WRITING TO a file
        FileWriter fileWriter = new FileWriter("cwh_101.txt");
        fileWriter.write("Hello...!\n");
        fileWriter.write("This is our 1st file from java course...! \nOK bye now..!");
        fileWriter.close();
//        System.out.println(fileWriter);

    // code for READING a file
        try {
            Scanner sc = new Scanner(my_file);
            while (sc.hasNextLine()){
                System.out.println(sc.nextLine());
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.print("EXCEPTION :  ");
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }
}
