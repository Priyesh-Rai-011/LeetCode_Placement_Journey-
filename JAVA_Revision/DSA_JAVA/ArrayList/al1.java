package ArrayList;
import java.util.ArrayList;
public class al1 {
    public static void main(String[] args) {
        System.out.println("----  Array List  ----");
//        ArrayList<Integer> list = new ArrayList<>(10);
        // Creating an ArrayList
        ArrayList<String> fruits = new ArrayList<>();
        // Adding elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        // Accessing elements in the ArrayList
        System.out.println(fruits.get(0)); // Output: Apple

        // Modifying an element in the ArrayList
        fruits.set(1, "Grapes");
        System.out.println(fruits.get(1)); // Output: Grapes

        // Removing an element from the ArrayList
        fruits.remove(2);
        System.out.println("-------------------");
        System.out.println(fruits); // Output: [Apple, Grapes]
        System.out.println("-------------------");

        // Checking the size of the ArrayList
        System.out.println(fruits.size()); // Output: 2

        System.out.println("------------------");
        // Iterating over the ArrayList
        for (String fruit : fruits) {
            System.out.print(fruit+", ");
        }        System.out.println();
    }
}
