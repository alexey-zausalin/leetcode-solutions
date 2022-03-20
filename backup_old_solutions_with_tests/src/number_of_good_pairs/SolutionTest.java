package number_of_good_pairs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void isPalindromeSafeOverflowTest(int[] nums, int expectedResult) {
        assertEquals(expectedResult, solution.numIdenticalPairs(nums));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[]{1,2,3,1,1,3}, 4},
                {new int[]{1,1,1,1}, 6},
                {new int[]{1,2,3}, 0},
                {new int[]{1,1,1,1,1}, 10},
        };
    }
}
