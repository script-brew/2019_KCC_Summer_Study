#include <string>
#include <vector>
#include<iostream>

using namespace std;

string solution(vector<string> seoul) {
	string answer = "\"�輭���� ";
	int strint;
	for (int i = 0; i < seoul.size(); i++)
		if (seoul[i] == "Kim")
			strint = i;
	string str = to_string(strint);
	answer.append(str);
	answer.append("���ִ�\"");
	cout << answer;
	return answer;
}

int main()
{
	vector<string> arr = { "Jane","Kim" };
	solution(arr);
}