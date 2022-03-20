package range_sum_of_bst;

import java.util.Objects;

public class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        Objects.requireNonNull(root);

        int val = 0;
        if (root.val >= low && root.val <= high) {
            val = root.val;
        }

        if (root.left != null && root.val >= low) {
            val += rangeSumBST(root.left, low, high);
        }

        if (root.right != null && root.val <= high) {
            val += rangeSumBST(root.right, low, high);
        }

        return val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
