import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 1;
        int max = nums.length / 2;
        Arrays.sort(nums);
        int num = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(answer >= max) break;
            if(num == nums[i]) continue;
            answer++;
            num = nums[i];
        }
        return answer;
    }
}