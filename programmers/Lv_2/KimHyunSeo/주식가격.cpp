#include <string>
#include <vector>
#include <iostream>

using namespace std;
//2 3 2 1
vector<int> solution(vector<int> prices) {
	vector<int> answer;
	vector<pair<int, int>> temp;
	int seconds = 0;
	for (int i = 0; i < prices.size(); i++)
		temp.push_back(pair<int, int>(prices[i], 0));
	for (int j = 0; j < temp.size(); j++) {
		for (int k = j + 1; k < temp.size(); k++) {
			if (temp[j].first <= temp[k].first)
				temp[j].second += 1;
			else {
				temp[j].second += 1;
				break;
			}
		}
	}
	for (int i = 0; i < temp.size(); i++)
		answer.push_back(temp[i].second);
	return answer;
}

int main()
{
	vector<int> price = { 1,2,3,2,3 };
	solution(price);
}