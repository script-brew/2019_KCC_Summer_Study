class Solution {
  public boolean solution(int x) {
      int hashad = 0;
      int index = x;
      while(index > 0) {
          hashad += index % 10;
          index /= 10;
      }
      if(x % hashad == 0) {
          return true;
      } else {
          return false;
      }
  }
}