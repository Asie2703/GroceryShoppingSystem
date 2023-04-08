package domain;

import java.util.Date;

/**
 * POJO Class Transaction
 * Name: Gilberto Silva
 * Student: 218239300
 */
public class TransactionReport {
    public int transactionReport_ID;
    public String transactionReport_Type;
    public Date date_Of_Transaction;
    public int amount;
    public int currency;
    public String status;

    //-------------Constructor----------------------
    public TransactionReport() {}

    //---------------Builder----------------
    private TransactionReport(Builder builder){
        this.transactionReport_ID = builder.transactionReport_ID;
        this.transactionReport_Type = builder.transactionReport_Type;
        this.date_Of_Transaction = builder.date_Of_Transaction;
        this.amount = builder.amount;
        this.currency = builder.currency;
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
    //---------------Builder---------------------------
    public static class Builder{
        public int transactionReport_ID;
        public String transactionReport_Type;
        public Date date_Of_Transaction;
        public int amount;
        public int currency;
        public String status;

        public Builder setTransactionReport(int transactionReport_ID){
            this.transactionReport_ID = transactionReport_ID;
            return this;
        }

        public Builder setTransactionReport_Type(String transactionReport_Type){
            this.transactionReport_Type = transactionReport_Type;
            return this;
        }

        public Builder setDate_Of_Transaction(Date date_Of_Transaction){
            this.date_Of_Transaction = date_Of_Transaction;
            return this;
        }

        public Builder setAmount(int amount){
            this.amount = amount;
            return this;
        }

        public Builder setCurrency(int currency){
            this.currency = currency;
            return this;
        }

        public Builder setStatus(String status){
            this.status = status;
            return this;
        }

        public Builder copy(TransactionReport transaction) {
            this.transactionReport_ID = transaction.transactionReport_ID;
            this.transactionReport_Type = transaction.transactionReport_Type;
            this.date_Of_Transaction = transaction.date_Of_Transaction;
            this.amount = transaction.amount;
            this.currency = transaction.currency;
            this.status = transaction.status;
            return this;
        }

        public TransactionReport build(){

            return new TransactionReport(this);
        }

    }
}

