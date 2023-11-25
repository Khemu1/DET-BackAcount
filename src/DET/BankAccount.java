package DET;

// BankAccount class
public class BankAccount {
    String accountHolder;
    double balance=Math.random()*5000;
;

    public BankAccount(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return this.balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: $" + balance);
        } else {
            System.out.println("Withdrawal failed. Insufficient funds.");
        }
    }
}
