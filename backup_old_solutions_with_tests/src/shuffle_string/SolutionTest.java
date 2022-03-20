package shuffle_string;

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
    public void longestCommonPrefixTest(String s, int[] indices, String expectedResult) {
        assertEquals(expectedResult, solution.restoreString(s, indices));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {"codeleet", new int[]{4,5,6,7,0,2,1,3}, "leetcode"},
                {"abc", new int[]{0,1,2}, "abc"},
        };
    }
}
