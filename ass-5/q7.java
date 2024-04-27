class InsufficientFundException extends Exception {
    public InsufficientFundException(String message) {
        super(message);
    }
}

class SavingAccount {
    int acNo;
    String name;
    double balance;
    final double minimumBalance = 500;

    public SavingAccount(int acNo, String name, double balance) {
        this.acNo = acNo;
        this.name = name;
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientFundException {
        if (balance - amount < minimumBalance) {
            throw new InsufficientFundException("Insufficient funds for withdrawal");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. New balance: " + balance);
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit successful. New balance: " + balance);
    }

    public void viewBalance() {
        System.out.println("Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        SavingAccount account = new SavingAccount(123456, "John", 1000);
        
        try {
            account.withdraw(600);
        } catch (InsufficientFundException e) {
            System.out.println(e.getMessage());
        }
        
        account.deposit(200);
        account.viewBalance();
    }
}
