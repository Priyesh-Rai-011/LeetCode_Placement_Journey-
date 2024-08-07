package LEETCODE_Q.Math;

public class Q12_1739_MaxDistTraveled {
    public static int distanceTraveled(int mainTank, int additionalTank) {
        int lts=0,dist=0;
        while (mainTank>0){
            lts++;
            dist+=10;
            mainTank--;
            if (lts%5==0 && additionalTank>0){
                mainTank++;
                additionalTank--;
            }
        }
        return dist;
    }
    public static void main(String[] args) {
        System.out.println(distanceTraveled(5,10));
        System.out.println(distanceTraveled(11,10));
    }
}
