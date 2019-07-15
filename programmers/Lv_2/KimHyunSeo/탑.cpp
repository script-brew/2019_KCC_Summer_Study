#include <string>
#include <vector>
#include <iostream>
using namespace std;
// 6 3 5 7 4
vector<int> solution(vector<int> heights)
{
	vector<int> answer = { 0 };
	int index = 0;
	int height = heights[0];
	for (int i = 1; i < heights.size(); i++)
	{
		if (heights[i - 1] > heights[i])
		{
			index = i;
			height = heights[i - 1];
		}
		if (height < heights[i]) {
			index = 0;
		}
		answer.push_back(index);
	}
	return answer;
}

int main()
{
	vector<int> answers = { 6,9,5,7,4 };
	solution(answers);
}