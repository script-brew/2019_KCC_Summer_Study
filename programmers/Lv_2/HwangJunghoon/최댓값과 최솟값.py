def solution(s):
    s=s.split(" ")
    minimum, maximum = 563, -2157
    for i in s:
        if int(i)<minimum:
            minimum=int(i)
        if int(i)>maximum:
            maximum=int(i)
    return str(minimum)+' '+str(maximum)