public class AdapterTest{
    public static void main(String[] args){
        Gateway1 gway1 = new Gateway1();
        PaymentProcessor gw1 = new Gateway1Adapter(gway1);
        gw1.processPayment();
        gw1.printReceipt();

        Gateway2 gway2 = new Gateway2();
        PaymentProcessor gw2 = new Gateway2Adapter(gway2);
        gw2.processPayment();
        gw2.printReceipt();
    }

}