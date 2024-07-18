package Lab7;

abstract class Student {
    int rollNo, regNo;

    Student(int rollNo, int regNo) {
        this.regNo = regNo;
        this.rollNo = rollNo;
    }

    abstract void course();
}

class Kiitians extends Student {
    Kiitians(int rollNo, int regNo) {
        super(rollNo, regNo);
    }

    void course() {
        System.out.println("Roll No : " + rollNo + " Reg No : " + regNo);
    }
}

class q2 {
    public static void main(String[] args) {
        Kiitians ob = new Kiitians(2105850, 1000234241);
        ob.course();
        System.out.println("---------------------------------");
        Student obj = new Kiitians(123,456);
        obj.course();
//        Student ref = Kiitians(2105814);
    }
}