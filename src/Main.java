public class Main {
    public static void main(String[] args) {

        int creditSum = 1000_000;
        int months = 12;
        CreditPaymentService service = new CreditPaymentService();
        double monthlyPayment = service.calculate(creditSum, months);
        int result = (int) monthlyPayment;
        System.out.println("Ежемесячный платеж = " + result + " рублей");
    }
}