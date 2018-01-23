package InterviewBitAssignments.Week4;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 1/20/18.
 */
public class Sudoku {
    public void solveSudoku(ArrayList<ArrayList<Character>> a) {
        if(a == null || a.size() == 0 )
            return;
        solve(a);
    }

    public boolean solve(ArrayList<ArrayList<Character>> a){
        for(int i = 0; i < a.size(); i++){
            for(int j = 0; j < a.get(0).size(); j++){
                if(a.get(i).get(j) == '.'){
                    for(char c = '1'; c <= '9'; c++){//trial. Try 1 through 9
                        if(isValid(a, i, j, c)){
                            a.get(i).set(j,c);

                            if(solve(a))
                                return true; //If it's the solution return true
                            else
                                a.get(i).set(j,'.');
                        }
                    }

                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValid(ArrayList<ArrayList<Character>> a, int row, int col, char c){
        for(int i = 0; i < 9; i++) {
            //if(board[i][col] != '.' && board[i][col] == c) return false; //check row
            if(a.get(i).get(col)!= '.' && a.get(i).get(col) == c) return false;
            //if(board[row][i] != '.' && board[row][i] == c) return false; //check column
            if(a.get(row).get(i) != '.' && a.get(row).get(i) == c) return false;
            /*if(board[3 * (row / 3) + i / 3][ 3 * (col / 3) + i % 3] != '.' &&
                    board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false;*/ //check 3*3 block
            if(a.get(3 * (row / 3) + i / 3).get(3 * (col / 3) + i % 3) != '.' &&
                    a.get(3 * (row / 3) + i / 3).get(3 * (col / 3) + i % 3) == c) return false;
        }
        return true;
    }
}
