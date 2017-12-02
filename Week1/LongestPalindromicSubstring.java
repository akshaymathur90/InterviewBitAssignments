package InterviewBitAssignments.Week1;

/**
 * Created by akshaymathur on 11/29/17.
 */
public class LongestPalindromicSubstring {
    private int lo, maxLen;

    public String longestPalindrome(String a) {
        int len = a.length();
        if (len < 2)
            return a;

        for (int i = 0; i < len-1; i++) {
            extendPalindrome(a, i, i);  //assume odd length, try to extend Palindrome as possible
            extendPalindrome(a, i, i+1); //assume even length.
        }
        return a.substring(lo, lo + maxLen);
    }

    private void extendPalindrome(String s, int j, int k) {
        while (j >= 0 && k < s.length() && s.charAt(j) == s.charAt(k)) {
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            lo = j + 1;
            maxLen = k - j - 1;
        }
    }
}
