from math import *
def solution(n,a,b):
    if a>b:
        a,b=b,a
    #로그 사용 -> 서로 반대 진영에 있을 때 x라운드에서 만남 ex) 128(=2**7)명 참가하고 a가 1~64, b가 65~128에 있으면 7라운드에서 만남)
    x=int(log(n,2))
    for i in range(x, 0, -1):
        if 1<=a<=2**(i-1) and 2**(i-1)<b<=2**i:
            return i
        #
        else:
            if 2**(i-1)<a<=2**i and 2**(i-1)<b<=2**i:
                a-=2**(i-1)
                b-=2**(i-1)