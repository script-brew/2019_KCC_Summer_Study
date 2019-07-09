import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0; i < scoville.length; i++) {
            queue.offer(scoville[i]);
        }
        
        while(queue.peek() < K) {
            if(queue.size() == 1) return -1;
            int sc = queue.poll() + queue.poll() * 2;
            queue.offer(sc);
            answer++;
        }
        
        return answer;
    }
}