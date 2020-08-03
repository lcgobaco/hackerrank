package FormingMagicSquare;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void formingMagicSquare() {
        /*4 9 2
        3 5 7
        8 1 5*/

        int result = Solution.formingMagicSquare(new int[][] {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 5}
        });
        assertEquals(1, result);
    }

    @Test
    public void main() {
    }
}