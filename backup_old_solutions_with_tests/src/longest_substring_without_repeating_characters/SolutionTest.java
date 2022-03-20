package longest_substring_without_repeating_characters;

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
    public void lengthOfLongestSubstringTest(String s, int expectedResult) {
        assertEquals(expectedResult, solution.lengthOfLongestSubstring(s));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {"abcabcbb", 3},
                {"bbbbb", 1},
                {"pwwkew", 3},
                {"abcdef", 6},
                {"", 0},
                {"dvdf", 3}
        };
    }
}
