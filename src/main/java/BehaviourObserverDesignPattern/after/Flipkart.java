package BehaviourObserverDesignPattern.after;

import java.awt.*;
import java.util.ArrayList;

public class Flipkart {
    //Flipkart should have all the classes that want to do something on that event.
       //Interface                        //Class(Gmail,Yahoo)
//    private EmailService emailService=new EmailService();
//    private SMSService smsService=new SMSService();
//    private InvoiceService invoiceService=new InvoiceService();
//    private InventoryService inventoryService=new InventoryService();

    private java.util.List<PaymentSuccessEventSubscriber> paymentSuccessEventSubscriberList =new ArrayList<>();

//    public void paymentSuccess(int order_id) {
//        emailService.sendEmail(order_id);
//        smsService.sendSMS(order_id);
//        invoiceService.sendInvoice(order_id);
//        inventoryService.updateInventory(order_id);
//    }
    public void paymentSuccess(int order_id) {
        for(PaymentSuccessEventSubscriber subscriber:paymentSuccessEventSubscriberList) {
            subscriber.notify(order_id);
        }
    }
    public void subscribe(PaymentSuccessEventSubscriber subscriber) {
        paymentSuccessEventSubscriberList.add(subscriber);
    }
    public void unsubscribe(PaymentSuccessEventSubscriber subscriber) {
        paymentSuccessEventSubscriberList.remove(subscriber);
    }
}
