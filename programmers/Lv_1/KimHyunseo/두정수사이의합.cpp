#include <string>
#include <vector>
#include <iostream>

using namespace std;

long long solution(int a, int b) {
	long long answer = 0;
	for (int i = a; i <= b; i++)
		answer += i;
	return answer;
}

int main()
{
	int a = 3;
	int b = 5;
	cout << solution(a, b);
}