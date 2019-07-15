import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        Map<String, Integer> clothset = new LinkedHashMap<>();
        for(int i = 0; i < clothes.length; i++) {
            if(clothset.get(clothes[i][1]) == null)
                clothset.put(clothes[i][1], 1);
            else
                clothset.put(clothes[i][1], clothset.get(clothes[i][1]) + 1);
        }

        Collection<Integer> combi = clothset.values();
        Iterator<Integer> iter = combi.iterator();
        
        while(iter.hasNext()) {
            answer *= (iter.next() + 1);
        }
        return answer - 1;
    }
}