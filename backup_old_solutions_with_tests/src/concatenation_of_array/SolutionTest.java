package concatenation_of_array;

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
    public void concatenationTest(int[] nums, int[] expectedResult) {
        assertArrayEquals(expectedResult, solution.getConcatenation(nums));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[]{1,2,1}, new int[]{1,2,1,1,2,1}},
                {new int[]{1,3,2,1}, new int[]{1,3,2,1,1,3,2,1}}
        };
    }
}
