package add_strings;

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
    public void addStringsTest(String s1, String s2, String expectedResult) {
        assertEquals(expectedResult, solution.addStrings(s1, s2));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {"11", "123", "134"},
                {"456", "77", "533"},
                {"0", "0", "0"},
                {"1", "9", "10"}
        };
    }
}
