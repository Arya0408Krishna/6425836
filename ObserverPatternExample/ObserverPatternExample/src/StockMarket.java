import java.util.ArrayList;
import java.util.List;

public class StockMarket implements Stock {
    private List<Observer> observers = new ArrayList<>();
    private String stockName;
    private double stockPrice;

    public StockMarket(String stockName, double initialPrice) {
        this.stockName = stockName;
        this.stockPrice = initialPrice;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
        System.out.println("Registered observer: " + observer.getClass().getSimpleName());
    }

    @Override
    public void deregisterObserver(Observer observer) {
        observers.remove(observer);
        System.out.println("Deregistered observer: " + observer.getClass().getSimpleName());
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(stockName, stockPrice);
        }
    }

    public void setStockPrice(double newPrice) {
        this.stockPrice = newPrice;
        System.out.println("Stock price updated for " + stockName + ": $" + stockPrice);
        notifyObservers();
    }
}