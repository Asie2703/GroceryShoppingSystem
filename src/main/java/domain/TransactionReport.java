package domain;

/**
 * Transaction.java
 * @author: Gilberto Silva (218239300)
 * Date: 07 April 2023
 */
public class TransactionReport {
    public String transactionReport_ID;
    public String transactionReport_Type;

    public String date_Of_Transaction;
    public double amount;
    public String currency;

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
    public String getTransactionReport_ID() {return transactionReport_ID;}

    public String getTransactionReport_Type() {return transactionReport_Type;}

    public String getDate_Of_Transaction() {return date_Of_Transaction;}

    public double getAmount() {return amount;}

    public String getCurrency() {return currency;}


    public String getStatus() {return status;}

    //------------------Setters-------------------------
    public void setTransactionReport_ID(String transactionReport_ID) {this.transactionReport_ID = transactionReport_ID;}

    public void setTransactionReport_Type(String transactionReport_Type) {this.transactionReport_Type = transactionReport_Type;}

    public void setDate_Of_Transaction(String date_Of_Transaction) {this.date_Of_Transaction = date_Of_Transaction;}

    public void setAmount(double amount) {this.amount = amount;}

    public void setCurrency(String currency) {this.currency = currency;}

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
        public String transactionReport_ID;
        public String transactionReport_Type;

        public String date_Of_Transaction;
        public double amount;
        public String currency;

        public String status;

        public Builder setTransactionReport(String transactionReport_ID){
            this.transactionReport_ID = transactionReport_ID;
            return this;
        }

        public Builder setTransactionReport_Type(String transactionReport_Type){
            this.transactionReport_Type = transactionReport_Type;
            return this;
        }


        public Builder setDate_Of_Transaction(String date_Of_Transaction){

            this.date_Of_Transaction = date_Of_Transaction;
            return this;
        }


        public Builder setAmount(double amount){

            this.amount = amount;
            return this;
        }


        public Builder setCurrency(String currency){

            this.currency = currency;
            return this;
        }

        public Builder setStatus(String status){
            this.status = status;
            return this;
        }

        public Builder copy(TransactionReport transactionReport) {
            this.transactionReport_ID = transactionReport.transactionReport_ID;
            this.transactionReport_Type = transactionReport.transactionReport_Type;
            this.date_Of_Transaction = transactionReport.date_Of_Transaction;
            this.amount = transactionReport.amount;
            this.currency = transactionReport.currency;
            this.status = transactionReport.status;

            return this;
        }

        public TransactionReport build(){

            return new TransactionReport(this);
        }

    }
}

