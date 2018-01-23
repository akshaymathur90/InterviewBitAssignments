package InterviewBitAssignments.Week4;

/**
 * Created by akshaymathur on 1/21/18.
 */
public class ReverseBits {
    public long reverse(long A) {
        long rev = 0;
        for (int i = 0; i < 32; i++) {
            rev = rev << 1;
            if ((A & (1 << i)) != 0)
                rev |= 1;
        }
        return rev;
    }

}
