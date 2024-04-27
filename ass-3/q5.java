interface CreditCardInterface {
    void viewCreditAmount();
    void useCard(double amount);
    void payCredit(double amount);
    void increaseLimit();
}

class SilverCardCustomer implements CreditCardInterface {
    String name, cardNumber;
    double creditAmount, creditLimit;

    public SilverCardCustomer(String name, String cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
        this.creditAmount = 0;
        this.creditLimit = 50000;
    }

    @Override
    public void viewCreditAmount() { System.out.println("Credit Amount for " + name + ": " + creditAmount); }

    @Override
    public void useCard(double amount) {
        if (creditAmount + amount <= creditLimit) { creditAmount += amount; System.out.println("Transaction successful."); }
        else { System.out.println("Transaction failed. Credit limit exceeded."); }
    }

    @Override
    public void payCredit(double amount) { creditAmount -= amount; }

    @Override
    public void increaseLimit() { System.out.println("Not applicable for Silver Card Customer."); }
}

class GoldCardCustomer extends SilverCardCustomer {
    int increaseLimitCount;

    public GoldCardCustomer(String name, String cardNumber) {
        super(name, cardNumber);
        this.creditLimit = 100000;
        this.increaseLimitCount = 0;
    }

    @Override
    public void increaseLimit() {
        if (increaseLimitCount < 3 && creditLimit < 150000) {
            creditLimit += 5000;
            increaseLimitCount++;
            System.out.println("Credit limit increased successfully.");
        } else {
            System.out.println("Cannot increase credit limit further.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        SilverCardCustomer silverCustomer = new SilverCardCustomer("John", "1234567890123456");
        silverCustomer.useCard(30000);
        silverCustomer.viewCreditAmount();
        silverCustomer.payCredit(10000);
        silverCustomer.viewCreditAmount();

        GoldCardCustomer goldCustomer = new GoldCardCustomer("Jane", "9876543210987654");
        goldCustomer.useCard(80000);
        goldCustomer.viewCreditAmount();
        goldCustomer.increaseLimit();
        goldCustomer.increaseLimit();
        goldCustomer.increaseLimit();
        goldCustomer.increaseLimit();
        goldCustomer.viewCreditAmount();
    }
}
