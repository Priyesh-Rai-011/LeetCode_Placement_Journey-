package LEETCODE_Q.String;

public class aaaa {
    public static void rev(String str){
        String[] words = str.split(" ");
        StringBuilder mod_sent = new StringBuilder();
        for(int i= words.length-1;i>=0; i--){
            String rev_w = new StringBuilder(words[i]).reverse().toString();
            mod_sent.append(rev_w);
            if(i>0){
                mod_sent.append(" ");
            }
        }
        System.out.println(mod_sent);
    }
    public static void main(String[] args) {
        System.out.println("------");

        rev("Priyesh Rai will not be selected in Deloitte, Such a pity. shame on him. How will he be able to clear the Chubb Exam.");
        System.out.println("------");
    }
}
