def solution(array, commands):
    answer = []
    for i in range(len(commands)):
        #n번째 수는 index가 n-1이다
        lst=array[commands[i][0]-1:commands[i][1]]
        lst.sort()
        a=lst[commands[i][2]-1]
        answer.append(a)
    return answer