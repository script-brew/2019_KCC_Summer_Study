#include <iostream>
#include <string>
#include <vector>
#include <cmath>

using namespace std;
vector<int> solution(vector<int> progresses, vector<int> speeds)
{
	vector<int> temp;
	vector<int> answer;
	int max = 0;
	int count = 1;
	//100=progresse[0]+speeds[0]*x
	for (int i = 0; i < progresses.size(); i++){
		double x = (100 - (double)progresses[i]) / (double)speeds[i];
		int y=ceil(x);
		temp.push_back(y);  
	}
	max = temp[0];//7
	for (int i = 1; i < temp.size(); i++)
	{	
		if (temp[i] <= max)
			count++;
		else {
			answer.push_back(count);
			count = 1;
			max = temp[i];
		}
	}
	answer.push_back(count);
	return answer;
}

int main()
{
	vector<int> progresses = { 93,30,55,95,90 };  //7,3,9,4,10
	vector<int> speeds = { 1,30,5,4,1 };
	solution(progresses, speeds);
}