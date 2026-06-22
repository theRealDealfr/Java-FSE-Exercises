public class Gateway2Adapter implements PaymentProcessor{
    private Gateway2 gw2;
    Gateway2Adapter(Gateway2 gw2){
        this.gw2 = gw2;
    }
    public void processPayment(){
        gw2.startPayment();
        gw2.processPayment();
        gw2.endPayment();
    }
    public void printReceipt(){
        System.out.println("Printing receipt of gw2 transaction...");
    }
}