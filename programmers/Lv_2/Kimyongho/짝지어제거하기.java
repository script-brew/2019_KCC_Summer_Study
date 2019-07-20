import java.util.*;
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack<Character>();
        stack.push(s.charAt(0));
		for(int i = 1; i < s.length(); i++) {
			char c = s.charAt(i);
			if(stack.empty()) {
				stack.push(c);
			}
			else {
				if(!(stack.peek() == s.charAt(i))) {
					stack.push(c);
				}
				else {
					stack.pop();
				}
			}
		}
		if(stack.empty()) {
			return 1;
		}
        return answer;
    }
}
