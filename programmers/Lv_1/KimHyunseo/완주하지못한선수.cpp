#include <string>
#include <vector>
#include<iostream>
#include <algorithm>

using namespace std;

string solution(vector<string> participant, vector<string> completion) {
	string answer = "";
	sort(participant.begin(), participant.end());
	sort(completion.begin(), completion.end());
	for (int i = 0; i < completion.size(); i++)
	{
		if (participant[i].compare(completion[i]) != 0) {
			answer = participant[i];
			break;
		}
		else
		{
			answer = participant[completion.size()];
		}
	}
	return answer;
}
int main()
{
	vector<string> parti = { "mislav", "stanko", "mislav", "ana"};
	vector<string> comple= {"stanko", "ana", "mislav" };
	cout<<solution(parti,comple);
}