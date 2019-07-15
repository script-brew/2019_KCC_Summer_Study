#include <string>
#include <vector>
#include <sstream>
#include <algorithm>
#include <iostream>
using namespace std;

string solution(string s) {
	string answer = "";
	string stemp;
	vector<int> temp;

	stringstream ss(s);
	int min;
	int max;
	for (ss; (ss >> stemp);)
	{
		temp.push_back(stoi(stemp));
	}
	sort(temp.begin(), temp.end());
	min = temp[0];
	max = temp[temp.size() - 1];
	answer = to_string(min) + ' ' + to_string(max);
	return answer;
}
int main()
{
	string s = "1 2 3 4";
	solution(s);
}
