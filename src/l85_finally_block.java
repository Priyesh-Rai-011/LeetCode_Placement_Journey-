public class l85_finally_block {
    public static int greet(){
        int a,b,c=0;
        try {
            a=10;
            b=-1;
            System.out.println("numbers : "+a+", "+b);
            c=a/b;
            return c;
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("----end----");
        }
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("------- finally block -------");
//        try {
//            int a=7;
//            int b=0;
//            int c=a/b;
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("program end");
//        }
//        System.out.println("end of code");
        System.out.println("----------------------");
//        System.out.println(greet());
//        greet();
        int k = greet();
        System.out.println(k);
    }
}
