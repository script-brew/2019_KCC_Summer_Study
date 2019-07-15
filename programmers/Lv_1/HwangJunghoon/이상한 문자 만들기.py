def solution(s):
    count = 0
    str1=""
    for i in range(len(s)):
        #공백 케이스 : 띄어쓰기하면 바로 index 0으로 초기화
        if s[i]==' ':
            count=0
            str1+=' '
        # 0,2,4... 짝수 인덱스 케이스 : 대문자로
        elif count%2 == 0 :
            str1 += s[i].upper()
            count+=1
        # 1,3,5... 홀수 인덱스 케이스 : 소문자로
        else:
            str1 += s[i].lower()
            count+=1
    return str1