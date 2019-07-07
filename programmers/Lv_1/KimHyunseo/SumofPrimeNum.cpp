#include<iostream>

#include <vector>
using namespace std;

long long solution(int N) {
	vector<bool> arr(N + 1, true);
	long long answer = 0;
	for (int i = 2; i <= N; i++)
	{
		if (arr[i])
			answer += i;
		for (int j = i; j <= N; j += i) //����� false�� �����
			arr[j] = false;
	}
	return answer;
}
int main()
{

}