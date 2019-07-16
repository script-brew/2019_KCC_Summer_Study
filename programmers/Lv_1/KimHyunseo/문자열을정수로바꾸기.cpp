#include <string>
#include <vector>
#include <iostream>
using namespace std;

int solution(string s) {
	int answer = stoi(s);
	//stoi함수쓰면 int로 변환가능
	return answer;
}

int main()
{
	cout<<solution("1234");
}