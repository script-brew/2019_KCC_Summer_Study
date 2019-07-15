class Solution {
  public String solution(String s) {
      String answer = "";
      String array[] = s.split("");
      if(array.length % 2 == 0){
          answer += (array[(array.length/2) - 1] + array[array.length/2]);
      }
      else{
          answer += array[array.length/2];
      }
      return answer;
  }
}
