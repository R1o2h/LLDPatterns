package BehaviourStrategyDesignPattern.after;

public class TaxCalculationStrategyFactory {
    public TaxCalculationStrategy getTaxCalculatorForType(TaxCalculationStrategyTypes types) {
        switch (types) {
            case NEW -> new NewTaxRegimeTaxCalculationStrategy();
            case OLD -> new OldTaxRegimeTaxCalculationStrategy();
        }
        return null;
    }
}
