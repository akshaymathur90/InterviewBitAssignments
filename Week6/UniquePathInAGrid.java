package InterviewBitAssignments.Week6;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 2/5/18.
 */
public class UniquePathInAGrid {
    public int uniquePathsWithObstacles(ArrayList<ArrayList<Integer>> A) {
        int[][] obstacleGrid = new int[A.size()][A.get(0).size()];
        for(int i=0;i<A.size();i++){
            for(int j=0;j<A.get(0).size();j++){
                obstacleGrid[i][j] = A.get(i).get(j);
            }
        }

        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;

        if(obstacleGrid[m-1][n-1]==1 || obstacleGrid[0][0]==1){
            return 0;
        }
        int dp[][] = new int[m][n];
        for(int i=n-1;i>=0;i--){
            if(isObstacle(obstacleGrid,m-1,i)){
                break;
            }
            dp[m-1][i]=1;
        }
        for(int i=m-1;i>=0;i--){
            if(isObstacle(obstacleGrid,i,n-1)){
                break;
            }
            dp[i][n-1]=1;
        }
        //printgrid(dp);
        for(int i=m-2;i>=0;i--){
            for(int j=n-2;j>=0;j--){

                int tmp=0;
                if(!isObstacle(obstacleGrid,i,j)){


                    if(!isObstacle(obstacleGrid,i+1,j)){
                        tmp = tmp + dp[i+1][j];
                    }
                    if(!isObstacle(obstacleGrid,i,j+1)){
                        tmp = tmp + dp[i][j+1];
                    }
                }
                dp[i][j] = tmp;
            }
        }
        //printgrid(dp);
        return dp[0][0];
    }

    public boolean isObstacle(int [][]obstacleGrid,int i ,int j){
        if(obstacleGrid[i][j] == 1){
            return true;
        }
        return false;
    }
}
