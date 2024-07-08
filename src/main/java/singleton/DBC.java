package singleton;

public class DBC {
    private static DBC dbc=null;
    // private static final DBC dbc= new DBC(); //Creating objects without get instance method
    private DBC() {

    }

    public static DBC getInstance() {
        if(dbc==null) {
            synchronized (dbc) {     //Double Locking method-> For Threads
                if(dbc==null) {
                    dbc=new DBC();
                }
            }
        }
        return dbc;
    }
}
//Constructor
//1.Throws an exception
//2.Return a NEW object

