class Solution {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book.length; j++){
                String str = phone_book[j].substring(1);
                if(i == j || str.contains(phone_book[i])){
                    continue;
                }
                if(phone_book[j].contains(phone_book[i])){
                    return false;
                }
            }
        }
        return answer;
    }
}
