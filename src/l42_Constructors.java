import java.util.Scanner;

class employee2{    int id;     String name;
//    default constructor
    public employee2(){this.id=814;    this.name="Priyesh Rai";}
//     parameterised constructor
    public employee2(String myName){this.id=814;    this.name=myName;}
    public void set_id(int ID){this.id=ID;}
    public void set_name(String NAME){this.name=NAME;}
    public void get_id(){System.out.println("Employee's id is : "+id);}
    public void get_name(){System.out.println("Employee's name is : "+name);}

}
public class l42_Constructors {
    public static void main(String[] args) {
        System.out.println("-- Constructors --");
        employee2 emp1 = new employee2("priyesh");
//        emp1.set_id(34);
//        emp1.set_name("Priyesh");
        emp1.get_id();
        emp1.get_name();
    }
}
