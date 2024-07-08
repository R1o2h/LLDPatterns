package BehaviourObserverDesignPattern.after;

public class EmailService implements PaymentSuccessEventSubscriber{
    public void sendEmail (int order_id) {
        System.out.println("Email Service");
    }

    @Override
    public void notify(int order_id) {
       sendEmail(order_id);
    }
}
