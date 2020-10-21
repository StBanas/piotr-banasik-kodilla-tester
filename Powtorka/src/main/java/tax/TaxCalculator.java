package tax;

public class TaxCalculator {
    private final double totalIncome;
    public double getTotalIncome() {
        return totalIncome;
    }



    TaxCalculator(double totalIncome) {this.totalIncome = totalIncome;

    }
    public double taxCalculated(double income) {
        double tax = 0;

        if (income <= 5000) {
            return tax;
        }
        else if (income > 5000 && income <= 20000) {return (income - 5000) * 0.2;}

        else
            return ((income - 5000) * 0.2) +400;
    }


}
