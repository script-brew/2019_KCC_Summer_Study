import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int[] clas = new int[n];
        Arrays.fill(clas,1);
        int lostNum = 0;
        
        for(int i = 0; i < reserve.length; i++) {
            clas[reserve[i] - 1] += 1;
        }
        
        for(int i = 0; i < lost.length; i++) {
            clas[lost[i] - 1] -= 1;
            if(clas[lost[i] - 1] == 0)
                lostNum += 1;
        }
        
        for(int i = 0; i < clas.length; i++) {
            if(clas[i] == 0) {
                if(i != 0 && clas[i - 1] == 2) {
                    clas[i] += 1; 
                    clas[i -1] -= 1;
                    lostNum -= 1;
                } else if (i != clas.length - 1 && clas[i + 1] == 2) {
                    clas[i] += 1;
                    clas[i + 1] -= 1;
                    lostNum -=1;
                }
            }
        }
        
        int answer = n - lostNum;
        return answer;
    }
}