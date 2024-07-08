package BehaviourObserverDesignPattern.after;

public class InvoiceService implements PaymentSuccessEventSubscriber{

    public void sendInvoice(int order_id) {
        System.out.println("Invoice Service");
    }

    @Override
    public void notify(int order_id) {
      sendInvoice(order_id);
    }
}
