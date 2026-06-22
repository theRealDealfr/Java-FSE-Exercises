public class Gateway1Adapter implements PaymentProcessor{
    private Gateway1 gw1;
    Gateway1Adapter(Gateway1 gw1){
        this.gw1 = gw1;
    }
    public void processPayment(){
        gw1.doPayment();
    }
    public void printReceipt(){
        System.out.println("Printing receipt of gw1 transaction...");
    }

}