package LiskovPrinciple;

public class RazorpayAdapter implements PaymentAPI {
    RazorpayAdapter razorpayAdapter=new RazorpayAdapter();


    @Override
    public void insertCardValues(String cardNumber, int expiryMonth, int expiryYear, int cvv, String name) {

    }

    @Override
    public boolean startTransaction(int transactionID) {
        return false;
    }

    @Override
    public boolean checkCompletion(int transactionID) {
        return false;
    }
}
