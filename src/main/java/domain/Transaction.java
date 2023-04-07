package domain;

import java.util.Date;

/**
 * POJO Class Transaction
 * Name: Gilberto Silva
 * Student: 218239300
 */
public class Transaction {
    public int transactionReport_ID;
    public String transactionReport_Type;
    public Date date_Of_Transaction;
    public int amount;
    public int currency;
    public String status;

    //-------------Constructor----------------------
    public Transaction() {}

    public Transaction(int transactionReport_ID) {this.transactionReport_ID = transactionReport_ID;}

    public Transaction(int transactionReport_ID, String transactionReport_Type, Date date_Of_Transaction, int amount, int currency, String status) {
        this.transactionReport_ID = transactionReport_ID;
        this.transactionReport_Type = transactionReport_Type;
        this.date_Of_Transaction = date_Of_Transaction;
        this.amount = amount;
        this.currency = currency;
        this.status = status;
    }

    //--------------Getters----------------------
    public int getTransactionReport_ID() {return transactionReport_ID;}

    public String getTransactionReport_Type() {return transactionReport_Type;}

    public Date getDate_Of_Transaction() {return date_Of_Transaction;}

    public int getAmount() {return amount;}

    public int getCurrency() {return currency;}

    public String getStatus() {return status;}

    //------------------Setters-------------------------
    public void setTransactionReport_ID(int transactionReport_ID) {this.transactionReport_ID = transactionReport_ID;}

    public void setTransactionReport_Type(String transactionReport_Type) {this.transactionReport_Type = transactionReport_Type;}

    public void setDate_Of_Transaction(Date date_Of_Transaction) {this.date_Of_Transaction = date_Of_Transaction;}

    public void setAmount(int amount) {this.amount = amount;}

    public void setCurrency(int currency) {this.currency = currency;}

    public void setStatus(String status) {this.status = status;}

    //------------------To String-------------

    @Override
    public String toString() {
        return "Transaction{" +
                "transactionReport_ID=" + transactionReport_ID +
                ", transactionReport_Type='" + transactionReport_Type + '\'' +
                ", date_Of_Transaction=" + date_Of_Transaction +
                ", amount=" + amount +
                ", currency=" + currency +
                ", status='" + status + '\'' +
                '}';
    }
}

