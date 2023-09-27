public class Main {
    public static void main(String[] args) {

        int creditSum = 1000_000;
        int months = 12;
        CreditPaymentService service = new CreditPaymentService();
        double ep = service.calculate(creditSum , months);
        int result = (int) ep;
        System.out.println("Ежемесячный платеж = " + result + " рублей");
    }
}