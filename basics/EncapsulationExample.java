class BankAccount {
    private double balance;

    public void deposit(double amount){
        balance += amount;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}


public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.deposit(1000);
        System.out.println("Balance after deposit: " + account.getBalance());
        account.withdraw(500);
        System.out.println("Balance after withdrawal: " + account.getBalance());
    }
}