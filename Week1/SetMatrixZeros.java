package InterviewBitAssignments.Week1;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 11/28/17.
 */
public class SetMatrixZeros {
    public void setZeroes(ArrayList<ArrayList<Integer>> a) {
        //does first row contain 0
        boolean fRow = false;
        for(int i=0;i<a.get(0).size();i++){
            if(a.get(0).get(i)==0){
                fRow=true;
                break;
            }
        }
        //does first column contain 0
        boolean fCol = false;
        for(int i=0;i<a.size();i++){
            if(a.get(i).get(0)==0){
                fCol=true;
                break;
            }
        }


        for(int i = 1;i<a.size();i++){
            for(int j = 1;j<a.get(i).size();j++){
                if(a.get(i).get(j)==0){
                    a.get(i).set(0,0);
                    a.get(0).set(j,0);
                }
            }
        }

        for(int i =1;i<a.size();i++){
            if(a.get(i).get(0)==0){
                for(int j=1;j<a.get(i).size();j++){
                    a.get(i).set(j,0);
                }
            }
        }

        for(int i =1;i<a.get(0).size();i++){
            if(a.get(0).get(i)==0){
                for(int j=1;j<a.size();j++){
                    a.get(j).set(i,0);
                }
            }
        }

        if(fRow){
            for(int i=0;i<a.get(0).size();i++){
                a.get(0).set(i,0);
            }
        }
        if(fCol){
            for(int i=0;i<a.size();i++){
                a.get(i).set(0,0);
            }
        }


        //loop over the matrix and set 0 at the beginning of col and row if the col contains 0
        //
    }
}
