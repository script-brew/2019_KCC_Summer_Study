import java.util.*;

class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        Arrays.fill(answer, 0);
        for(int i = 0; i < prices.length - 1; i++) {
            int price = prices[i];
            for(int j = i + 1; j < prices.length; j++) {
                if(price > prices[j]) {
                    answer[i] = j - i;
                    break;
                 } else
                    answer[i] = prices.length - (i + 1);
            }
        }
        return answer;
    }
}