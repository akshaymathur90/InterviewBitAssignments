package InterviewBitAssignments.Week3;

/**
 * Created by akshaymathur on 12/9/17.
 */
public class MaxDepthOfBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    public int maxDepth(TreeNode a) {

        if(a==null){
            return 0;
        }

        return Math.max(maxDepth(a.left),maxDepth(a.right))+1;
    }
}
