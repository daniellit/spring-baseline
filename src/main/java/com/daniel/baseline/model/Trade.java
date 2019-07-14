package com.daniel.baseline.model;

import javax.persistence.Entity;
import java.util.Objects;

@Entity
public class Trade extends Identifiable{

    private String stockCode;
    private double amount;
    private Boolean transacted;

    public Trade(String id, String stockCode, double amount, Boolean transacted) {
        super(id);
        this.stockCode = stockCode;
        this.amount = amount;
        this.transacted = transacted;
    }

    public String getStockCode() {
        return stockCode;
    }

    public void setStockCode(String stockCode) {
        this.stockCode = stockCode;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Boolean getTransacted() {
        return transacted;
    }

    public void setTransacted(Boolean transacted) {
        this.transacted = transacted;
    }

    @Override
    public String toString() {
        return "Trade{" +
                "stockCode='" + stockCode + '\'' +
                ", amount=" + amount +
                ", transacted=" + transacted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Trade)) return false;
        Trade trade = (Trade) o;
        return Double.compare(trade.getAmount(), getAmount()) == 0 &&
                getStockCode().equals(trade.getStockCode()) &&
                getTransacted().equals(trade.getTransacted());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getStockCode(), getAmount(), getTransacted());
    }
}
