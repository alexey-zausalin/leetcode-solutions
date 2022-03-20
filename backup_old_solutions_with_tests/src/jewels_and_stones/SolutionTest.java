package jewels_and_stones;

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
    public void usingStreamsTest(String jewels, String stones, int expectedResult) {
        assertEquals(expectedResult, solution.numJewelsInStonesUsingStreams(jewels, stones));
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void usingRawJavaTest(String jewels, String stones, int expectedResult) {
        assertEquals(expectedResult, solution.numJewelsInStonesRawJava(jewels, stones));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {"aA", "aAAbbbb", 3},
                {"z", "ZZ", 0}
        };
    }
}
