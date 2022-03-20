package kids_with_the_greatest_number_of_candies;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void kidsWithCandiesUsingRawJavaTest(int[] candies, int extraCandies, List<Boolean> expectedResult) {
        assertEquals(expectedResult, solution.kidsWithCandiesUsingRawJava(candies, extraCandies));
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void kidsWithCandiesUsingStreamTest(int[] candies, int extraCandies, List<Boolean> expectedResult) {
        assertEquals(expectedResult, solution.kidsWithCandiesUsingStream(candies, extraCandies));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[]{2,3,5,1,3}, 3, List.of(true,true,true,false,true)},
                {new int[]{4,2,1,1,2}, 1, List.of(true,false,false,false,false)},
                {new int[]{12,1,12}, 10, List.of(true,false,true)},
        };
    }
}
