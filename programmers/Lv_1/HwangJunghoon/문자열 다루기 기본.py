def solution(s):
    if len(s)!=4 and len(s)!=6:
        return False
    else:
        return s.isdigit()