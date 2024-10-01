package LEETCODE_Q.String;

import java.util.Arrays;

public class Q17_165_CompVersion {
    public static int compareVersion(String version1, String version2) {
        String[] ar1 = version1.split("\\.");
        String[] ar2 = version2.split("\\.");
        int maxlen = Math.max(ar1.length,ar2.length);

        for (int i=0; i<maxlen; i++){
            int ver1 = (i<ar1.length) ? Integer.parseInt(ar1[i]) : 0;
            int ver2 = (i<ar2.length) ? Integer.parseInt(ar2[i]) : 0;

            if (ver1>ver2){
                return 1;
            }
            else if (ver2>ver1) {
                return -1;
            }
        }
        return 0;
    }
    public static void main(String[] args) {

        System.out.println(compareVersion("1.2","1.10"));
        System.out.println(compareVersion("1.01","1.001"));
        System.out.println(compareVersion("1.0","1.0.0.0"));
    }
}
