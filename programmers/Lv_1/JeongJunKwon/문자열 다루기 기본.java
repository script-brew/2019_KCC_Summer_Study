class Solution {
  public boolean solution(String s) {
      if(!(s.length() == 4 || s.length() == 6))
          return false;
      for(int i = 0; i < s.length(); i++) {
          char c1 = s.charAt(i);
          if(!('0' <= c1 && c1 <= '9'))
              return false;
      }
      return true;
  }
}