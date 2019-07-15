class Solution {
  public int solution(String s) {
      int answer = 0;
      boolean isPlus = true;
      for(int i = 0; i < s.length(); i++) {
          char c1 = s.charAt(i);
          if(c1 == '+')
              continue;
          if(c1 == '-') {
              isPlus = false;
              continue;
          }
          int num = c1 - '0';
          answer = answer * 10 + num;
      }
      
      if(!isPlus)
          answer = -answer;
      return answer;
  }
}