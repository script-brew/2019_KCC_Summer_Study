#include <string>
#include <vector>

using namespace std;

bool solution(string s) {
	bool answer = true;
	if (s.length() == 4 || s.length() == 6)
		answer = true;
	else
		answer = false;

	for (int i = 0; i < s.length(); i++)
	{
		if (!(s[i] >= '0' && s[i] <= '9')) {
			answer = false;
			break;
		}
	}
	return answer;
}

int main()
{
	string s = "a1234";
	solution(s);
}