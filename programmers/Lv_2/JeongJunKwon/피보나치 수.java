class Solution {
  public int solution(int n) {
      int answer = 0;
      int index1 = 0;
      int index2 = 1;
      while(n-- > 1) {
          answer = index1 + index2;
          index1 = index2 % 1234567;
          index2 = answer % 1234567;
      }
      return answer % 1234567;
  }
}