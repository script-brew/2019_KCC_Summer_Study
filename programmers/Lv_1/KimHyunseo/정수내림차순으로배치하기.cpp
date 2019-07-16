#include <string>
#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

long long solution(long long n) {
	long long answer = 0;
	int num = 1;
	vector<int> temp;
	while (n > 0)
	{
		temp.push_back(n % 10);
		n /= 10;
	}
	sort(temp.begin(), temp.end());//1,1,2,3,7,8
	for (int i = 0; i < temp.size(); i++)
	{
		answer += temp[i] * num;
		num *= 10;
	}
	return answer;
}
int main()
{
	cout << solution(12345);
	
}