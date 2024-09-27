package LEETCODE_Q.Array;

import java.util.ArrayList;
import java.util.List;

public class Q18_729_Calendar1{
    List<int[]> calendar;

    public Q18_729_Calendar1() {
        calendar = new ArrayList<>();
    }

    public boolean book(int start, int end) {
        for (int[] slots : calendar) {
            if (start < slots[1] && end > slots[0]) {
                return false; // Overlapping event, cannot book.
            }
        }
        calendar.add(new int[]{start, end}); // No overlap, book event.
        return true;
    }
}
 class Main {
    public static void main(String[] args) {
        String[] commands = {"MyCalendar", "book", "book", "book"};
        int[][] inputs = { {}, {10, 20}, {15, 25}, {20, 30} };

        List<Object> output = new ArrayList<>();
        Q18_729_Calendar1 myCalendar = null;
        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "MyCalendar":
                    myCalendar = new Q18_729_Calendar1();
                    output.add(null); // Constructor returns null
                    break;
                case "book":
                    int start = inputs[i][0];
                    int end = inputs[i][1];
                    boolean result = myCalendar.book(start, end);
                    output.add(result);
                    break;
            }
        }

        // Print the output in the required format
        System.out.println(output);
    }
}
