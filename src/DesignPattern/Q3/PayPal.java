package DesignPattern.Q3;

public class PayPal implements PaymentStrategy{

    private String emailId;

    public PayPal(String emailId) {
        this.emailId = emailId;
    }

    @Override
    public void pay(int amount) {
        System.out.println("PayPal: $" +amount );
    }
}
