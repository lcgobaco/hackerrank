package PickingNumbers;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ResultTest {

    @Test
    public void pickingNumbers() {
        int result = Result.pickingNumbers(Arrays.asList(4, 6, 5, 3, 3, 1));
        assertEquals(3, result);
    }
}