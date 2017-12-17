package InterviewBitAssignments.Week3;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 12/13/17.
 */
public class InOrderTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public ArrayList<Integer> inorderTraversal(TreeNode a) {

        ArrayList<Integer> result = new ArrayList<>();
        traversal(a,result);
        return result;


    }

    public void traversal(TreeNode a, ArrayList<Integer> result){

        if(a==null){
            return;
        }
        traversal(a.left, result);
        result.add(a.val);
        traversal(a.right,result);
    }
}
