package Lab8.Marketing;
import java.util.Scanner;
import Lab8.General.*;
public class sales extends employee {
    public void tallowance(){
        earning();
        System.out.println("Calculating travelling allowance ...");
        float travel_allow = (0.05f*total_earnning);
        System.out.println("----------------------------");
        System.out.println("travelling allowance will be : "+travel_allow);
        float final_earning = travel_allow+total_earnning;
        System.out.println("----------------------------");
        System.out.println("After adding travel allowance|| total salary will be : "+final_earning);
    }
}
