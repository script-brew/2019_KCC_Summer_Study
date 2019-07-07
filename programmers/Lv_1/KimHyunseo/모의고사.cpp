#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> answers) {
	int max=0;
	vector<int> answer;
	vector<int> tmp = { 0,0,0 };
	vector<int> supo1 = { 1,2,3,4,5 };
	vector<int> supo2 = { 2,1,2,3,2,4,2,5 };
	vector<int> supo3 = { 3,3,1,1,2,2,4,4,5,5 };
	for (int i = 0; i < answers.size(); i++)
	{
		if (answers[i] == supo1[i % 5])
			tmp[0] += 1;
		if (answers[i] == supo2[i % 8])
			tmp[1] += 1;
		if (answers[i] == supo3[i % 10])
			tmp[2] += 1;
	}
	for (int i = 0; i < tmp.size(); i++)
	{
		if (max < tmp[i])
			max = tmp[i];
	}
	for (int i = 0; i < tmp.size(); i++)
	{
		if (tmp[i] == max)
			answer.push_back(i);
	}
	return answer;
}

int main()
{
	vector<int> answers = { 1,3,2,4,2};
	solution(answers);
}
