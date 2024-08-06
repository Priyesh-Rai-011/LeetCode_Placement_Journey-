package LEETCODE_Q.Searching;

//import java.util.Arrays;
//import java.util.stream.IntStream;

public class Q7_2187_MinTrips {

    public static long minimumTime(int[] time, int totalTrips) {
        int[] trips = new int[time.length];
        int tripsDone = 0, t = 0;
        while(tripsDone < totalTrips){
            t++;
            for(int i=0; i<time.length; i++){
                trips[i] = (trips[i]+1)%time[i];
                if(trips[i]==0){
                    tripsDone++;
                }
            }
        }
        return t;
    }
    public static void main(String[] args) {
        System.out.println(minimumTime(new int[]{1,2,3},5));
    }
}
