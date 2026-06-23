class PaymentContext{
    private PaymentStrategy strategy;
    PaymentContext(PaymentStrategy ps){
        strategy = ps;
    }
    public void executeStrategy(){
        strategy.pay();
    }
}