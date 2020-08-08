package Strategy.InvestmentAdvisor;

public class Moderate implements Investment {

    public double invest(Account account) {
        boolean chance = new java.util.Random().nextDouble() > 0.50;

        if (chance)
            return account.getBalance() * 0.025;

        return account.getBalance() * 0.007;
    }
}
