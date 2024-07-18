import java.util.Scanner;
public class L27_For_each_loop {
    public static void main(String[] args) {
        System.out.println("---- Arrays ----");
        float [] marks = {98.25f,45.5f,79.5f,99.25f,80.5f};
        String [] students = {"Priyesh","Sumit","Parul","Harshit","Annanya"};
        System.out.println(marks);
        System.out.println(marks.length);
        System.out.println("-----------------------");
        System.out.println(marks[0]);
        System.out.println("-----------------------");
        System.out.println(students[3]);
        System.out.println("-----------------------");
//  Printing a loop using simple ( FOR ) loop
        for (int i=0; i<=(students.length-1); i++){
            System.out.println(students[i]+" got --> "+marks[i]+"   marks in total.");
        }
//  Printing a loop using simple ( FOR-EACH ) loop
        System.out.println("-----------------------");
        for (float element: marks){
            System.out.print(element+", ");
        }

    }
}
