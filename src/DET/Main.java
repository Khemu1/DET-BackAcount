package DET;

class Main {
    public static void main(String[] args) {
        // Creating a CheckingAccount instance with overdraft
        CheckingAccount checkingAccount = new CheckingAccount("John Doe", true);
        // Depositing some initial amount
        System.out.println(checkingAccount.getBalance());
        System.out.println("Initial balance: $" + checkingAccount.getBalance());

        // Clearing a check with an amount that can be cashed
        checkingAccount.clearCheck(Math.random()*5000);

        // Trying to clear a check with an amount greater than the balance
        checkingAccount.clearCheck(Math.random()*5000);

        // Trying to withdraw more than the balance without overdraft
        checkingAccount.withdraw(Math.random()*5000);

        // Clearing a check with overdraft
        checkingAccount.clearCheck(Math.random()*5000);

        // Final balance
        System.out.println("Final balance: $" + checkingAccount.getBalance());
    }
}
