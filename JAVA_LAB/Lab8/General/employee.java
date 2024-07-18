package Lab8.General;
import java.util.Scanner;
public class employee {
    protected int emp_id;  private String emp_name;
    public float total_earnning;
    public void emp_details(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter employee details || Name & ID");
        this.emp_name=sc.next();
        this.emp_id=sc.nextInt();
        System.out.println("Hello...! "+emp_name+" ("+emp_id+") .......!");
    }
    public void earning(){
        System.out.print("Enter your basic salary : ");
        Scanner sc = new Scanner(System.in);
        float basic = sc.nextFloat();
        float DA = 0.8f*basic;  float HRA=0.15f*basic;
        System.out.println("Daly allowance will be : "+DA);
        System.out.println("HRA will be : "+HRA);
        float earning = (basic+DA+HRA);
        System.out.println("-------------------------------");
        System.out.println("Total earning : "+earning);
        this.total_earnning =  earning;
    }
}
