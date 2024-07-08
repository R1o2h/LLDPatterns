package LiskovPrinciple;

public class Flipkart {

    Flipkart (PaymentAPI api) {
        this.api=api; //Dependency Injection
    }
    PaymentAPI api = new RazorpayAdapter();
    RazorpayAPI razorpayAPI = new RazorpayAPI(); // to call razorpay
    PayUAPI payUAPI = new PayUAPI(); // to call payuapi

    //    void pay() {
//        payUAPI.enterCardDetails(
//                "10001",
//                01,
//                2121,
//                121,
//                "Tamilvanan"
//        );
//        //
    void pay() {
        api.insertCardValues(
                "10001",
                01,
                2121,
                121,
                "Tamilvanan"
        );
        api.startTransaction(123); //Loose Coupling
        while (api.checkCompletion(123) != true) {
            //pause
        }
        // Hard coded (Tight Coupling) --> if u need to change your requiremnts going forward ,this wont a good way Instead use Loose coupling
//             razorpayAPI.initiatePayment(100110L);
//             while(razorpayAPI.checkStatus(0101L)!=true){
//                 // Pause
//             }
//        }

    }
}
