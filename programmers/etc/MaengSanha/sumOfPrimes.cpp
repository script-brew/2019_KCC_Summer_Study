// 2부터 N까지의 모든 소수의 합을 구하세요.
// N이 7이라면 {2,3,5,7} = 17을 출력 하시면 됩니다.
// N의 범위는 2이상 10,000,000이하 입니다.
// 효율성 테스트의 모든 시간 제한은 1초입니다.


#include <vector>
#include <cmath>

using namespace std;

bool isPrime(int n)
{
    static vector<int> primes = {2,3,5,7,11,13};
    if (n==2) 
        return true;
    else if ((n%2==0)||(n==1))
        return false;
    int root = sqrt(n);
    int i=0, cnt=0;
    while (cnt<=root)
    {
        cnt = primes[i++];
        if (n%cnt==0)
            return false;
    }
    for (; cnt<=root; cnt+=2)
    {
        if (n%cnt==0)
            return false;
    }
    primes.push_back(n);
    return true;
}


long long sum_of_primes(int N) {
    long long answer = 2;
    for (int i=3; i<=N; i+=2)
    {
        if (isPrime(i)==true)
            answer += i;            
    }
    return answer;
}