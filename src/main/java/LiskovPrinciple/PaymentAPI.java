package LiskovPrinciple;

public interface PaymentAPI {
    void insertCardValues(
            String cardNumber,
            int expiryMonth,
            int expiryYear,
            int cvv,
            String name
    );
    boolean startTransaction(int transactionID);
    boolean checkCompletion(int transactionID);
}
