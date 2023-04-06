package com.bridgelabs.stockaccountmanagement;

import java.util.Scanner;

public class StockAccountManagement {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of stocks: ");
		int numStocks = scanner.nextInt();

		StockPortfolio portfolio = new StockPortfolio(numStocks);

		for (int i = 0; i < numStocks; i++) {
			System.out.print("Enter the name of stock " + (i + 1) + ": ");
			String name = scanner.next();

			System.out.print("Enter the number of shares of " + name + ": ");
			int numShares = scanner.nextInt();

			System.out.print("Enter the price per share of " + name + ": ");
			double pricePerShare = scanner.nextDouble();

			Stock stock = new Stock(name, numShares, pricePerShare);
			portfolio.addStock(stock, i);
		}

		System.out.println();
		System.out.println("Stock Report:");
		System.out.println("--------------");

		for (int i = 0; i < numStocks; i++) {
			Stock stock = portfolio.stocks[i];
			double value = stock.getValue();
			System.out.printf(stock.stockName, stock.numShares, stock.pricePerShare, value);
		}

		double totalValue = portfolio.getTotalValue();
		System.out.printf("Total:", totalValue);

	}

}
