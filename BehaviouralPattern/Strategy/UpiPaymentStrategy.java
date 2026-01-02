package BehaviouralPattern.Strategy;



public class UpiPaymentStrategy implements PaymentStrategy {
    @Override
    public void paid(int amount){
        System.out.println("Amount "+amount+" paid via UPI");
    }
}
