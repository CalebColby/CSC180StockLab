package Models;

public class stock_trade {
    String Type;
    String StockSymbol;
    int CountShares;
    double PricePerShare;

    public stock_trade(String type, String stockSymbol, int countShares, double pricePerShare) {
        super();
        Type = type;
        StockSymbol = stockSymbol;
        CountShares = countShares;
        PricePerShare = pricePerShare;
    }
}
