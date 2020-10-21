package tax;

public class TaxApplication {

    public static void main(String[] args) {
        TaxCalculator calc = new TaxCalculator(23456);
        System.out.println(new StringBuilder().append("Tax to pay equals : ").append(calc.taxCalculated(calc.getTotalIncome())).toString());
    }
}
