package BehaviourStrategyDesignPattern.after;

public class OldTaxRegimeTaxCalculationStrategy implements TaxCalculationStrategy{
    @Override
    public int calculateTax(int salary) {
        int pf=5/100*salary;
        int ec=20/100*salary;
        int hra=10/100*salary;
        int totalTax=pf+ec-hra;
        return totalTax;
    }
}
