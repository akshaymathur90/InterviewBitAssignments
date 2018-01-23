package InterviewBitAssignments.Week4;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by akshaymathur on 1/20/18.
 */
public class MinXORValue {
    public int findMinXor(ArrayList<Integer> A) {

        Collections.sort(A);
        int min = Integer.MAX_VALUE;
        for(int i=0;i<A.size()-1;i++){
            int t = A.get(i) ^ A.get(i+1);
            min = Math.min(min,t);
        }

        return min;
    }
}
