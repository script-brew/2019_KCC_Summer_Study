from collections import Counter

def solution(participant, completion):
    answer = Counter(participant) - Counter(completion)
    # Counter.collections 는 key값에 대해 빈도수를 value값으로 표시
    return list(answer.keys())[0]
    # key값 목록을 list로 변환 후 index를 사용하여 return