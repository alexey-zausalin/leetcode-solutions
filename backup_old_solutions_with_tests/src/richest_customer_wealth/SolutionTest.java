package richest_customer_wealth;

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
    public void maximumWealthUsingStreamsTest(int[][] accounts, int expectedResult) {
        assertEquals(expectedResult, solution.maximumWealthUsingStreams(accounts));
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void maximumWealthUsingStreamsV2Test(int[][] accounts, int expectedResult) {
        assertEquals(expectedResult, solution.maximumWealthUsingStreamsV2(accounts));
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void maximumWealthUsingRawJavaTest(int[][] accounts, int expectedResult) {
        assertEquals(expectedResult, solution.maximumWealthUsingRawJava(accounts));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[][]{new int[]{1,2,3}, new int[]{3,2,1}}, 6},
                {new int[][]{new int[]{1,5}, new int[]{7,3}, new int[]{3,5}}, 10}
        };
    }
}
