import java.util.Scanner;
class Employee1{
    int id;
    String name;
    void print_details(){
        System.out.println("My ID is : "+id);
        System.out.println("My name is : "+name);
    }
}
public class l38_class {
    public static void main(String[] args) {
        System.out.println("Custom class..!");
        Employee1 emp1 = new Employee1();
        Employee1 emp2 = new Employee1();
        emp1.id = 814;
        emp1.name = "Priyesh";
        emp2.id = 813;
        emp2.name = "Pragyanshu";
//        System.out.println(emp1.id);
//        System.out.println(emp1.name);
        emp1.print_details();
        emp2.print_details();
    }
}
