def solution(skill, skill_trees):
    answer = 0
    contraction=[]
    #스킬트리에 있는 스킬만 순서대로 넣고 새로 리스트에 저장
    for i in skill_trees:
        temp=''
        for j in range(len(i)):
            if i[j] in skill:
                temp+=i[j]
        contraction.append(temp)
    # slicing으로 비교하여 +1
    for k in contraction:
        if skill[:len(k)]==k:
            answer+=1
    return answer