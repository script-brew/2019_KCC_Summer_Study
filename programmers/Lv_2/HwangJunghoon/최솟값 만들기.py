def solution(A,B):
    answer = 0
    #리스트 하나는 순서대로, 나머지는 역순으로 정렬한 후, 같은 인덱스끼리 곱한 것이 최소이다
    A.sort()
    B.sort(reverse=True)
    for i in range(len(A)):
        answer+=A[i]*B[i]
    return answer