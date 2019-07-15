def solution(n, m):
    biglist=[]
    smalllist=[]
    if n>m:
        n,m=m,n
        # 왼쪽 수를 작게, 오른쪽 수를 크게 지정
    # 큰 수의 약수를 순서대로 리스트에 저장
    for i in range(1, m+1):
        if m%i==0:
            biglist.append(i)
    # 작은 수의 약수를 역순대로 리스트에 저장
    for j in range(n, 0, -1):
        if n%j==0:
            smalllist.append(j)
    # 예시 : 84, 120에서 최대공약수 12를 나누면 7,10이 나옴
    # 12*7*10 = 84*10 = 84*120/12 = m*n/k
    for k in smalllist:
        if k in biglist:
            return [k,int(m*n/k)]