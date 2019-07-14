class Solution {
  public int solution(int n) {
      int answer = 0;
      int total = 0;
      for(int i = 1; i <= n; i++) {
          int index = i;
          while(true) {
              total += index++;
              if(total == n) {
                  answer++;
                  total = 0;
                  break;
              } else if (total > n) {
                  total = 0;
                  break;
              }
          }
      }
      return answer;
  }
}