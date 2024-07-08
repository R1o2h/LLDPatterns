package LiskovPrinciple;


enum TransactionStatus {
    SUCCESS,
    FAILURE,
    PROGRESS
}
public class PayUAPI {
        public boolean enterCardDetails(Long cardNumber, int expiryMonth,int expiryYear,int cvv, String name) {
            return true;
        }
        public void startTransaction(int lastThreeDigits) {

        }
        public boolean checkstatus(int lastThreeTransactionID)  {
            return true;
        }
}
