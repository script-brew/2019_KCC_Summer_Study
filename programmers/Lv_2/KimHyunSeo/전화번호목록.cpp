#include <string>
#include <vector>
#include <iostream>
#include <algorithm>

using namespace std;
bool compare(string a, string b)
{
	if (a.length() < b.length())
		return 1;
	else if (a.length() > b.length())
		return 0;
	else
		return a < b;
}
bool solution(vector<string> phone_book) {
	bool answer = true;
	sort(phone_book.begin(), phone_book.end(), compare);
	for (int i = 0; i < phone_book.size(); i++)
	{
		string a = phone_book[i];
		for (int j = i + 1; j < phone_book.size(); j++)
		{
			int n = phone_book[j].find(a); //-1�ΰ�쵵 true
			if (n > 0)//���λ翡 ������
				answer = true; 
			else if(n==-1)
				answer = true;
			else {
				answer = false;
				break;
			}
		}
		if (answer == false)
			break;
	}

	return answer;
}
int main()
{
	vector<string> phone = { "119", "97674223", "1195524421" };
	cout << solution(phone);
}