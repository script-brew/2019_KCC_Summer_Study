def solution(bridge_length, weight, truck_weights):
    answer=0
    #다리에 queue 구현
    bridge=[0]*bridge_length
    while len(bridge)>0:
        #1초마다 달라지게 구현
        answer+=1
        bridge.pop(0)
        # 남은 truck이 없으면 pop만 시작
        if len(truck_weights)!=0:
            if sum(bridge)+truck_weights[0]<=weight:
                bridge.append(truck_weights.pop(0))
            else:
                bridge.append(0)
    return answer