package factory;

/**
 * TransactionReportFactoryTest.java
 * @author: Gilberto Silva (218239300)
 * Date: 08 April 2023
 */

import domain.TransactionReport;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class TransactionReportFactoryTest {

    private TransactionReport tr1;
    private TransactionReport tr2;
    private TransactionReport tr3;

    @BeforeEach
    void setUp(){
        tr1 = new TransactionReport();
        tr2 = new TransactionReport();
        tr3 = tr1;
    }

    @Test
    public void test(){
        TransactionReport transactionReport = TransactionReportFactory.createTransactionReport("ACD00032", "purchase", "Thu, Sep 29 2022",10.000, "USD", "pending");
    }

    @Test
    void testEquality(){assertEquals(tr1,tr3);}

    @Test
    void testIdentity(){assertSame(tr1,tr3);}

    @Test
    void testFail(){assertEquals(tr1,tr2);}

    @Test
    @Timeout(value=1000, unit = TimeUnit.MILLISECONDS)
    void testTimeout(){System.out.println("Time has passed");}

    @Test
    @Disabled("Disabled ERROR 808")

    void testWillBeSkipped(){}
}