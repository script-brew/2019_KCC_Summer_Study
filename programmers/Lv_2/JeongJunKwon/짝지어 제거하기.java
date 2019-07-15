import java.util.*;

class Solution {
    public int solution(String s) {
        Stack<Character> set = new Stack<>();
        
        for(int i = 0; i < s.length(); i++) {
            char s1 = s.charAt(i);
            if(set.isEmpty() || set.peek() != s1)
                set.push(s1);
            else
                set.pop();
        }
        
        if(set.isEmpty())
            return 1;
        else
            return 0;
    }
}