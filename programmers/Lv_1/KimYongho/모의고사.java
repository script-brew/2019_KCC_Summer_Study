class Solution {
    public int[] solution(int[] answers) {
        int[] answer = {};
        int one = 0; int two = 0; int three = 0;
        int [] count1 = {1,2,3,4,5};
        int [] count2 = {2,1,2,3,2,4,2,5};
        int [] count3 = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i < answers.length; i++){
            if(count1[i%count1.length] == answers[i]){
                one++;
            }
            if(count2[i%count2.length] == answers[i]){
                two++;
            }
            if(count3[i%count3.length] == answers[i]){
                three++;
            }
        }
        if(one == two && one == three && two == three){
            answer = new int[3];
            answer[0] = 1;
            answer[1] = 2;
            answer[2] = 3;
        }
        else if(one > two && one > three){
            answer = new int[1];
            answer[0] = 1;
        }
        else if(two > one && two > three){
            answer = new int[1];
            answer[0] = 2;
        }
        else if(three > one && three > two){
            answer = new int[1];
            answer[0] = 3;
        }
        else if(one == two && one > three && two > three){
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 2;
        }
        else if(three == one && three > two && one > two){
            answer = new int[2];
            answer[0] = 1;
            answer[1] = 3;
        }
        else if(two == three && two > one && three > one){
            answer = new int[2];
            answer[0] = 2;
            answer[1] = 3;
        }
        return answer;
    }
}
