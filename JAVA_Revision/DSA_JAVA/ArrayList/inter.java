package ArrayList;
import java.util.HashMap;
public class inter {

    public static void main(String[] args) {
        String input = "Apple";

        HashMap <Character, Integer> freq = new HashMap<>();
        for (char c : input.toCharArray()){
            freq.put(c, freq.getOrDefault(c,0)+1);
        }
        System.out.println("Char frequency : "+ input);

        for (char c : freq.keySet()){
            System.out.println(c+" : "+freq.get(c));
        }

        String input2 = "Priyesh";
        HashMap <Character, Integer> freq2 = new HashMap<>();
        for (char c : input2.toCharArray()){
            freq2.put(c, freq2.getOrDefault(c,0)+1);
        }
        System.out.println("Char frequency : "+ input2);

        for (char c : freq2.keySet()){
            System.out.println(c+" : "+freq2.get(c));
        }
    }
}
