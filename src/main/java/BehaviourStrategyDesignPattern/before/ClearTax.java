package BehaviourStrategyDesignPattern.before;

public class ClearTax {
    int calculateTax(int salaryAmount) {
            int pf=5/100*salaryAmount;
            int ec=20/100*salaryAmount;
            int hra=10/100*salaryAmount;
            int totalTax=pf+ec-hra;
            return totalTax;
    }
}
