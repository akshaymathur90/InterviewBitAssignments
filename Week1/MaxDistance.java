package InterviewBitAssignments.Week1;

import java.util.List;

/**
 * Created by akshaymathur on 11/27/17.
 */
public class MaxDistance {
    public int maximumGap(final List<Integer> a) {
        /*int max=0;
        int v=0;
        for(int i=0;i<a.size()-1;i++){
            for(int j = a.size()-1;j>i;j--){
                if(a.get(i)<=a.get(j)){
                    v = j-i;
                    if(v>max){
                        max = v;
                    }
                }
            }
        }
        if (max==0){
            return -1;
        }
        return max;*/

        /*HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<a.size();i++){
            map.put(a.get(i),i);
        }

        Integer[] arr = a.toArray(new Integer[0]);
        Arrays.sort(arr);
        int max=0;
        for(int i=0;i<arr.length;i++){
            int s = a.get(i);
            int x = Arrays.binarySearch(arr,s);
            for(int j=x+1;j<arr.length;j++){
                if(map.get(arr[j])-i>max){
                    max = map.get(arr[j])-i;
                }
            }
        }
        return max;*/

        int max = a.size()-1;
        int start =0;
        int end = a.size()-1;

        while(max>0) {
            for (int i = start; i + max < a.size(); i++) {
                if (a.get(i) <= a.get(i + max)) {
                    return max;
                }
            }
            max--;
        }
        return max-1;
    }
}
