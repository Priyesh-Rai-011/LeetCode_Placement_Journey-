package String_StringBuilder;

import java.util.Arrays;

//       STRING
// - string pool
public class string {
    public static void main(String[] args) {
//        System.out.println(" -_- ");
//        // there toupees are directly stored in the HEAP ==> they have diffract
//        String str = new String("Priyesh");
//        String str2 = new String("Priyesh");
//
//        System.out.println(str.equals(str2));
//
//        String name = "Rai";
//        String name2 = "Rai";
//        System.out.println(str == str2);
//        System.out.println(name == name2);
// ================================ STRING PERFORMANCE ==========================================
        System.out.println(" String  Performance ");
        String series = "";
        series = series+"[";
        for (int i=0; i<26; i++){
            char ch = (char)('a'+i);
            if (i>0){
                series = series+", ";
            }
            series = series+ch;
        }
        series = series+"]";
        System.out.print(series);

    // this code is very problematic as, during every iteration( to add a new char )
    // a new string object is created
    // to 1st copy the existing string to the new string object and add the new char character
    // So, these leads to time complexity O(n^2)

//  ---------------------------  Why to use StringBuilder  -----------------------------------
        System.out.println("\n-----------------------------------------------");

    // TO SOLVE THIS PROBLEM , WE HAVE STRING BUILDER CLASS -->
   // This data type does not create a new object,
   // just appends a new
   // So, the time complexities reduces to O(N^2)
        System.out.println("String Performance - USING STRING BUILDER");

        StringBuilder series2 = new StringBuilder();
        series2.append("[");// adds "[" to the starting of the string
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);//adding the equivalent char value
            if (i > 0) {
                series2.append(", ");// adds "," after every character added to the string
            }
            series2.append(ch);
        }
        series2.append("]");// adds "]" at the end of every
        System.out.println(series2);
//  ===-===-===-===-===-===-===-===-===-===-===-===-===-===-===-===-===-===
        String name = "Priyesh Rai";
        char[] name_array= name.toCharArray();
        System.out.println(Arrays.toString(name_array));

    }
}
