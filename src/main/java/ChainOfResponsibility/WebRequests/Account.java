package ChainOfResponsibility.WebRequests;

public class Account {

    private String holder;
    private Double balance;

    public Account(String holder, Double balance) {
        this.holder = holder;
        this.balance = balance;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }
}
