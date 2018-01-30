package InterviewBitAssignments.Week5;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 1/29/18.
 */
public class CaptureRegionOnBoard {
    public void solve(ArrayList<ArrayList<Character>> a) {

        int rows = a.size();
        int colums = a.get(0).size();
        for(int i=0;i<rows;i++){

            if(a.get(i).get(colums-1) == 'O'){
                traverse(i,colums-1,a,rows,colums);
            }
            if(a.get(i).get(0) == 'O'){
                traverse(i,0,a,rows,colums);
            }

        }

        for(int i=0;i<colums;i++){

            if(a.get(0).get(i) == 'O'){
                traverse(0,i,a,rows,colums);

            }
            if(a.get(rows-1).get(i) == 'O'){
                traverse(rows-1,i,a,rows,colums);
            }

        }



        for(int i=0;i<rows;i++){
            for (int j = 0; j<colums;j++) {
                if(a.get(i).get(j) == 'O'){
                    a.get(i).set(j, 'X');
                }
            }
        }
        for(int i=0;i<rows;i++){
            for (int j = 0; j<colums;j++) {
                if(a.get(i).get(j) == 'W'){
                    a.get(i).set(j, 'O');
                }
            }
        }
    }

    private void traverse(int x, int y, ArrayList<ArrayList<Character>> a, int rows, int cols) {
        if (x < 0 || x >= rows || y < 0 || y >= cols) {
            return;
        }
        if (a.get(x).get(y) == 'O') {
            a.get(x).set(y, 'W');

            traverse(x-1, y, a,rows,cols);
            traverse(x+1, y, a,rows,cols);
            traverse(x, y-1, a,rows,cols);
            traverse(x, y+1, a,rows,cols);
        }
    }
}
