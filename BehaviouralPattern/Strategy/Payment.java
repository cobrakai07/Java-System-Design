package BehaviouralPattern.Strategy;

public class Payment {
    PaymentStrategy paymentStrategy;
    public Payment(PaymentStrategy paymentStrategy){
        this.paymentStrategy = paymentStrategy;
    }

    public void makePayment(int amount){
        paymentStrategy.paid(amount);
    }
}
