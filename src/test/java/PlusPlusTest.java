import org.junit.Test;

import static org.junit.Assert.*;

public class PlusPlusTest {

    @Test
    public void plusPlusN() {
        int result = PlusPlus.plusPlusN(3);
        assertEquals(4, result);
    }

    @Test
    public void nPlusPlus() {
        int result = PlusPlus.nPlusPlus(3);
        assertEquals(4, result);
    }
}