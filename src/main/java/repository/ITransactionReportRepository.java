package repository;

/**
 * ITransactionReportRepository.java
 * @author: Gilberto Silva (218239300)
 * Date: 08 April 2023
 */

import domain.TransactionReport;
import java.util.Set;

public interface ITransactionReportRepository extends IRepository<TransactionReport, String>{
    public Set<TransactionReport> getAll();
}
