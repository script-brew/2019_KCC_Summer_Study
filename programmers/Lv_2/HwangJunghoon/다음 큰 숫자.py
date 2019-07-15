def solution(n):
    for i in range(n+1, 2*n):
        # bin(n)[:2] == '0b'이고, 쓸모 없으므로 제거
        if bin(n)[2:].count('1')==bin(i)[2:].count('1'):
            answer=bin(i)[2:]
            # n+1부터 비교하면서 '1'의 갯수가 같은 수를 찾으면 for문을 break한다
            break
    return int(answer, 2)
    # int(a,b)는 b진수로 표현된 a라는 수를 10진법으로 변환시킨다