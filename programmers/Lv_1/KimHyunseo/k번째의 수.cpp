#include<iostream>
#include <string>
#include <vector>
#include <algorithm>

using namespace std;

vector<int> solution(vector<int> array, vector<vector<int>> commands);

int main()
{
	vector<int> arr = {1,5,2,6,3,7,4};
	vector<vector<int>> comm = { {2,5,3},{4,4,1},{1,7,3} };
	solution(arr,comm);
}


vector<int> solution(vector<int> array, vector<vector<int>> commands)
{
	int a;
	vector<int> process;
	vector<int> process2;
	vector<int> answer;
	for (int i = 0; i < commands.size(); i++)
	{
		for (int j = 0; j < commands[i].size(); j++)
		{
			process.push_back(commands[i][j]);
		}
		for (int k = process[0]; k <= process[1]; k++)
		{
			process2.push_back(array[k - 1]);
		}
		sort(process2.begin(), process2.end());
		a = process2.at(process[2] - 1);
		answer.push_back(a);
		process.clear();
		process2.clear();
	}

	return answer;
}