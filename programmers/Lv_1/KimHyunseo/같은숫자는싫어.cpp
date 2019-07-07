#include <vector>
#include <iostream>


using namespace std;

vector<int> solution(vector<int> arr)
{
	
	vector<int> answer;
	for (int i = 0; i < arr.size();)
	{
		answer.push_back(arr[i]);
		for (int j = i + 1; i < arr.size();j++)
		{
			if (arr[i] != arr[j]) {
				i = j;
				break;
			}
		}
	}
	return answer;
}

int main()
{
	vector<int> array = { 1,1,3,3,0,1,1 };
	solution(array);

}