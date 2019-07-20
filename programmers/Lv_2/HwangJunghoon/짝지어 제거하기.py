def solution(s):
    # stack 사용 : lst로 담음
    lst=[]
    for i in s:
        lst.append(i)
        if len(lst)>1:
            if lst[-2]==i:
                lst.pop()
                lst.pop()
    if len(lst)==0:
        return 1
    else:
        return 0