package InterviewBitAssignments.Week5;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 1/29/18.
 */
public class WordSearchBoard {
    boolean result = false;
    public int exist(ArrayList<String> A, String B) {
        int[] xMoves = {1,0,-1,0};
        int[] yMoves = {0,1,0,-1};
        int rows = A.size();
        int cols = A.get(0).length();
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                if(B.charAt(0)==A.get(i).charAt(j)){
                    if(backtrack(A,B,i,j,xMoves,yMoves,0)){
                        return 1;
                    }

                }

            }
        }

        return 0;
    }

    public boolean backtrack(ArrayList<String> A, String word, int i , int j, int[] xMoves, int[] yMoves, int p){


        if(p<word.length() && word.charAt(p)==A.get(i).charAt(j)){
            if(p== word.length()-1){
                result = true;
                return result;
            }
            for(int k=0;k<xMoves.length;k++){
                int xStep = i+xMoves[k];
                int yStep = j+yMoves[k];
                if(isValidPoint(A,xStep,yStep)){
                    if(backtrack(A,word,xStep,yStep,xMoves,yMoves,p+1)){
                        return true;
                    }

                }
            }
        }

        return false;

    }

    public boolean isValidPoint(ArrayList<String> A, int x, int y){
        int rows = A.size();
        int cols = A.get(0).length();
        if(x>=0 && x<rows && y>=0 && y<cols){
            return true;
        }
        return false;
    }
}
