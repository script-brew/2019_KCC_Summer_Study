def solution(n, lost, reserve):
    lost=sorted(lost)
    reserve=sorted(reserve)
    dic={}
    for i in range(1,n+1):
        if i in reserve and not i in lost:
        #여분옷 O, 도난 X
            dic[i]=2
        elif not i in reserve and i in lost:
        # 여분옷 X, 도난 O
            dic[i]=0
        else:
        # 여분옷, 도난 둘다 X + 여분옷, 도난 둘다 O (빌려줄 수 없음)
            dic[i]=1
    #딕셔너리 key값은 1부터 n까지 있다(index가 아님)
    for j in range(2, n):
        if dic[j-1]==2 and dic[j]==0:
            dic[j-1], dic[j]=1, 1
        elif dic[j-1]==0 and dic[j]==2:
            dic[j-1], dic[j]=1, 1
        elif dic[j]==2 and dic[j+1]==0:
            dic[j], dic[j+1]=1, 1
        elif dic[j]==0 and dic[j+1]==2:
            dic[j], dic[j+1]=1, 1
    lst=list(dic.values())
    #value값을 list로 변환 시킨 후에 여분 있지만 못빌려준 애들도 한개만 있다고 간주
    for i in range(len(lst)):
        if lst[i]==2:
            lst[i]=1
    return lst.count(1)