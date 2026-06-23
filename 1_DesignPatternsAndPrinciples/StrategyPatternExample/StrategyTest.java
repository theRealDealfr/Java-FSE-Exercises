class StrategyTest{
    public static void main(String[] args){
        PaymentStrategy card = new CreditCardPayment();
        PaymentContext con = new PaymentContext(card);
        con.executeStrategy();

        PaymentContext context = new PaymentContext(new PayPalPayment());
        context.executeStrategy();

        //System.out.println("------------------------------");

    }
}