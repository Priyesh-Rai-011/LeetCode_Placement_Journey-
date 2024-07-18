package Constructors;
import java.util.Scanner;

class BankAccount{
    int accNum; String accHoldName; float balance;
    BankAccount(){
        this.accHoldName="Unknown";
        this.accNum=0000000000;
        this.balance=0;
    }
    BankAccount(int an,float bal, String name){
        this.accHoldName=name;
        this.accNum=an;
        this.balance=bal;
    }
    void deposit(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be deposited : ");
        float depo = sc.nextFloat();
//     ---------------------------
        balance = balance + depo;
    }
    void withdraw(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to be withdrawn : ");
        float with = sc.nextFloat();
        if (balance == 0){
            System.out.println("0 balance || Money can't be withdraw...!");
        }
        else if (with > balance) {
            System.out.println("ERROR : withdrawal amount > balance");
        }
        else {
            balance = balance - with;
        }
    }
    void displayAccountInfo(){
        System.out.println("Account Holder  : "+accHoldName);
        System.out.println("Account Number  : "+accNum);
        System.out.println("Account Balance : Rs. "+balance);
    }
}
public class Q3_bankAccount {
    public static void main(String[] args) {
        System.out.println("----  Displaying Bank Account Info of Customer ----");
//        BankAccount B1 = new BankAccount();
//        B1.displayAccountInfo();
//        B1.deposit();
//        B1.deposit();
//        B1.displayAccountInfo();
//        B1.withdraw();
//        B1.displayAccountInfo();
    System.out.println("-------------------------------------");
        BankAccount B2 = new BankAccount(1004378325,100000,"Prieysh Rai");
        B2.displayAccountInfo();
        B2.deposit();
        B2.deposit();
        B2.displayAccountInfo();
        B2.withdraw();
        B2.withdraw();
        B2.displayAccountInfo();
    }
}
