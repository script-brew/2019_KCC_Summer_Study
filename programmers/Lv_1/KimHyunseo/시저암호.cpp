#include <string>
#include <vector>
#include <iostream>
using namespace std;

string solution(string s, int n) {
	string answer = "";
	char temp = ' ';
	int sum = 0;
	for (int i = 0; i < s.length(); i++)
	{
		
		if (s[i] == ' ') {
			answer.push_back(' ');
			continue;
		}
		for (int j = 0; j <= n; j++) {
			
			temp = (char)(s[i] + j);
			if (temp =='z')
			{
				if (n == j)
					break;
				s[i] = 'a';
				temp = s[i] + n - j-1;
				break;
			}
			if (temp =='Z')
			{
				if (n == j)
					break;
				s[i] = 'A';
				temp = s[i] + n - j - 1;
				break;
			}
		}
	
		answer.push_back(temp);
	}
	return answer;
}
int main()
{
	cout << solution("vwxyz",4);

	return 0;
	
}