import java.util.*;
class Solution {
    public int[] solution(int[] answers) {
        List<Integer> ans = new LinkedList<>();
        int first = 0; int firstAns = 0;
        int second = 0; int[] secondAns = {1,3,4,5}; int index = 0;
        int third = 0;
        int[] thirdAns = {3,3,1,1,2,2,4,4,5,5};
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == (firstAns++ % 5) + 1) 
                first++;
            
            if(i % 2 == 0 && answers[i] == 2) {
                second++;
            } else if (i % 2 == 1 && answers[i] == secondAns[index++ % 4]) {
                second++;
            }
            if(answers[i] == thirdAns[i % 10])
                third++;
        }
        if(first > second) {
            if(first > third) ans.add(1);
            else if(first < third) ans.add(3);
            else if(first == third) {
                ans.add(1); ans.add(3);
            }
        } else if (first > third) {
            if(first < second) ans.add(2);
            else if (first > second) ans.add(1);
            else if(first == second) {
                ans.add(1); ans.add(2);
            }
        } else if(second > first) {
            if(second > third) ans.add(2);
            else if (second < third) ans.add(3);
            else if(second == third) {
                ans.add(2); ans.add(3);
            }
        } else if (second > third) {
            if(second > first) ans.add(2);
            else if (second < first) ans.add(1);
            else if (second == first) {
                ans.add(1); ans.add(2);
            }
        } else if (third > first) {
            if(third > second) ans.add(3);
            else if (third < second) ans.add(2);
            else if (third == second) {
                ans.add(2); ans.add(3);
            }
        } else if (third > second) {
            if(third > first) ans.add(3);
            else if (third < first) ans.add(1);
            else if (third == first) {
                ans.add(1); ans.add(3);
            }
        } else {
            ans.add(1); ans.add(2); ans.add(3);
        }
        int[] answer = new int[ans.size()];
        for(int i = 0; i < ans.size(); i++) {
            answer[i] = ans.get(i);
        }
        return answer;
    }
}