#include<iostream>
#include <string>
#include <vector>

using namespace std;

string solution(int a, int b) {
	vector<string> days = {"FRI", "SAT","SUN", "MON", "TUE", "WED", "THU"};
	vector<int> month = { 31,29,31,30,31,30,31,31,30,31,30,31 };
	int sum = b;
	for (int i = 1; i < a; i++)
	{
		sum += month[i-1];
	}
	string answer = days[sum % 7 - 1];
	return answer;
}

int main()
{
	//2016년 1월 1일 금요일 1월 2일 토, 1월 3일 
	//31,29,31,30,31,30,31,31,30,31,30,31
	cout<<solution(5, 31);
}