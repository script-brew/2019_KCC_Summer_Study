#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

int solution(vector<int> nums)
{
	//3,1,2,1,2,4,1,2,3,4 //종류수
	int answer = 1;
	sort(nums.begin(), nums.end());
	for (int i = 0; i < nums.size()-1; i++)
	{
		if (nums[i] < nums[i+1]) // 다르면 검사 시작
		{
			answer += 1;
		}
	}
	if (answer > nums.size())
		return nums.size();
	else
		return answer;
}
int main()
{
	vector<int> ans = { 3,3,3,2,2,4 };
	cout << solution(ans);
}