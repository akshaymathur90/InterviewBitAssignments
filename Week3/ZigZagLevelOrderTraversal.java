package InterviewBitAssignments.Week3;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by akshaymathur on 12/8/17.
 */
public class ZigZagLevelOrderTraversal {
    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode a) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        if(a == null) return res;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(a);
        boolean order = true;
        int size = 1;

        while(!q.isEmpty()) {
            ArrayList<Integer> tmp = new ArrayList<>();
            for(int i = 0; i < size; ++i) {
                TreeNode n = q.poll();
                if(order) {
                    tmp.add(n.val);
                } else {
                    tmp.add(0, n.val);
                }
                if(n.left != null) q.add(n.left);
                if(n.right != null) q.add(n.right);
            }
            res.add(tmp);
            size = q.size();
            order = order ? false : true;
        }
        return res;
    }

}
