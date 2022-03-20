package range_sum_of_bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution;

    @BeforeEach
    void setUp() {
        solution = new Solution();
    }

    @Test
    public void rangeSumBSTTest1() {
        // 1st level
        TreeNode root = new TreeNode(10);

        // 2nd level
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        // 3rd level
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.right = new TreeNode(18);

        assertEquals(32, solution.rangeSumBST(root, 7, 15));
    }

    @Test
    public void rangeSumBSTTest2() {
        // 1st level
        TreeNode root = new TreeNode(10);

        // 2nd level
        root.left = new TreeNode(5);
        root.right = new TreeNode(15);

        // 3rd level
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(7);
        root.right.left = new TreeNode(13);
        root.right.right = new TreeNode(18);

        // 4nd level
        root.left.left.left = new TreeNode(1);
        root.left.right.left = new TreeNode(6);

        assertEquals(23, solution.rangeSumBST(root, 6, 10));
    }
}
