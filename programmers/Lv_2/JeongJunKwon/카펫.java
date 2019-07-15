class Solution {
    public int[] solution(int brown, int red) {
        int[] answer = new int[2];
        int width = 0;
        int height = 0;
        int total = 0;
        while(total != brown) {
            height++;
            if(red % height != 0)
                continue;
            width = (red / height);
            total = width * 2 + height * 2 + 4;
        }
        
        answer[0] = width + 2;
        answer[1] = height + 2;
        return answer;
    }
}