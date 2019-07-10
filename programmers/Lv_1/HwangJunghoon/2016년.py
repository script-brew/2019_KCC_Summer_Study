def solution(a, b):
    list31=[1,3,5,7,8,10,12]
    list30=[4,6,9,11]
    day=['THU','FRI','SAT', 'SUN','MON','TUE','WED']
    sum=b
    for i in range(1,a):
        if i in list31:
            sum+=31
        elif i in list30:
            sum+=30
        else:
            sum+=29
    return day[sum%7]