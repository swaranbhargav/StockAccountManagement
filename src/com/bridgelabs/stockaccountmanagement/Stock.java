package com.bridgelabs.stockaccountmanagement;

public class Stock {

	String stockName;
	int numShares;
	double pricePerShare;

	public Stock(String stockName, int numShares, double pricePerShare) {
		this.stockName = stockName;
		this.numShares = numShares;
		this.pricePerShare = pricePerShare;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public int getNumShares() {
		return numShares;
	}

	public void setNumShares(int numShares) {
		this.numShares = numShares;
	}

	public double getPricePerShare() {
		return pricePerShare;
	}

	public void setPricePerShare(double pricePerShare) {
		this.pricePerShare = pricePerShare;
	}

	public double getValue() {
		return numShares * pricePerShare;
	}

}
