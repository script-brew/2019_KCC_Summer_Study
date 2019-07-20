class Solution {
  public int solution(int n) {
      int answer = 0;
      int number = n;
      int number2 = n;
      int count1 = 0;
      int count2 = 0;
      while(number != 0){
          if(number%2 == 1){
              count1++;
          }
          number /= 2;
      }
      
      for(int i = number2 + 1; count1 != count2; i++){
          count2 = 0;
          int number3 = i;
          while(number3 != 0){
              if(number3%2 == 1){
                  count2++;
              }
              number3 /= 2;
          }
          answer = i;
      }
      return answer;
  }
}
