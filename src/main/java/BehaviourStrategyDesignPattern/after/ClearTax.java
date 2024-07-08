package BehaviourStrategyDesignPattern.after;

public class ClearTax {
    private TaxCalculationStrategyFactory taxCalculationStrategyFactory=new TaxCalculationStrategyFactory();
  //  private TaxCalculationStrategy taxCalculationStrategy=new OldTaxRegimeTaxCalculationStrategy();
    int calculateTax(int salaryAmount,TaxCalculationStrategyTypes types) {
 //           return taxCalculationStrategy.calculateTax(salaryAmount);
              return taxCalculationStrategyFactory.getTaxCalculatorForType(types).calculateTax(salaryAmount);
    }
}
