class Solution {
  public String solution(String s) {
      String array1 [] = s.split(" ");
      for(int i = 0; i < array1.length; i++){
          String array2 [] = array1[i].split("");
          String result = "";
          for(int j = 0; j < array2.length; j++){
              if(j == 0){
                  result += array2[0].toUpperCase();
              }
              else{
                  result += array2[j].toLowerCase();
              }
          }
          array1[i] = result;
      }
      String answer = "";
      answer = String.join(" ", array1);
      if(s.length() != answer.length()){
          answer += " ";
      }
      return answer;
  }
}
