package All_OOPS;
// This code contains all the concepts in JAVA OOPS
//     1.  Abstraction
//     2.  Encapsulation
//     3.  Inheritance
//     4.  Polymorphism
//     5.  Singleton pattern

import java.util.*;

// Abstract PaymentMethod class (base for UPI, Card, NetBanking)
abstract class PaymentMethod {
    private int balance; // Encapsulated balance

    // Getter
    public int getBalance() {
        return balance;
    }

    // Deposit logic
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("✅ Deposited ₹" + amount + ". Current Balance: ₹" + balance);
        } else {
            System.out.println("❌ Invalid deposit amount.");
        }
    }

    // Withdraw logic
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("✅ Withdrew ₹" + amount + ". Current Balance: ₹" + balance);
        } else {
            System.out.println("❌ Insufficient balance or invalid amount.");
        }
    }

    // Abstract method to be implemented in child classes
    public abstract void pay();
}

// Concrete UPI payment method
class UpiPayment extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("💸 Payment of ₹" + getBalance() + " done via UPI.");
    }
}

// Concrete Card payment method
class CardPayment extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("💳 Payment of ₹" + getBalance() + " done via Card.");
    }
}

// Concrete NetBanking payment method
class NetBanking extends PaymentMethod {
    @Override
    public void pay() {
        System.out.println("🏦 Payment of ₹" + getBalance() + " done via NetBanking.");
    }
}

// User class containing instances of all 3 payment types
class User {
    private final String name;
    private final int userId;

    public UpiPayment upi;
    public CardPayment card;
    public NetBanking netBanking;

    public User(String name, int userId) {
        this.name = name;
        this.userId = userId;
        this.upi = new UpiPayment();
        this.card = new CardPayment();
        this.netBanking = new NetBanking();
    }

    public String getName() {
        return name;
    }

    public int getUserId() {
        return userId;
    }
}

// Singleton Service Layer
class PaymentService {
    private static PaymentService instance;

    private PaymentService() {}

    public static PaymentService getInstance() {
        if (instance == null) {
            instance = new PaymentService();
        }
        return instance;
    }

    public void processDeposit(PaymentMethod method, int amount) {
        method.deposit(amount);
    }

    public void processWithdraw(PaymentMethod method, int amount) {
        method.withdraw(amount);
    }

    public void processPayment(PaymentMethod method) {
        method.pay();
    }
}

// Main driver
public class PaymentController {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PaymentService service = PaymentService.getInstance();
        List<User> users = new ArrayList<>();

        // Create 20 users
        for (int i = 1; i <= 20; i++) {
            users.add(new User("User" + i, i));
        }

        while (true) {
            System.out.print("\nEnter User ID (1–20) or 0 to Exit: ");
            int uid = sc.nextInt();

            if (uid == 0) {
                System.out.println("👋 Exiting Payment System.");
                break;
            }

            if (uid < 1 || uid > 20) {
                System.out.println("❌ Invalid User ID.");
                continue;
            }

            User currentUser = users.get(uid - 1);
            System.out.println("👤 Welcome, " + currentUser.getName());

            System.out.println("Choose Payment Method:");
            System.out.println("1. UPI\n2. Card\n3. NetBanking");
            int methodChoice = sc.nextInt();

            PaymentMethod method = null;
            switch (methodChoice) {
                case 1:
                    method = currentUser.upi;
                    break;
                case 2:
                    method = currentUser.card;
                    break;
                case 3:
                    method = currentUser.netBanking;
                    break;
                default:
                    System.out.println("❌ Invalid Payment Method.");
                    continue;
            }

            System.out.println("Choose Operation:");
            System.out.println("1. Deposit\n2. Withdraw\n3. Pay\n4. Check Balance");
            int operation = sc.nextInt();

            switch (operation) {
                case 1:
                    System.out.print("Enter amount to deposit: ");
                    int dep = sc.nextInt();
                    service.processDeposit(method, dep);
                    break;
                case 2:
                    System.out.print("Enter amount to withdraw: ");
                    int wd = sc.nextInt();
                    service.processWithdraw(method, wd);
                    break;
                case 3:
                    service.processPayment(method);
                    break;
                case 4:
                    System.out.println("📊 Available Balance: ₹" + method.getBalance());
                    break;
                default:
                    System.out.println("❌ Invalid operation.");
            }
        }

        sc.close();
    }
}

