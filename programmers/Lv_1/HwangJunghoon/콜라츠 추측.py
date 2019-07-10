def solution(num):
    count=0
    for i in range(500):
        if num==1:
            return count
        elif num%2==0:
            num/=2
        else:
            num=3*num+1
        count+=1
    if num!=1:
        return -1