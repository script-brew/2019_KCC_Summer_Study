import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int index = 0;
        int max = 0;
        Arrays.sort(citations);
        
        for(int i = 0; i < citations.length;) {
            if(index > citations[i]) {
                i++;
                continue;
            }
            
            answer = citations.length - i;
            
            if(answer >= index && i <= index)
                max = index;
            index++;
        }
        return max;
    }
}