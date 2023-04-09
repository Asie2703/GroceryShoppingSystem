package repository;

/**
 * TransactionReportRepositoryTest.java
 * @author: Gilberto Silva (218239300)
 * Date: 09 April 2023
 */

import domain.TransactionReport;
import factory.TransactionReportFactory;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import static org.junit.jupiter.api.Assertions.*;

@TestMethodOrder(MethodOrderer.MethodName.class)
class TransactionReportRepositoryTest {

    private static TransactionReportRepository transactionReportRepository = TransactionReportRepository.getRepository();
    private TransactionReport transactionReport = TransactionReportFactory.createTransactionReport("AAA001", "Cheque", "09/10/2022", 23.000, "Euro", "Pending");
    @Test
    void a_create() {
        TransactionReport created = transactionReportRepository.create(transactionReport);
        assertEquals(transactionReport.getTransactionReport_ID(), created.getTransactionReport_ID());
        System.out.println("Create: " + created);
    }

    @Test
    void b_read() {
        TransactionReport read = transactionReportRepository.read(transactionReport.getTransactionReport_ID());
        assertNotNull(read);
        System.out.println("Read: " + read);
    }

    @Test
    void c_update() {
        TransactionReport updated = new TransactionReport.Builder().copy(transactionReport).setTransactionReport("ABC222")
                .setTransactionReport_Type("Cheque")
                .setDate_Of_Transaction("05/06/2021")
                .setAmount(12.000)
                .setCurrency("Euro")
                .setStatus("Pending")
                .build();
        assertNotNull(transactionReportRepository.update(updated));
        System.out.println("Updated: " + updated);
    }

    @Test
    void d_delete() {
        boolean success = transactionReportRepository.delete(transactionReport.getTransactionReport_ID());
        assertTrue(success);
        System.out.println("Deleted: " + success);
    }

    @Test
    void e_getAll() {
        System.out.println("Show all: ");
        System.out.println(transactionReportRepository.getAll());
    }
}