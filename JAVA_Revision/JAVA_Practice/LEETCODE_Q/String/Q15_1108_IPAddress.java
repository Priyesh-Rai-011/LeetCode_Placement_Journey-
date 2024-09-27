package LEETCODE_Q.String;

public class Q15_1108_IPAddress {
    public static String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for (int i=0; i<address.length(); i++){
            if (address.charAt(i) == '.'){
                str.append('[');
                str.append(address.charAt(i));
                str.append(']');
                continue;
            }
            str.append(address.charAt(i));
        }
//        String ans = "";
//        String ans = "";

        return str.toString();
    }
    public static void main(String[] args) {
        System.out.println(defangIPaddr("125.125.125.125"));
    }
}
