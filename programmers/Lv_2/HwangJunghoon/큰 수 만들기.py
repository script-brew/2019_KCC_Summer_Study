def solution(number, k):
    answer=[]
    for i in number:
        # answer[-1]보다 크면 i보다 크거나 같을때까지 pop하고, 그만큼 k-=1
        while len(answer)>0 and answer[-1]<i and k>0:
            k-=1
            answer.pop()
        answer.append(i)
    # k를 다 소비하지 못하는 경우 ex) '987654312', k=2 -> '9876543'
    if k>0:
        answer=answer[:len(answer)-k]
    return ''.join(answer)