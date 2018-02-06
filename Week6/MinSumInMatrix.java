package InterviewBitAssignments.Week6;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 2/5/18.
 */
public class MinSumInMatrix {

    public int minPathSum(ArrayList<ArrayList<Integer>> A) {
        int m = A.size();// row
        int n = A.get(0).size(); // column
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j != 0) {
                    A.get(i).set(j, A.get(i).get(j) + A.get(i).get(j - 1));
                } else if (i != 0 && j == 0) {
                    A.get(i).set(j, A.get(i).get(j) + A.get(i - 1).get(j));
                } else if (i == 0 && j == 0) {
                    A.get(i).set(j, A.get(i).get(j));
                } else {
                    A.get(i).set(j, Math.min(A.get(i).get(j - 1), A.get(i - 1).get(j)) + A.get(i).get(j));
                }
            }
        }

        return A.get(m - 1).get(n - 1);
    }
}
