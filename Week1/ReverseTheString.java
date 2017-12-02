package InterviewBitAssignments.Week1;

/**
 * Created by akshaymathur on 11/29/17.
 */
public class ReverseTheString {

    public String reverseWords(String a) {
        String words[] = a.split(" ");
        if(words.length<=1){
            return a;
        }
        StringBuilder builder = new StringBuilder();
        for(int i=words.length -1;i>=0;i--){
            builder.append(words[i]);
            builder.append(" ");
        }

        String rev = builder.toString();
        return rev.trim();
    }

}
