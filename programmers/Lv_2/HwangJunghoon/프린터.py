def solution(priorities, location):
    rank=0
    current=list(priorities)
    prior=max(priorities)
    target_number=priorities[location]
    priorities[location]='Target'
    # priorities의 deepcopy -> current, 둘 다 동시에 queue 돌림
    while True:
        temp=priorities.pop(0)
        temp2=current.pop(0)
        if prior==temp2:
            rank+=1
            if target_number==prior and temp=='Target':
                break
            prior=max(current)
        else:
            priorities.append(temp)
            current.append(temp2)
    return rank