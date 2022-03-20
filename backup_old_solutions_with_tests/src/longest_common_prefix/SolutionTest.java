package longest_common_prefix;

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
    public void longestCommonPrefixTest(String[] strs, String expectedResult) {
        assertEquals(expectedResult, solution.longestCommonPrefix(strs));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new String[]{"flower","flow","flight"}, "fl"},
                {new String[]{"dog","racecar","car"}, ""},
                {new String[]{"a"}, "a"},
                {new String[]{"a", "ab"}, "a"},
                {new String[]{"a", ""}, ""}
        };
    }
}
