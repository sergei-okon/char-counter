package ua.com.foxminded.counter.math;

public class Item {

    private String symbol;
    private int number;

    public Item(String symbol, int number) {
        this.symbol = symbol;
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Stage{" +
                "symbol='" + symbol + '\'' +
                ", number=" + number +
                '}';
    }
}
