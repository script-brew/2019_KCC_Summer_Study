class Solution {
    boolean solution(String s) {
        boolean answer = true;
        int p = 0;
        int y = 0;
        String array[] = s.split("");
        for(int i = 0; i < array.length; i++){
            if(array[i].equals("p") || array[i].equals("P")){
                p++;
            }
            else if(array[i].equals("y") || array[i].equals("Y")){
                y++;
            }
        }
        if(p != y){
            answer = false;
        }
        return answer;
    }
}
