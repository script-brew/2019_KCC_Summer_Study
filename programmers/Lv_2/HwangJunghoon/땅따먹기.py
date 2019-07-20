def solution(land):
    # 예시 : [[4, 3, 2, 1], [2, 2, 2, 1], [6, 6, 6, 4], [8, 7, 6, 5]] -> 20
    while len(land)>1:
        answer=land.pop(0) #3                             # answer = [4, 3, 2, 1]  [5, 6, 6, 5]      [12, 12, 12, 10]
        temp=land[0]  #1                                    # temp = [2, 2, 2, 1]  [6, 6, 6, 4]      [8, 7, 6, 5]
        temp[0]+=max(answer[1], answer[2], answer[3])       # temp = [5, 2, 2, 1]  [12, 6, 6, 4]     [20, 12, 12, 10]
        temp[1]+=max(answer[0], answer[2], answer[3])       # temp = [5, 6, 2, 1]  [12, 12, 6, 4]    [20, 19, 12, 10]
        temp[2]+=max(answer[0], answer[1], answer[3])       # temp = [5, 6, 6, 1]  [12, 12, 12 ,4]   [20, 19, 18, 10]
        temp[3]+=max(answer[0], answer[1], answer[2])       # temp = [5, 6, 6, 5]  [12, 12, 12, 10]  [20, 19, 18, 17]
        answer = temp #2
    return max(answer)