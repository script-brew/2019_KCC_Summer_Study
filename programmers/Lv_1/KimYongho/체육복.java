class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n-lost.length;
        
        for(int i =0; i<reserve.length; i++){
            for(int j =0; j<lost.length; j++){
                if(lost[j]==-1 && reserve[i]==-1){
                    continue;
                }
                if(lost[j]==reserve[i]){
                    lost[j]=-1;
                    reserve[i]=-1;
                    answer++;
                }
            }
        }
        for(int i =0; i<lost.length; i++){
            for(int j =0; j<reserve.length; j++){
                if(lost[i]==-1 || reserve[j]==-1){
                    continue;
                }
                if(Math.abs(lost[i]-reserve[j])==1){
                    answer++;
                    reserve[j]=-1;
                    break;
                }
            }
        }
        return answer;
    }
}
