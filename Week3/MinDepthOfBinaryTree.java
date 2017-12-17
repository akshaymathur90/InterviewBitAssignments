package InterviewBitAssignments.Week3;

/**
 * Created by akshaymathur on 12/9/17.
 */
public class MinDepthOfBinaryTree {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }
    int min=Integer.MAX_VALUE;
    public int minDepth(TreeNode a) {
        if(a==null){
            return 0;
        }

        backtrack(a,1);
        return min;
    }

    private void backtrack(TreeNode a,int level){

        if(a==null){
            return;
        }
        if(a.left ==null && a.right == null){
            min = Math.min(level,min);
            return;
        }

        backtrack(a.left,level+1);
        backtrack(a.right,level+1);


    }
}
