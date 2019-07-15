#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;
bool compare(string& a, string& b)
{
	return a+b > b+a;
}
string solution(vector<int> numbers)
{
	string answer = "";
	vector<string> str;
	string temp;
	string max;
	for (int i = 0; i < numbers.size(); i++) 
		str.push_back(to_string(numbers[i]));
	sort(str.begin(), str.end(), compare);

	/*for (int i = 0; i < str.size(); i++)
	{
		max = str[i];
		for (int j = i + 1; j < str.size(); j++)
		{
			if (max+ str[j]< str[j]+max)
			{
				temp = str[i];
				str[i] = str[j];
				str[j] = temp;
			}
		}
	}*/
	for (int i = 0; i<str.size(); i++)
	{
		answer += str[i];
	}
	return answer;
}

int main()  
{
	vector<int> num = { 3,30,34,5,9 };
	cout<<solution(num);
}