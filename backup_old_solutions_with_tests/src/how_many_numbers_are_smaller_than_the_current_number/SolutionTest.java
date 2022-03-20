package how_many_numbers_are_smaller_than_the_current_number;

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
    public void smallerNumbersThanCurrentTest(int[] nums, int[] expectedResult) {
        assertArrayEquals(expectedResult, solution.smallerNumbersThanCurrent(nums));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[]{8,1,2,2,3}, new int[]{4,0,1,1,3}},
                {new int[]{6,5,4,8}, new int[]{2,1,0,3}},
                {new int[]{7,7,7,7}, new int[]{0,0,0,0}}
        };
    }
}
