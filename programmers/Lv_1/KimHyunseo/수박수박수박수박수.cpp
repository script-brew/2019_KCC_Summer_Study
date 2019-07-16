#include <string>
#include <vector>
#include <iostream>

using namespace std;

string solution(int n) {
	string answer = "";
	int num;
	vector<bool> check(n+3, false);
	for (int i = 0; i < n; i++)
	{
		check[i] = true;
	}
	if (n % 2 == 0)
		num = n / 2;
	else
		num = n / 2 + 1;
	for (int i = 0; i < num; i++)//n이 3이면 3까지만 
	{
		if (check[2*i]) //0,2,4
			answer += "수";	
		if(check[2*i+1]) 
			answer += "박";
	}
	return answer;
}

int main()
{
	cout << solution(5);
}