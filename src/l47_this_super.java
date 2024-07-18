import java.util.Scanner;

class Class{    int a;
    Class(){   System.out.println("Class : default constructor..!");   }
    Class(int a){
        this.a=a;
        System.out.println("Class : Parameterised constructor---->"+a);
    }
    public int return_one(){    return 1;   }
}
class Student extends Class{    int b;
    Student(){
        System.out.println("Student : Default constructor..!");
    }
    Student(int b){
        super(b);
        this.b=b;
        System.out.println("Student  : parameterised constructor----->"+b);
    }
    public int return_one(){    return 1;   }
}

public class l47_this_super {
    public static void main(String[] args) {
        System.out.println("-- This & super keyword --");
        Class c1 = new Class(2);
        System.out.println("------------------------------");
        Student s1 = new Student(10);
    }
}
