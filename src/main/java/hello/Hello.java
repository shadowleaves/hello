package hello;

import yahoofinance.YahooFinance;
import yahoofinance.Stock;

public class Hello {
    public static void main(String[] args){
        System.out.println("Hello World!\n");

        Stock tesla = YahooFinance.get("TSLA", true);
        System.out.println(tesla.getHistory());
    }
}
