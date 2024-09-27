package LEETCODE_Q.Array;

import java.util.ArrayList;
import java.util.List;

public class Q19_731_MyCalendar2{
    List<int[]> calendar,overlaps;
    public Q19_731_MyCalendar2() {
        calendar = new ArrayList<>();
        overlaps = new ArrayList<>();
    }
    public boolean book(int start, int end) {
        // checking if the task is coming in any interval or not
        for (int[] overlap_interval : overlaps){
            if (start < overlap_interval[1] && end > overlap_interval[0]){
                return false;
            }
        }
        for (int[] event : calendar) {
            if (start < event[1] && end > event[0]) {
                // calculate the overlapped interval
                int ov_start = Math.max(start,event[0]);
                int ov_end = Math.min(event[1],end);
                overlaps.add(new int[]{ov_start, ov_end});
            }
        }

        calendar.add(new int[]{start, end}); // No overlap, book event.
        return true;
    }
}
class Main2 {
    public static void main(String[] args) {
        String[] commands = {"MyCalendar2", "book", "book", "book", "book", "book", "book", "book", "book"};
        int[][] inputs = { {}, {10, 20}, {50, 60}, {10, 40}, {5, 15}, {5, 10}, {25, 55}, {70, 80},{60,75} };

        List<Object> output = new ArrayList<>();
        Q19_731_MyCalendar2 myCalendar = null;

        for (int i = 0; i < commands.length; i++) {
            switch (commands[i]) {
                case "MyCalendar2":
                    myCalendar = new Q19_731_MyCalendar2();
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

