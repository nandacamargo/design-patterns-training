package Strategy.TaxCalculator;

public class CalculaImposto {

    public void calculate(Budget budget, Tax taxStrategy) {
        double resultado = taxStrategy.calculate(budget);
        System.out.println(resultado);
    }


    public static void main(String[] args) {
        Tax iccc = new ICCC();
        Budget budget = new Budget(500);
        Budget budget2 = new Budget(5000);
        Budget budget3 = new Budget(50000);

        CalculaImposto calculaImposto = new CalculaImposto();
        calculaImposto.calculate(budget, iccc);
        calculaImposto.calculate(budget2, iccc);
        calculaImposto.calculate(budget3, iccc);

    }
}