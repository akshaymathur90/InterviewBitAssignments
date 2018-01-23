package InterviewBitAssignments.Week4;

import java.util.ArrayList;

/**
 * Created by akshaymathur on 1/17/18.
 */
public class GenerateAllParentheses {
    public ArrayList<String> generateParenthesis(int A) {
        ArrayList<String> result = new ArrayList<>();

        makeStrings(A,A,new char[A*2],result,0);

        return result;
    }

    public void makeStrings(int left, int right, char[] str, ArrayList<String> result,int pos){

        if(left==0 && right==0){
            result.add(String.copyValueOf(str));
            return;
        }
        else {

            if (left > 0) {
                str[pos] = '(';
                makeStrings(left - 1, right, str, result,pos+1);
            }

            if (right > left) {
                str[pos] = ')';
                makeStrings(left, right - 1, str, result,pos+1);
            }


        }
    }

    public static void main(String[] args) {
        GenerateAllParentheses generateAllParentheses = new GenerateAllParentheses();
        System.out.println(generateAllParentheses.generateParenthesis(3).toString());
    }
}
