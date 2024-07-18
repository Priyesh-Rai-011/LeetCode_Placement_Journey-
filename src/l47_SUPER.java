import java.util.Scanner;

class Animal{    int age;    String name;
    public Animal(){}
    public Animal(int age, String name){
        this.age = age;     this.name = name;
        System.out.println("I AM AN ANIMAL ||   age : "+age+" ; name : "+name);
    }
    public void makeNoise(){    System.out.print("HELLO..!...I AM AN ANIMAL."+"    ||    ");   }
    public void eat(){  System.out.println("Munch Munch ...! ---->  "); }
}
class Cat extends Animal{   String catFoodPreference;
    public Cat(){}
    public Cat(int age, String name, String catFoodPreference){
        super(age, name);      this.catFoodPreference=catFoodPreference;
        System.out.println("My catFood preference is : "+catFoodPreference);
    }
    public void makeNoise() {
        super.makeNoise();
        System.out.println("Meow meow meow ...!");
    }
    public void jump(){
        super.makeNoise();
        System.out.println("Jumping here & there ...!");
        eat();
    }
    public void eat() {
        super.eat();
        System.out.println("Chop....chop || Munch....Munch");
    }
}
public class l47_SUPER {
    public static void main(String[] args){
        Cat c = new Cat(3,"Pendu","Fish");
        Animal a = new Animal(10,"Leopard");//        a.makeNoise();
        System.out.println("----------------------------------------------------------------");
        c.makeNoise();
        System.out.println("----------------------------------------------------------------");
        c.jump();
//        c.eat();
        System.out.println("----------------------------------------------------------------");
        System.out.println(c.age+"  "+c.name+"  "+c.catFoodPreference);
        System.out.println(a.age+"  "+a.name+"  ");
    }
}
