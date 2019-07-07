#include <string>
#include <vector>
#include<algorithm>
#include <functional>

using namespace std;

string solution(string s) {
	sort(s.begin(), s.end(),greater<int>());
	string answer = s;
	return answer;
}

int main()
{
	string s = "Zbcdefg";
	solution(s);
}
