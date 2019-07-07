#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(string s) {
	int mid = s.size() / 2;
	string answer = "";
	if (s.size() % 2 == 1)
		answer=s[mid];
	else
	{
		answer += s[mid - 1];
		answer += s[mid];
	}
	return answer;
}

int main()
{
	string a = "abcde";
	string b = "qwer";
	cout<<solution(a)<<endl;
	cout << solution(b) << endl;;

}