package LEETCODE_Q.String;

public class Q7_ConsecutiveCharacters {
    public static int maxPower(String s) {
        int max=1,count=1;
        for (int i=0; i<s.length()-1; i++){
            if (s.charAt(i)==s.charAt(i+1)){
                count++;
            } else if (s.charAt(i)!=s.charAt(i+1)) {
                count=1;
            }
            max=Math.max(max,count);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(maxPower("abbcccddddeeeeedcba"));
        System.out.println(maxPower("leetcodes"));
        System.out.println(maxPower("leeeeeeetcodes"));
        System.out.println(maxPower("priyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyyesh"));

    }
}
