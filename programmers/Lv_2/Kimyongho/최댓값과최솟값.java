class Solution {
  public String solution(String s) {
      String answer = "";
      String str[] = s.split(" ");
      int array[] = new int[str.length];
      for(int i = 0; i < str.length; i++){
          array[i] = Integer.parseInt(str[i]);
      }
      int min = array[0];
      for(int i = 1; i < array.length; i++){
          if(min > array[i]){
              min = array[i];
          }
      }
      int max = array[0];
      for(int i = 1; i < array.length; i++){
          if(max < array[i]){
              max = array[i];
          }
      }
      answer = Integer.toString(min) + " " + Integer.toString(max);
      return answer;
  }
}
