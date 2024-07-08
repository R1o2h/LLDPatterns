package BehaviourObserverDesignPattern.after;

public class Client {
    //Configuration
    //Send_email_on_order=true
    //Send_sms_on_order=true

    private static EmailService emailService=new EmailService();
    private static SMSService smsService=new SMSService();
    private static InventoryService inventoryService=new InventoryService();
    private static InvoiceService invoiceService=new InvoiceService();

    public static void main(String[] args) {
        Flipkart flipkart= new Flipkart();
        flipkart.subscribe(smsService);
        flipkart.subscribe(emailService);
        flipkart.subscribe(inventoryService);
        flipkart.subscribe(invoiceService);
        flipkart.unsubscribe(smsService);
        flipkart.paymentSuccess(123);
    }
}
