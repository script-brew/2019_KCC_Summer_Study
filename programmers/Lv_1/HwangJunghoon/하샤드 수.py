def solution(x):
    a=str(x)
    y=0
    for b in a:
        y+=int(b)
    if x%y==0:
        return True
    else:
        return False