package Strategy.InvestmentAdvisor;

public class Account {

    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        this.balance += value;
    }

}
