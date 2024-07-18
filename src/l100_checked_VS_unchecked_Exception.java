import java.io.*;
public class l100_checked_VS_unchecked_Exception {
    public static void main(String[] args) throws IOException {
        System.out.println("-------------------------");
        FileWriter fw = null;
        try {
            fw = new FileWriter("textDocument.txt");
        }catch (Exception e){
            System.out.println("EXCEPTION : ");
            System.out.println(e.getMessage());
        }
        fw.write("Hello...!");

        fw.close();
        try {
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println("EXCEPTION : A number can't be divided by 0.");
            System.out.println(e.getMessage());
        }
    }
}
