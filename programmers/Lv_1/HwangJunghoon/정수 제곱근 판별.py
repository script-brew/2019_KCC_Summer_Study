from math import *
def solution(n):
    if sqrt(n)==int(sqrt(n)):
        return (sqrt(n)+1)**2
    else:
        return -1