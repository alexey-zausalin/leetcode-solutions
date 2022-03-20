package shuffle_the_array;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void shuffleTest(int[] nums, int n, int[] expectedResult) {
        assertArrayEquals(expectedResult, solution.shuffle(nums, n));
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void shuffleTwoPointersTest(int[] nums, int n, int[] expectedResult) {
        assertArrayEquals(expectedResult, solution.shuffleTwoPointers(nums, n));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[]{2,5,1,3,4,7}, 3, new int[]{2,3,5,4,1,7}},
                {new int[]{1,2,3,4,4,3,2,1}, 4, new int[]{1,4,2,3,3,2,4,1}},
                {new int[]{1,1,2,2}, 2, new int[]{1,2,1,2}},
        };
    }
}
