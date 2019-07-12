def solution(clothes):
    dic={}
    answer=1
    for i in range(len(clothes)):
        dic[clothes[i][1]]=0
    for j in range(len(clothes)):
        dic[clothes[j][1]]+=1
# 모든 조합의 합 == 개별 가짓수+1 을 다 곱하고 - 1 (-1은 아무것도 안 입는 조합을 뺀 것.)
    for i in dic.values():
        answer*=(i+1)
    return answer-1