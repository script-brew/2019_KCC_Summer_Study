def solution(s):
    s=s.lower()
    #전부 소문자로 치환
    if s.count('p') == s.count('y'):
        return True
    else:
        return False