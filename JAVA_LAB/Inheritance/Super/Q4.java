package Inheritance.Super;

class Animal{
    protected String name;
    Animal(String name){
        System.out.println("This is an animal . It's name is : "+name);
    }
}
class Dog extends Animal{
    Dog(String name){
        super(name);
        System.out.println("This is a dog. It's name is : "+name);
        System.out.println("Doggy - Bhow bhow bhow...!!");
    }
}
public class Q4 {
    public static void main(String[] args) {
        System.out.println("<<<<    Animal - Dog    >>>>");
        Animal a = new Animal("Unknown");
        System.out.println("----------------");
        Dog d =new Dog("Aryan");
    }
}
