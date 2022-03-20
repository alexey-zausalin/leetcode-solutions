package defanging_an_ip_address;

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
    public void defangIPaddrTest(String address, String expectedResult) {
        assertEquals(expectedResult, solution.defangIPaddr(address));
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {"1.1.1.1", "1[.]1[.]1[.]1"},
                {"255.100.50.0", "255[.]100[.]50[.]0"}
        };
    }
}
