package repository;

/**
 * TransactionReportRepository.java
 * @author: Gilberto Silva (218239300)
 * Date: 08 April 2023
 */

import domain.TransactionReport;
import java.util.HashSet;
import java.util.Set;

public class TransactionReportRepository implements ITransactionReportRepository{
    private static TransactionReportRepository trRepository = null;
    private Set<TransactionReport> trSet = null;

    private TransactionReportRepository (){trSet = new HashSet<TransactionReport>();}

    public static TransactionReportRepository getRepository(){
        if (trRepository == null){
            trRepository = new TransactionReportRepository();
        }
        return trRepository;
    }

    @Override
    public TransactionReport create(TransactionReport transactionReport) {
        boolean success = trSet.add(transactionReport);
        if (!success)
            return null;
        return transactionReport;
    }

    @Override
    public TransactionReport read(String transactionReport_ID) {
        TransactionReport transactionReport = trSet.stream()
                .filter(s -> s.getTransactionReport_ID().equals(transactionReport_ID))
                .findAny()
                .orElse(null);
        return transactionReport;
    }

    @Override
    public TransactionReport update(TransactionReport transactionReport) {
        TransactionReport oldTransaction = read(transactionReport.getTransactionReport_ID());
        if (oldTransaction != null){
            trSet.remove(oldTransaction);
            trSet.add(transactionReport);
            return transactionReport;
        }
        return null;
    }

    @Override
    public boolean delete(String transactionReport_ID) {
       TransactionReport deleteTransaction = read(transactionReport_ID);
       if (deleteTransaction == null)
        return false;
       trSet.remove(deleteTransaction);
       return true;
    }

    @Override
    public Set<TransactionReport> getAll() {
        return trSet;
    }
}
