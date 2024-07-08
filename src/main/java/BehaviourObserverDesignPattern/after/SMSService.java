package BehaviourObserverDesignPattern.after;

public class SMSService implements PaymentSuccessEventSubscriber{
    public void sendSMS(int order_id) {
        System.out.println("SMS Service");
    }

    @Override
    public void notify(int order_id) {
        sendSMS(order_id);
    }
}
