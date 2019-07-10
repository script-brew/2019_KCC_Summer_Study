def solution(n):
    answer=[]
    n=list(str(n))
    n.reverse()
    for i in n:
        answer.append(int(i))
    return answer