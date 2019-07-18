#include<iostream>
#include <string>
#include <vector>

using namespace std;

int solution(string arrangement) {
	int answer = 0;
	int sticknum = 0;
	
	vector<pair<int, int>> temp(arrangement.size());
	vector<pair<int, int>> stick;
	vector<int> laser;
	for (int i = 0; i < arrangement.length(); i++)
	{
		if (arrangement[i] == '(') {
			if (arrangement[i + 1] == ')') {
				laser.push_back(i);
				i++;
			}
			else {
				temp[sticknum].first=i;
				sticknum++;
			}
		}
		else if (arrangement[i] == ')') {
			sticknum--;
			temp[sticknum].second = i;
			stick.push_back(temp[sticknum]);
			temp.erase(temp.begin() + sticknum);
		}
	}
	for (int i = 0; i<stick.size(); i++)
	{
		int lasernum = 0;
		for (int j = 0; j < laser.size(); j++)
		{
			if (stick[i].first < laser[j] && laser[j] < stick[i].second)
			{
				lasernum++;
			}
		}
		if (lasernum > 0)
			answer = answer + lasernum + 1;
	}
	return answer;
}

int main()
{
	string arr = "()(((()())(())()))(())";
	cout<<solution(arr);
}