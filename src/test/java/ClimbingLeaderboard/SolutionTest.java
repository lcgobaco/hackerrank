package ClimbingLeaderboard;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class SolutionTest  {

    @Test
    public void testRemoveDuplicates() {

        Integer[] result = Solution.removeDuplicates(new int[] {1, 1, 2, 3, 3});

        assertArrayEquals(new Integer[] {1,2,3}, result);
    }

    @Test
    public void testClimbingLeaderboard() {
        int[] result = Solution.climbingLeaderboard(
                new int[] {100, 100, 50, 40, 40, 20, 10},
                new int[] {5, 25, 50, 120}
        );

        assertArrayEquals(new int[] {6, 4, 2, 1}, result);
    }
}