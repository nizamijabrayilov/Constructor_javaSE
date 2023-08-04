import java.util.Scanner;

public class BankAccount {

    Scanner sc = new Scanner(System.in);
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountNumber, String accountHolderName) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
    }

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return 0.0;
    }

    public void deposit(){
        System.out.println("Enter the amount you want to deposit: ");
        long amt = sc.nextLong();
        balance += amt;
    }
    public void withdraw() {
        long amt;
        System.out.println("Enter the amount you want to withdraw: ");
        amt = sc.nextLong();
        if (balance >= amt) {
            balance = balance - amt;
            System.out.println("Balance after withdraw: " + balance);
        } else {
            System.out.println("Your balance is less than " + amt + "\n" + "Transaction failed...!!" );
        }
    }

    @Override
    public String toString() {
        return '{' + " accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
    }


