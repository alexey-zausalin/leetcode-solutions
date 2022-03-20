package maximum_depth_of_binary_tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void test1() {
        Solution sut = new Solution();

        TreeNode root = new TreeNode(3);

        // 1st level
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);

        // 2nd level
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);

        assertEquals(3, sut.maxDepth(root));
    }

    @Test
    public void test2() {
        Solution sut = new Solution();

        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);

        assertEquals(2, sut.maxDepth(root));
    }
}
