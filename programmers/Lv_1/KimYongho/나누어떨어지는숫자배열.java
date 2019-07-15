import java.util.Arrays;
class Solution {
  public int[] solution(int[] arr, int divisor) {
      int n = 0;
      for(int i = 0; i < arr.length; i++){
          if(arr[i]%divisor == 0){
              n++;
          }
      }
      int index = 0;
      if(n == 0){
          int[] answer = new int[1];
          answer[0] = -1;
          return answer;
      }
      int[] answer = new int[n];
      for(int i = 0; i < arr.length; i++){
          if(arr[i]%divisor == 0){
              answer[index++] = arr[i];
          }   
      }
      Arrays.sort(answer);
      return answer;
  }
}
