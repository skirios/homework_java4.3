public class Main {
    public static void main(String[] args) {
        CreditPaymentService creditPaymentService = new CreditPaymentService();

        int monthlyPaymentOneYear = creditPaymentService.calculate(1_000_000, 9.99, 1);
        int monthlyPaymentTwoYears = creditPaymentService.calculate(1_000_000, 9.99, 2);
        int monthlyPaymentThreeYears = creditPaymentService.calculate(1_000_000, 9.99, 3);

        System.out.println("Ежемесячный платёж = " + monthlyPaymentOneYear);
        System.out.println("Ежемесячный платёж = " + monthlyPaymentTwoYears);
        System.out.println("Ежемесячный платёж = " + monthlyPaymentThreeYears);
    }
}