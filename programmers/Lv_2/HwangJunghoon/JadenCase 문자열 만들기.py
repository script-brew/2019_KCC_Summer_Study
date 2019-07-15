def solution(s):
    s=s.lower()
    ans=''
    wer=''
    #첫 문자가 영문이면서 소문자일 경우 : 아스키코드를 이용해 대문자로 치환
    if s[0].islower():
        ans+=chr(ord(s[0])-32)
    for i in range(len(s)-1):
        # s[0]이 중복으로 나오는 사례가 있지만 일단 넘어간다
        ans+=s[i]
        #공백+소문자가 연속으로 나오는 경우
        if s[i].isspace() and s[i+1].islower():
            ans+=chr(ord(s[i+1])-32)
    #index를 이용하여 실제 정답을 출력한다 (ans를 return하면 오답)
    wer+=ans[0]
    #wer에 대문자 삽입
    for j in range(len(ans)-1):
        #각 문자의 인덱스 0은 대문자, 1은 소문자인 경우가 있어서 대문자만 출력시키기 위해 pass함
        if ans[j].isupper() and ans[j+1].islower():
            pass
        else:
            wer+=ans[j+1]
    #ans에 맨 마지막 char가 들어가지 않으므로 s에서 직접 가져온다
    wer+=s[len(s)-1]
    return wer

"""
예시 : "3people unFollowed me" 이면
ans=='3people Uunfollowed Mm' (Uu 중복출력, 마지막 'e' 없음)
wer(정답)=='3people Unfollowed Me'로 출력됨
"""