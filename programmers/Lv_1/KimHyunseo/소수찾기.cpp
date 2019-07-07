#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(int n) {
	int answer = 0;
	vector<bool> check(n + 1, true);
	for (int i = 2; i <=n; i++)
	{
		if (check[i])
			answer +=1;
		for (int j = i; j <=n; j+=i)
		{
			check[j] = false;
		}
	}
	return answer;
}

int main()
{
	int n = 10;
	solution(10);
}