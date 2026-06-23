class ObserverTest{
    public static void main(String[] args){
       StockMarket sm = new StockMarket();
       Observer mob = new MobileApp();
       Observer web = new WebApp();

       sm.registerObserver(mob);
       sm.registerObserver(web);

       sm.setStockPrice(150.0);
       sm.setStockPrice(175.90);
       sm.removeObserver(mob);

        //System.out.println("------------------------------");

    }
}