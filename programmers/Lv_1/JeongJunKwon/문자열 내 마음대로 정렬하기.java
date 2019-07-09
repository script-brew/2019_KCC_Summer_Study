class Solution {
  public String[] solution(String[] strings, int n) {
		String[] answer = new String[strings.length];
		int compareNum;
		int equalNum;
		String tmp;
		for(int i = 0; i < strings.length; i++) {
			for(int j = i + 1; j < strings.length; j++) {
                char c1 = strings[i].charAt(n);
				char c2 = strings[j].charAt(n);
				compareNum = c1 - c2;
				
				if(compareNum > 0) {
					tmp = strings[i];
					strings[i] = strings[j];
					strings[j] = tmp;
				} else if (compareNum == 0) {
					equalNum = strings[i].compareTo(strings[j]);
					if(equalNum > 0) {
						tmp = strings[i];
						strings[i] = strings[j];
						strings[j] = tmp;
					}
				}
			}
		}
		
		answer = strings;
		return answer;
	}
}