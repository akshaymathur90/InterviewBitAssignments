package InterviewBitAssignments.Week3;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 12/14/17.
 */
public class PaintersPartition {

    public int paint(int k, int t, ArrayList<Integer> c) {

        int max = 0;
        for(int i =0;i<c.size();i++)
        {
            max +=(int)(((long)c.get(i))%10000003);
            max = max%10000003;
        }
        int begin = 0, end = max;
        while(begin<end) {
            int mid = (begin + end) / 2;
            //System.out.println(begin + " -" + mid +"- " + end + " " + isPossible(k,mid,c) );
            if(isPossible(k,mid,c))
                end = mid;
            else
                begin = mid + 1;
        }
        return  (int)(((long)end*t)%10000003);
    }

    private boolean isPossible(int k, int averageTime, ArrayList<Integer> c)
    {
        int painterCount =1;
        int currentTime = 0;
        for(int i = 0;i<c.size();i++)
        {
            currentTime += c.get(i);
            if(currentTime >averageTime) {
                painterCount+=1;
                currentTime = c.get(i);
                if(currentTime>averageTime || painterCount>k) return false;
            }
        }
        return true;
    }
}
