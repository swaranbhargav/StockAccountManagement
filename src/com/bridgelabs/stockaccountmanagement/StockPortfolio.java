package com.bridgelabs.stockaccountmanagement;

public class StockPortfolio {
    
	 Stock[] stocks;

	    public StockPortfolio(int numStocks) {
	        stocks = new Stock[numStocks];
	    }

	    public void addStock(Stock stock, int index) {
	        stocks[index] = stock;
	    }

	    public double getTotalValue() {
	        double totalValue = 0;
	        for (Stock stock : stocks) {
	            totalValue += stock.getValue();
	        }
	        return totalValue;
	    }
}
