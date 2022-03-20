package final_value_of_variable_after_performing_operations;

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
    public void finalValueAfterOperationsTest(String[] operations, int expectedResult) {
        assertEquals(expectedResult, solution.finalValueAfterOperations(operations));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new String[]{"--X","X++","X++"}, 1},
                {new String[]{"++X","++X","X++"}, 3},
                {new String[]{"X++","++X","--X","X--"}, 0}
        };
    }
}
