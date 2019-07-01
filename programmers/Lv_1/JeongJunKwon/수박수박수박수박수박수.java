class Solution {
  public String solution(int n) {
      String answer = "";
      while(n > 1) {
          answer += "¼ö¹Ú";
          n -= 2;
      }
      if(n == 1)
          answer += "¼ö";
      
      return answer;
  }
}