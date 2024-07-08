package BehaviourObserverDesignPattern.after;

public interface PaymentSuccessEventSubscriber {
    void notify(int order_id);
}
