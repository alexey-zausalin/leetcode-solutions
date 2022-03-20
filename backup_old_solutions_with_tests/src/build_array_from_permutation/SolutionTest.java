package build_array_from_permutation;

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
    public void buildArrayTest(int[] nums, int[] expectedResult) {
        assertArrayEquals(expectedResult, solution.buildArray(nums));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[]{0,2,1,5,3,4}, new int[]{0,1,2,4,5,3}},
                {new int[]{5,0,1,2,3,4}, new int[]{4,5,0,1,2,3}}
        };
    }
}
