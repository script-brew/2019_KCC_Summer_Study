def solution(brown, red):
    answer = []
    ans=[]
    num=brown+red
    for i in range(num+1, 0, -1):
        if num%i==0:
            ans.append(i)
            if num//i==i:
                ans.append(i)
    for j in range(1, len(ans)):
        x,y=ans[j-1],ans[len(ans)-j]
        if (ans[j-1]-2)*(ans[len(ans)-j]-2)==red:
            answer.append(x)
            answer.append(y)
            break
    return answer