import java.util.*;

public class Solution {
	public int[] solution(int []arr) {
        int index = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                index++;
            }
        }
        int[] answer = new int[index+1];
        int index2 = 0;
        for(int i = 1; i < arr.length; i++){
            if(arr[i-1] != arr[i]){
                answer[index2++] = arr[i-1];
            }
        }
        answer[index2] = arr[arr.length-1];
        return answer;
	}
}
