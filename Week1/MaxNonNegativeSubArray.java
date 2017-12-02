package InterviewBitAssignments.Week1;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 11/28/17.
 */
public class MaxNonNegativeSubArray {
    public ArrayList<Integer> maxset(ArrayList<Integer> a) {
        ArrayList<Integer> sub = new ArrayList<>();
        ArrayList<Integer> prevSub = new ArrayList<>();
        long sum =0;
        long max = 0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>=0){
                sub.add(a.get(i));
                sum +=a.get(i);
            }
            else {
                if(max<sum){
                    max = sum;
                    prevSub = new ArrayList<>(sub);
                }
                else if(max == sum && prevSub.size() < sub.size()){
                    prevSub = new ArrayList<>(sub);
                }
                else {
                    sum = 0;
                }
                sub = new ArrayList<>();
                sum =0;
            }

        }
        if(max<sum){
            prevSub = new ArrayList<>(sub);
        }
        else if(max == sum && prevSub.size() < sub.size()){
            prevSub = new ArrayList<>(sub);
        }

        return prevSub;
    }

    public static void main(String[] args) {
        MaxNonNegativeSubArray maxNonNegativeSubArray = new MaxNonNegativeSubArray();
        ArrayList<Integer> input = new ArrayList<>();
        input.add(756898537);input.add(-1973594324);input.add(-2038664370);input.add(-184803526);input.add(1424268980);
        System.out.println(maxNonNegativeSubArray.maxset(input));
    }
}
