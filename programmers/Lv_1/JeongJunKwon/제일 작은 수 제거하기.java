import java.util.*;

class Solution {
  public int[] solution(int[] arr) {
      int small = arr[0];
      int index = 0;
      for(int i = 1; i < arr.length; i++) {
          if(small > arr[i]) {
              small = arr[i];
              index = i;
          }
      }
      if(arr.length == 1) {
          int[] answer = new int[] {-1};
          return answer;
      }
      int answerIndex = 0;
      int[] answer = new int[arr.length -1];
      for(int i = 0; i < arr.length; i++) {
          if(i == index) continue;
          answer[answerIndex] = arr[i];
          answerIndex++;
      }
      
      return answer;
  }
}