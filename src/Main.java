public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("021", "Nizami");
        System.out.println(bankAccount);
        bankAccount.deposit();
        bankAccount.withdraw();
    }
}