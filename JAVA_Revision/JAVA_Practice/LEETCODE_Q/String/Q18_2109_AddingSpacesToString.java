package LEETCODE_Q.String;

public class Q18_2109_AddingSpacesToString {
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int j=0;
        for (int i=0; i<s.length(); i++){
            if (j<spaces.length && i==spaces[j]){
                ans.append(" ");
                j++;
            }
//            if (i==spaces[spaces.length-1]){
//                ans.append(" ");
//            }
            ans.append(s.charAt(i));
        }
        System.out.println(ans);
        return  ans.toString();
    }
    public static void main(String[] args) {
        System.out.println(addSpaces("LeetcodeHelpsMeLearn",new int[]{8,13,15}));
    }
}
