package InterviewBitAssignments.Week1;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 11/29/17.
 */
public class RotateMatrix {
    public void rotate(ArrayList<ArrayList<Integer>> a) {
        int t;
        for(int i=0;i<a.size();i++){
            for(int j=i;j<a.get(i).size();j++){
                t  = a.get(i).get(j);
                a.get(i).set(j,a.get(j).get(i));
                a.get(j).set(i,t);
            }
        }

        for(int i=0;i<a.size();i++){
            for(int j=0;j<a.get(i).size()/2;j++){
                t  = a.get(i).get(j);
                a.get(i).set(j,a.get(i).get(a.size()-1-j));
                a.get(i).set(a.size()-1-j,t);
            }
        }
    }
}
