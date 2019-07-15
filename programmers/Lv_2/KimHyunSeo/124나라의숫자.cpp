#include <string>
#include <vector>
#include <iostream>

using namespace std;

// 1 2 3 / 4  5   6   / 7   8   9  / 10  11  12  /  13  14 15   / 16 17 18/ 19 20 21
//1 2 4 /  11 12  14  / 21 22  24  / 41  42  44  / 111  112 114 / 121
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
int main()
{
	cout << solution(16);
}

