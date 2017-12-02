package InterviewBitAssignments.Week1;

/**
 * Created by akshaymathur on 11/29/17.
 */
public class MinimumNumOfCharsRequiredToMakeStringPalindromic {



    public int solve(String A) {

        for(int i=A.length();i>0;i--){
            if(isPalindrome(A.substring(0,i))){
                return A.length()-i;
            }
        }
        return 0;
    }

    private boolean isPalindrome(String a){
        int i=0;
        int j=a.length()-1;
        while(i<=j){
            if(a.charAt(i)==a.charAt(j)){
                i++;
                j--;
            }
            else return false;
        }
        return true;
    }

}
