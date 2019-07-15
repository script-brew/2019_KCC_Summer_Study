def solution(n):
    # answer : 자기 자신을 포함시켜서 1부터 시작
    answer,count=1,1
    while(count<n):
        half=0
        for i in range(count,n+1):
            half+=i
            if half==n:
                answer+=1
                count+=1
                break
            elif half>n:
                count+=1
                break
    return answer