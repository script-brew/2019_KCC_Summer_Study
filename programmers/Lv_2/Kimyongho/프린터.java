class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        while(priorities[location] != 0) {
			boolean print = true;
			for(int j = 0; j < priorities.length; j++) {
				if(priorities[0] < priorities[j]) {
					int tmp = priorities[0];
					for(int k = 1; k < priorities.length; k++) {
						priorities[k-1] = priorities[k];
					}
					priorities[priorities.length - 1] = tmp;
					location -= 1;
					if(location < 0) {
						location = priorities.length - 1;
					}
					print = false;
					break;
				}
			}
			if(print == true) {
				answer++;
				for(int i = 1; i < priorities.length; i++) {
					priorities[i-1] = priorities[i];
				}
				priorities[priorities.length - 1] = 0;
				location -= 1;
				if(location < 0) {
					location = priorities.length - 1;
				}
			}
		}
        return answer;
    }
}
