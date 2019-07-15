class Solution {
  public String solution(int n) {
      String answer = "";
      while(n > 0) {
          int mod = n % 3;
          switch(mod) {
              case 0:
                  answer = "4" + answer;
                  n -= 3;
                  break;
              case 1:
                  answer = "1" + answer;
                  n -= 1;
                  break;
              case 2:
                  answer = "2" + answer;
                  n -= 2;
                  break;
          }
          n /= 3;        
          }
      return answer;
  }
}