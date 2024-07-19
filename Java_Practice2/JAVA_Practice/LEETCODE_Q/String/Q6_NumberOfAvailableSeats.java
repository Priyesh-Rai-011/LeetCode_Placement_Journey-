package LEETCODE_Q.String;

public class Q6_NumberOfAvailableSeats {
    public static int minimumChairs(String s) {
        int seats=0,count=0;
        for(int i=0; i<s.length(); i++){
            if (s.charAt(i)=='E'){
                count++;
            }
            else if (s.charAt(i)=='L') {
                count--;
            }
            seats=Math.max(count,seats);
        }
        return seats;
    }
    public static void main(String[] args) {
        System.out.println(minimumChairs("ELELEEL"));
        System.out.println(minimumChairs("EEEEEEE"));
        System.out.println(minimumChairs("EELELLEEE"));
        System.out.println(minimumChairs("ELEELEELLL"));
    }
}
