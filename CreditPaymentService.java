public class CreditPaymentService {
    public int calculate(int loanAmount, double interestRate, int creditTerm) {
        double formula = Math.pow((1 + interestRate / 100 / 12), (creditTerm * 12));
        int monthlyPayment = (int) (loanAmount * ((interestRate / 100 / 12) * formula) / (formula - 1));
        return monthlyPayment;


    }
}
