package InterviewBitAssignments.Week6;

import java.util.Stack;

/**
 * Created by akshaymathur on 2/5/18.
 */
public class LongestValidParentheses {
    public int longestValidParentheses(String A) {
        Stack<Integer> stack = new Stack<Integer>();
        int max=0;
        int left = -1;
        for(int j=0;j<A.length();j++){
            if(A.charAt(j)=='(') stack.push(j);
            else {
                if (stack.isEmpty()) left=j;
                else{
                    stack.pop();
                    if(stack.isEmpty()) max=Math.max(max,j-left);
                    else max=Math.max(max,j-stack.peek());
                }
            }
        }
        return max;
    }
}
