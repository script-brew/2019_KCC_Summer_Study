#include <string>
#include <vector>
#include <iostream>

using namespace std;
//A B C D
//2 1 3 2  location 2 = c인쇄
//C D A B 첫번째로 인쇄
// 1  8  7  3  9  2  8  3  2  7  7  3  1       
// 0  1  2  3  4  5  6  7  8  9  10 11 12

int solution(vector<int> priorities, int location)
{
	int answer = 0;
	int priority = 9;
	vector<pair<int, int>> temp;
	vector<int> loca;
	for (int i = 0; i < priorities.size(); i++)
		temp.push_back(pair<int, int>(priorities[i], i)); // (중요도 , 위치)
	int index = 0; //index보다 작은부분 뒤로 보내기
	int index2 =0 ; 
	for (int i = 9; i>0; i--)
	{
		for (int j = index; j < temp.size(); j++)
		{
			if (i == temp[j].first) {
				loca.push_back(temp[j].second);
				index = j;
			}
		}
		for (int k = index2; k < index; k++)
			temp.push_back(temp[k]);
		index2 = index;
	}
	for (int i = 0; i < loca.size();i++)
	{
		if (loca[i] == location)
			answer = i + 1;
	}
	return answer;
}
int main()
{
	vector<int> prior = { 1,1,9,1,1,1 };
	int loca = 2;
	cout << solution(prior, loca);
}