import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Arrays.sort(nums);
		for(int i = 0 ; i < nums.length; i++) {
			for(int j = i+1; j < nums.length; j++) {
				for(int k = j+1; k < nums.length; k++) {
					int num = nums[i] + nums[j] + nums[k];
					boolean bool = true;
					for(int z = 2; z < num; z++) {
						if(num%z == 0) {
							bool = false;
						}
					}
					if(bool == true) {
						answer++;
					}
				}
			}
		}
        return answer;
    }
}
