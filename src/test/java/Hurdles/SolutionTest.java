package Hurdles;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void hurdleRace() {
        int result = Solution.hurdleRace(4, new int[] {1, 6, 3, 5, 2});
        assertEquals(2, result);
    }

    @Test
    public void hurdleRace2() {
        int result = Solution.hurdleRace(4, new int[] {1, 6, 3, 5, 2});
        assertEquals(2, result);
    }
}