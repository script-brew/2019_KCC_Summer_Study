class Solution {
  public String solution(int n) {
      String answer = "";
      while(n > 1) {
          answer += "����";
          n -= 2;
      }
      if(n == 1)
          answer += "��";
      
      return answer;
  }
}