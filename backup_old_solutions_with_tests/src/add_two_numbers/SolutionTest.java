package add_two_numbers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @ParameterizedTest
    @MethodSource("testDataProvider")
    public void addTwoNumbersTest(int[] data1, int[] data2, int[] expectedResult) {
        Solution.ListNode l1 = Solution.ListNode.fromArray(data1);
        Solution.ListNode l2 = Solution.ListNode.fromArray(data2);

        assertEqualsListNode(Solution.ListNode.fromArray(expectedResult), solution.addTwoNumbers(l1, l2));
    }

    private void assertEqualsListNode(Solution.ListNode l1, Solution.ListNode l2) {
        while (l1 != null && l2 != null) {
            assertEquals(l1.val, l2.val);

            l1 = l1.next;
            l2 = l2.next;
        }

        assertNull(l1);
        assertNull(l2);
    }

    public static Object[][] testDataProvider() {
        return new Object[][]{
                {new int[]{2, 4, 3}, new int[]{5, 6, 4}, new int[]{7, 0, 8}},
                {new int[]{0}, new int[]{0}, new int[]{0}},
                {new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9}, new int[]{8, 9, 9, 9, 0, 0, 0, 1}},
        };
    }
}
