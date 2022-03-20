package palindrome_number;

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
    public void isPalindromeDangerousOverflowTest(int number, boolean expectedResult) {
        assertEquals(expectedResult, solution.isPalindromeDangerousOverflow(number));
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void isPalindromeSafeOverflowTest(int number, boolean expectedResult) {
        assertEquals(expectedResult, solution.isPalindromeSafeOverflow(number));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {121, true},
                {-122, false},
                {10, false},
                {1, true},
                {101, true},
                {0, true}
        };
    }
}
