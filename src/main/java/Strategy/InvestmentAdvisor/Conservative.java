package Strategy.InvestmentAdvisor;

public class Conservative implements Investment {

    public double invest(Account account) {
        return account.getBalance() * 0.008;
    }
}
