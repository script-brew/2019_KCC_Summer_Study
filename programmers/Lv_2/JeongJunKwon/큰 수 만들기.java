class Solution {
    public String solution(String number, int k) {
        StringBuilder ans = new StringBuilder();
		int limit = k+1;
		int check = 0;
		while (k++ < number.length()) {
			char num = '0';
			for (int i = check; i < limit; i++) {
				if (num < number.charAt(i)) {
					num = number.charAt(i);
					check = i + 1;
				}
			}

			ans.append(String.valueOf(num));
			limit++;
		}
        
		return ans.toString();
    }
}