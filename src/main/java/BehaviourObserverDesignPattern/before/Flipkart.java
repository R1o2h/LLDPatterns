package BehaviourObserverDesignPattern.before;

public class Flipkart {
       //Interface                        //Class(Gmail,Yahoo)
    private EmailService emailService=new EmailService();
    private SMSService smsService=new SMSService();
    private InvoiceService invoiceService=new InvoiceService();
    private InventoryService inventoryService=new InventoryService();

    public void paymentSuccess(int order_id) {
        emailService.sendEmail(order_id);
        smsService.sendSMS(order_id);
        invoiceService.sendInvoice(order_id);
        inventoryService.updateInventory(order_id);
    }
}
