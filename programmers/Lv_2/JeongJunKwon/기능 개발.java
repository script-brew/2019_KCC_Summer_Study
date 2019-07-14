import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> launchs = new LinkedList<>();
        List<Integer> days = new ArrayList<>();
        
        for(int i = 0; i < progresses.length; i++) {
            int day = (100 - progresses[i]) / speeds[i];
            int mod = (100 - progresses[i]) % speeds[i];
            if(mod == 0)
                launchs.offer(day);
            else
                launchs.offer(day + 1);
        }
        while(!launchs.isEmpty()) {
            int day = 1;
            int launch = launchs.poll();
            while(!launchs.isEmpty() && launch >= launchs.peek()) {
                day++;
                launchs.poll();
            }
            days.add(day);
        }
        int[] answer = new int[days.size()];
        for(int i = 0; i < days.size(); i++)
            answer[i] = days.get(i);
        
        return answer;
    }
}