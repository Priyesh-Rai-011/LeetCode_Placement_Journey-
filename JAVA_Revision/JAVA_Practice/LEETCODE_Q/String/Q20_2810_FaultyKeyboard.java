package LEETCODE_Q.String;

public class Q20_2810_FaultyKeyboard {
    public static String finalString(String s) {
        StringBuilder res = new StringBuilder();
        for (char v : s.toCharArray()){
            if (v == 'i'){
                res = res.reverse();
                continue;
            }
            res.append(v);
        }
        return res.toString();
    }
//    private static StringBuilder rev(StringBuilder s){
//        return s.reverse();
//    }
    public static void main(String[] args) {
        System.out.println(finalString("string"));
        System.out.println(finalString("poiinter"));
    }
}
