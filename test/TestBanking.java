package test;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestBanking {

    @Test
    public void testSavemoneyWithOneYear() {
        assertEquals(2, Banking.Savemoney(1, 2));
    }

    @Test
    public void testSavemoneyWithMultipleYears() {
        assertEquals(220, Banking.Savemoney(2, 200));
    }

    @Test
    public void testSavemoneyWithZeroYears() {
        assertEquals(0, Banking.Savemoney(0, 100));
    }

    @Test
    public void testSavemoneyWithNegativeYears() {
        assertEquals(100, Banking.Savemoney(-1, 100));
    }

    @Test
    public void testSavemoneyWithZeroInitialAmount() {
        assertEquals(0, Banking.Savemoney(5, 0));
    }
}
