#include<iostream>
#include <string>
#include <vector>
#include <algorithm>
//저장해놓고
//
using namespace std;

vector<string> solution(vector<string> strings, int n) {
	vector<string> answer;
	vector<char> temp;
	vector<bool> overlap(strings.size(),true);
	for (int i = 0; i < strings.size(); i++)
	{
		temp.push_back(strings[i].at(n));
		cout << temp[i] << endl;
 	}
	sort(strings.begin(), strings.end());
	sort(temp.begin(), temp.end());
	//overlap부분만 정렬
	for (int i = 0; i < strings.size(); i++)
	{
		for (int j = 0; j < strings.size(); j++){
			if (overlap[j]) {
				if (temp[i] == strings[j].at(n))
				{
					answer.push_back(strings[j]);
					overlap[j] = false;
				}
			}
		}
	}
	
	return answer;
}

int main()
{
	vector<string> string = { "sun", "bed", "car" };
	                         
	solution(string, 1);
}