import java.util.ArrayList;
import java.util.List;

class StockMarket implements Stock{
    private List<Observer> observers = new ArrayList<>();
    private double stockPrice;

    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        observers.remove(o);
    }

    public void notifyObservers(){
        for(Observer obs : observers){
            obs.update();
        }
        
    }
    public void setStockPrice(double s){
        this.stockPrice = s;
        System.out.println("\nStock price changed to: " + stockPrice);
        notifyObservers();
    }
}