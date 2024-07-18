import java.util.Scanner;
class employee{     private int id;    private String name;
    public void set_id(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of th employee : ");        int ID = sc.nextInt();
        this.id=ID;
    }
    public void set_name(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name of the employee : ");        String NAME = sc.next();
        this.name=NAME;
    }
    public void get_id(){
        System.out.println("ID of the employee is "+id);
    }
    public void get_name(){
        System.out.println("Name of the employee is "+name);
    }
}
public class l40_AccessModifier {
    public static void main(String[] args) {
        System.out.println("-- Access Modifiers --");
        employee priyesh = new employee();
//        priyesh.id=814;
//        priyesh.name="Priyesh Rai";
//        System.out.println(priyesh.id);
//        System.out.println(priyesh.name);
    priyesh.set_id();
    priyesh.set_name();
    priyesh.get_id();
    priyesh.get_name();
    }
}
