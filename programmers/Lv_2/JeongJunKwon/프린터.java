import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
		Queue<Integer> pri = new LinkedList<>();
		for (int i = 0; i < priorities.length; i++) {
			pri.offer(priorities[i]);
		}
		int index = 0;
		boolean isBig = false;

		while (!pri.isEmpty()) {
			int docu = pri.poll();
			Iterator<Integer> iter = pri.iterator();
			isBig = true;
			while (iter.hasNext()) {
				if (docu < iter.next()) {
					if (location == index)
						location += pri.size() + 1;
					pri.offer(docu);
					isBig = false;
					break;
				}
            }
            if(isBig) {
                answer++;
                if(index == location) {
                    return answer;
                }
            }
			index++;
		}
		return answer;
    }
}