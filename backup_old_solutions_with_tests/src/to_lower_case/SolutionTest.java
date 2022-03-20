package to_lower_case;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void toLowerCaseTest(String s, String expectedResult) {
        assertEquals(expectedResult, solution.toLowerCase(s));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {"Hello", "hello"},
                {"here", "here"},
                {"LOVELY", "lovely"},
                {"al&phaBET", "al&phabet"},
        };
    }
}
