package LEETCODE_Q.Recursion.theory_AV;

public class T7_TOWER_HANOI {
    static void towerOfHanoi(int n, char from_rod, char to_rod, char aux_rod) {
        if (n == 0) {  return;  }
//        System.out.print("1");
        towerOfHanoi(n - 1, from_rod, aux_rod, to_rod);
        prnt(n,from_rod,to_rod);
//        System.out.print("2");
        towerOfHanoi(n - 1, aux_rod, to_rod, from_rod);
    }
    public static void prnt(int n, char from_rod, char to_rod){
//        System.out.println("\nMove disk " + n + "( " + from_rod + " --> " + to_rod+" )");
        System.out.println("Move disk " + n + "( " + from_rod + " --> " + to_rod+" )");
    }
    public static void main(String[] args) {
//        System.out.println("---------------N=1---------------");
//        towerOfHanoi(1,'A','B','C');
//        System.out.println("---------------N=2---------------");
//        towerOfHanoi(2,'A','B','C');
//        System.out.println("---------------N-3---------------");
//        towerOfHanoi(3,'A','B','C');
        System.out.println("---------------N=4---------------");
        towerOfHanoi(4,'A','B','C');
//        System.out.println("---------------N=10---------------");
//        towerOfHanoi(20 ,'A','B','C');
    }
}
