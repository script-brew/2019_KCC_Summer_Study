import java.util.*;
class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue <Integer> q = new LinkedList<Integer>();
		for(int i = 0; i < progresses.length; i++) {
			int time = (100 - progresses[i])/speeds[i];
			q.offer(time);
		}
		Queue <Integer>q2 = new LinkedList<Integer>();
		while(!q.isEmpty()) {
			int count = 1;
			int big = q.poll();
			while(!q.isEmpty() && big >= q.peek()) {
				count++;
				q.poll();
			}
			q2.offer(count);
		}
		int [] answer = new int[q2.size()];
		int index = 0;
		while(!q2.isEmpty()) {
			answer[index++] = q2.poll();
		}
        return answer;
    }
}
