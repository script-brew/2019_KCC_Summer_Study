def solution(n):

    """
    0 : 소수가 아님, 1 : 소수
    [0,0] : 0과 1은 소수가 아니므로 0 표시
    [1] * (n-1) : 2부터 n까지 (n-1) 소수라고 가정하고 시작
    """
    answer = [0, 0] + [1] * (n - 1)
    # int(n**0.5) : 2부터 n까지 검사할 필요 없이 제곱근까지만 검사
    for i in range(2, int(n**0.5)+1):
        if answer[i]:
            #소수를 제외하고 그 소수의 배수만 0으로 치환, (n-i)//i : 소수의 배수의 갯수
            answer[i*2::i] = [0] * ((n - i) // i)
    # 1로 남은 것만 갯수를 세어 return
    return answer.count(1)
print(solution(1000000))