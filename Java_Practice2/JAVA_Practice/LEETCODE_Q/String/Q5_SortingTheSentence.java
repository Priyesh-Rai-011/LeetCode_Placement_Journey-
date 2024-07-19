package LEETCODE_Q.String;


public class Q5_SortingTheSentence {
    public static String sortSentence(String s) {
        int len = s.split(" ").length,   position;
        String[] str_ans = new String[len];
        StringBuilder ans = new StringBuilder();
        for (var t : s.split(" ")){
            position=t.charAt(t.length()-1)-48;
//            System.out.print(position+" ");
            t=t.substring(0,t.length()-1);
            str_ans[position-1]=t;
        }
        for (int i=0; i<str_ans.length-1; i++) {
                ans.append(str_ans[i]).append(" ");
        }ans.append(str_ans[str_ans.length-1]);
//        System.out.println("\n"+Arrays.toString(str_ans));
//        System.out.println(ans);
        return ans.toString();
    }
    public static void main(String[] args) {
        String str = "is2 sentence4 This1 a3";
        System.out.println(sortSentence(str));
    }
}
