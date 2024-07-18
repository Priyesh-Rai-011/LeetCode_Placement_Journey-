package Lab5;
public class Q4 {
    private static int count;
    public Q4(){
        count++;
    }
    public static void main(String args[]){
        System.out.println("Objects are created...!");
        Q4 ob1 = new Q4();
        Q4 ob2 = new Q4();
        Q4 ob3 = new Q4();
        Q4 ob4 = new Q4();
        Q4 ob5 = new Q4();
//prints number of objects
        System.out.print("Total Number of Objects: " + Q4.count);
    }
}
