import java.io.File;

public class l101_3_DELETING_FILE {
    public static void main(String[] args) {
        System.out.println("     DELETING A FILE     ");
        System.out.println("- - - - - - - - - - - - -");
        File f = new File("1.txt");
        if (f.delete()){
            System.out.println("File has been successfully deleted :  "+f.getName());
        }
        else {
            System.out.println("Some problem occurred while deleting the file");
            System.out.println("Try again.....");
        }

    }
}
