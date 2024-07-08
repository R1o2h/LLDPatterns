package BehaviourObserverDesignPattern.after;

public class InventoryService implements PaymentSuccessEventSubscriber{
    public void updateInventory(int order_id) {
        System.out.println("Inventory Service");
    }

    @Override
    public void notify(int order_id) {
       updateInventory(order_id);
    }
}
