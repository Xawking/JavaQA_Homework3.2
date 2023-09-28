public class CreditPaymentService {
    public int calculate(int creditSum, int numberOfPayments) {
        double monthlyPercent = 0.0999 / 12;
        double monthlyPercSquared = Math.pow(1 + monthlyPercent, numberOfPayments);
        double monthlyPayment = creditSum * ((monthlyPercent * monthlyPercSquared) / (monthlyPercSquared - 1));
        int result = (int) monthlyPayment;
        return result;
    }
}
