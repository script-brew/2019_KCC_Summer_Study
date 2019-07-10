def solution(s, n):
    answer = ''
    for i in range(len(s)):
        if s[i]==' ':
            answer+=' '
        # 대문자에 대한 아스키코드 사용, Z를 넘어가면 다시 앞으로 오도록 숫자 조정
        elif s[i].isupper():
            if 65<ord(s[i])+n<=90:
                x=ord(s[i])+n
            else:
                x=ord(s[i])+n-26
            answer+=chr(x)
        # 소문자에 대한 아스키코드 사용, z를 넘어가면 다시 앞으로 오도록 숫자 조정
        else:
            if 97<ord(s[i])+n<=122:
                x=ord(s[i])+n
            else:
                x=ord(s[i])+n-26
            answer+=chr(x)
    return answer