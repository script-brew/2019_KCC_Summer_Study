def solution(n):
    answer=sorted(list(str(n)))
    answer.reverse()
    return int(''.join(answer))