import java.util.*;
class Solution
{
    public int solution(int []A, int []B)
    {
        int answer = 0;
        int n1 [] = A;
        int n2 [] = B;
        int n3 [] = new int [n2.length];
        
        Arrays.sort(n1);
        Arrays.sort(n2);
        for(int i = 0; i < n3.length; i++){
            n3[i] = n2[n2.length - 1 - i];
        }
        
        for(int i = 0; i < n1.length; i++){
            answer += (n1[i] * n3[i]);
        }
        
        return answer;
    }
}
