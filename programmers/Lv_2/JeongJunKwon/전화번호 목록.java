import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        Arrays.sort(phone_book);
        for(int i = 0; i < phone_book.length - 1; i++) {
            String phone1 = phone_book[i];
            String phone2 = null;
            for(int j = i + 1; j < phone_book.length; j++) {
                if(phone1.length() <= phone_book[j].length())
                    phone2 = phone_book[j].substring(0, phone1.length());
                else
                    phone2 = phone1.substring(0, phone_book[j].length());
                if(phone2.equals(phone1))
                    return false;
            }
        }
        return true;
    }
}