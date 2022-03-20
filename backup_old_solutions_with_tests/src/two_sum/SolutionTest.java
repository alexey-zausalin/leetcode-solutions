package two_sum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void testTwoSum1() {
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertArrayEquals(result, (new int[]{0, 1}));
    }

    @Test
    public void testTwoSum2() {
        int[] result = solution.twoSum(new int[]{3, 2, 4}, 6);
        assertArrayEquals(result, (new int[]{1, 2}));
    }

    @Test
    public void testTwoSum3() {
        int[] result = solution.twoSum(new int[]{3, 3}, 6);
        assertArrayEquals(result, (new int[]{0, 1}));
    }
}
