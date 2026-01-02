package BehaviouralPattern.Strategy;

public class CashPaymentStrategy implements PaymentStrategy{
    @Override
    public void paid(int amount){
        System.out.println("Amount "+amount+" paid via Cash");
    }
}
