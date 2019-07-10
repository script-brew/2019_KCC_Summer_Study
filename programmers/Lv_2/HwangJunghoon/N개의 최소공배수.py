def solution(arr):
    #from fractions import gcd가 있지만 안 씀
    arr=sorted(arr, reverse=True)
    lcm=1
    for i in range(2, arr[0]+1):
        temp=1
        cnt=0
        while cnt!=1:
            for j in range(len(arr)):
                if arr[j]%i==0:
                    #arr의 원소 중 하나라도 나누어지는 경우
                    arr[j]=int(arr[j]/i)
                    temp=i
            for k in range(len(arr)):
                # 모든 arr의 원소가 k로 나누어지지 않을 때까지 while문 실행
                if arr[k]%i==0:
                    cnt=0
                    break
                else:
                    #arr의 원소 중 하나라도 나누어지지 않는 경우 : while 종료 조건 충족시킴
                    cnt=1
            lcm*=temp
        #모든 arr의 원소가 1이 되면 최소공배수를 출력
        if sum(arr)==len(arr):
            break
    return lcm