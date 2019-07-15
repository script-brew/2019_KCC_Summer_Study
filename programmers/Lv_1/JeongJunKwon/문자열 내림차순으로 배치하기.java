import java.util.*;

class Solution {
  public String solution(String s) {
      String answer = "";
      String[] pieces = new String[s.length()];
      for(int i = 0; i < s.length(); i++) {
          String piece = s.substring(i, i+1);
          pieces[i] = piece;
      }
      
      Arrays.sort(pieces);
      
      for(int i = s.length() - 1; i >= 0; i--) {
          answer += pieces[i];
      }
      
      return answer;
  }
}