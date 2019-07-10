def solution(d, budget):
    # answer = 최대 지원 가능 부서의 갯수, acculmate = 누적 신청 금액
    answer, accumulate = 0, 0
    d.sort()
    for i in range(len(d)):
        if accumulate<=budget:
            accumulate+=d[i]
            answer+=1
            #한번 더 더해서 초과된 상태면 다시 빼줌
            if accumulate>budget:
                accumulate-=d[i]
                answer-=1
                #시간 단축을 위해 break를 걸어줌(안 걸어도 무방)
                break
        else:
            break
    return answer