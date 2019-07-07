#include <string>
#include <iostream>
using namespace std;

bool solution(string s)
{
	bool answer = true;
	int pnum = 0;
	int ynum = 0;
	for (int i = 0; i < s.length(); i++)
	{
		if (s[i] == 'p' || s[i] == 'P')
			pnum ++;
		if (s[i] == 'y' || s[i] == 'Y')
			ynum++;
	}
	if (ynum == pnum)
		answer = true;
	else
		answer = false;
	return answer;
}

int main()
{
	string s = "pPoooyY";
	cout<<solution(s);
}