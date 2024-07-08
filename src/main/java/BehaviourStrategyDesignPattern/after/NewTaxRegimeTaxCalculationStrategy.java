package BehaviourStrategyDesignPattern.after;

public class NewTaxRegimeTaxCalculationStrategy implements TaxCalculationStrategy{
    @Override
    public int calculateTax(int salary) {
        int pf=5/100*salary;
        int ec=15/100*salary;
        int totalTax=pf+ec;
        return totalTax;
    }
}
