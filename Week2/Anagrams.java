package InterviewBitAssignments.Week2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/**
 * Created by akshaymathur on 12/7/17.
 */
public class Anagrams {

    public ArrayList<ArrayList<Integer>> anagrams(final List<String> a) {
        HashMap<String,ArrayList<Integer>> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> result = new ArrayList<>();
        for(int i=0;i<a.size();i++){
            String str = a.get(i);
            char arr[] = str.toCharArray();
            Arrays.sort(arr);
            String sortStr = new String(arr);

            if(map.containsKey(sortStr)){
                map.get(sortStr).add(i+1);
            }
            else{
                ArrayList<Integer> list = new ArrayList<>();
                list.add(i+1);
                map.put(sortStr,list);
            }
        }

        for(String s : map.keySet()){
            result.add(map.get(s));
        }
        return result;
    }
}
