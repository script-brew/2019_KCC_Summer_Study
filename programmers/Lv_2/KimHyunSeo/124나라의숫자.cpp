#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(int n) {
	string answer = "";
	while (n > 0) {
		if (n % 3 == 0)
		{
			answer.insert(0, "4");
			n = n / 3 - 1;
		}
		else if (n % 3 - 1 == 0)
		{
			answer.insert(0, "1");
			n /= 3;
		}
		else
		{
			answer.insert(0, "2");
			n /= 3;
		}
	}
	return answer;
}
