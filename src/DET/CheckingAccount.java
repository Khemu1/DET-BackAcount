package DET;

public class CheckingAccount extends BankAccount {
    boolean overdraft;
    

    public CheckingAccount(String accountHolder, boolean overdraft) {
        super(accountHolder);
        this.overdraft = overdraft;
    }

    public boolean hasOverdraft() {
        return overdraft;
    }

    public boolean clearCheck(double amount) {
        if (amount > 0 && (amount <= getBalance() || overdraft)) {
            // Check can be cashed
            withdraw(amount);
            return true;
        } else {
            System.out.println("Check cannot be cashed. Insufficient funds or no overdraft.");
            return false;
        }
    }
}
