package Strategy.InvestmentAdvisor;

public class InvestmentMaker {


    public void invest(Account account, Investment investmentStrategy) {
        double result = investmentStrategy.invest(account);
        account.deposit(result);
        System.out.println(account.getBalance());
    }

    public static void main(String[] args) {
        Investment investment = new Aggressive();
        Account account = new Account(200);
        InvestmentMaker im = new InvestmentMaker();

        im.invest(account, investment);
        im.invest(account, investment);
        im.invest(account, investment);
        im.invest(account, investment);
    }

}
