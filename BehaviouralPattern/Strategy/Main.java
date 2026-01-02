package BehaviouralPattern.Strategy;

public class Main {
    public static void main(String[] args) {
        Payment payment = new Payment(new UpiPaymentStrategy());
        payment.makePayment(100);
    }
}
