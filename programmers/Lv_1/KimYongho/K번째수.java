import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++){
            int [] sort_array = new int[commands[i][1] - commands[i][0]+2];
            int index = 0;
            for(int j = commands[i][0] - 1; j <= commands[i][1] - 1; j++){
                sort_array[index++] = array[j];
            }
            Arrays.sort(sort_array);
            answer[i] = sort_array[commands[i][2]];
        }
        return answer;
    }
}
