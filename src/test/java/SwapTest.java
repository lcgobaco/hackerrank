import org.junit.Test;

import static org.junit.Assert.*;

public class SwapTest {

    @Test
    public void swapNative() {
        int x = 2;
        int y = 3;
        Swap.swapNative(x, y);
        assertEquals(2, x);
        assertEquals(3, y);
    }

    @Test
    public void swapObject() {
        Swap.Bag x = new Swap.Bag(2);
        Swap.Bag y = new Swap.Bag(3);
        Swap.swapObject(x, y);
        assertEquals(Integer.valueOf(3), x.value);
        assertEquals(Integer.valueOf(2), y.value);
    }
}