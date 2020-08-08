package Strategy.InvestmentAdvisor;

public class Aggressive implements Investment {

    public double invest(Account account) {
        Double randomNumber = new java.util.Random().nextDouble();
        Double value = account.getBalance();

        if (randomNumber <= 0.2)
            return value * 0.05;
        else if (randomNumber >= 0.2 && randomNumber <= 0.5)
            return value * 0.03;

        return value * 0.006;
    }
}
