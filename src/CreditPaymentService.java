public class CreditPaymentService {
    public int calculate(int sc , int kp) {
        double mps = 0.0999 / 12;
        double mpsSq = Math.pow(1 + mps, kp);
        double ep = sc * ((mps * mpsSq) / (mpsSq - 1));
        int result = (int) ep;
        return result;
    }
}
