#include<iostream>
#include<vector>

using namespace std;

int solution(int n, vector<int> lost, vector<int> reserve) 
{
	int answer = 0;
	vector<bool> arr(n + 1, false); 
	vector<bool> arr2(n + 1, true); 
	//arr,arr2 �Ѵ� true �̸� ������ ,�Ѵ� false �̸� ���� or�̸� 1��
	
	for (int i = 0; i < reserve.size(); i++)
		if (!arr[reserve[i]])//ü������ �ְ� �ٲ���
			arr[reserve[i]] = true;
	for (int i = 0; i < lost.size(); i++)
		if (arr2[lost[i]]) //ü������ ���� �ٲ���
			arr2[lost[i]] = false;

	for (int i = 1; i < arr.size(); i++)
	{
		if (!arr[i] && !arr2[i]) //ü������ ������
		{
			if (arr[i - 1] && arr2[i - 1])
			{
				arr[i] = true;
				arr2[i - 1] = false;
			}
			else if (arr[i + 1] && arr2[i + 1])
			{
				arr[i] = true;
				arr2[i + 1] = false;
			}
		}
	}
	for (int i = 1; i < arr.size(); i++)
		if (arr[i] || arr2[i])
			answer += 1;
	
	return answer;
}

int main()
{
	vector<int> lost = { 2,4 };
	vector<int> reserve = { 3};
	cout << solution(5, lost, reserve);
}