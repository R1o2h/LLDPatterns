package LiskovPrinciple;

public class PayupiAdapter implements PaymentAPI{
    PayUAPI payUAPI=new PayUAPI();

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
