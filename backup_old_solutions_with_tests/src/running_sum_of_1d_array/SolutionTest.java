package running_sum_of_1d_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void runningSumTest(int[] nums, int[] expectedResult) {
        assertArrayEquals(expectedResult, solution.runningSum(nums));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[]{1,2,3,4}, new int[]{1,3,6,10}},
                {new int[]{1,1,1,1,1}, new int[]{1,2,3,4,5}},
                {new int[]{1,1,1,1,1}, new int[]{1,2,3,4,5}},
                {new int[]{3,1,2,10,1}, new int[]{3,4,6,16,17}}
        };
    }
}
