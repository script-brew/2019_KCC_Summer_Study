#include <iostream>
using namespace std;
int solution(int n)
{
	//n의 자리수를 알아내야함
	int answer = 0;
	int num=1;
	for (int i = 1; i <= n; i *= 10)
	{
		num = i;//100
	}
	
	while (n > 0)
	{
		answer += n / num;
		n = n % num;
		num /= 10;
	}
	return answer;
}
int main()
{
	cout<<solution(10)<<endl;
}