class Solution {
  public int solution(int n) {
      int answer = 0;
      int count = 1;
      int f1 = 0;
      int f2 = 1;
      while(count < n){
          answer = f1 + f2;
          answer %= 1234567;
          f1 = f2;
          f2 = answer;
          count++;
      }
      return answer%1234567;
  }
}
