public class StockMarketTest {
    public static void main(String[] args) {
        // Create stock market (subject)
        StockMarket stockMarket = new StockMarket("AAPL", 150.00);

        // Create observers
        Observer mobileApp1 = new MobileApp("StockTracker");
        Observer mobileApp2 = new MobileApp("TradeRiser");
        Observer webApp = new WebApp("MarketWatch");

        // Register observers
        stockMarket.registerObserver(mobileApp1);
        stockMarket.registerObserver(mobileApp2);
        stockMarket.registerObserver(webApp);

        // Update stock price (notifies all observers)
        stockMarket.setStockPrice(155.50);

        // Deregister one observer
        stockMarket.deregisterObserver(mobileApp2);

        // Update stock price again (notifies remaining observers)
        stockMarket.setStockPrice(160.75);
    }
}