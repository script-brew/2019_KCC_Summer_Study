from math import ceil
def solution(n, words):
    answer=''
    for i in range(len(words)-1):
        """
        1. 제시된 단어의 마지막 알파벳이 다음 단어의 첫 알파벳과 다른경우
        2. 제시된 단어가 이미 제시된 경우
        정상적인 경우 words[i+1]는 words[:1+1]에 포함 X
        """
        if words[i][-1]!=words[i+1][0] or words[i+1] in words[:i+1]:
            answer=words[i+1]
            # 순서를 맞추기 위해 인덱스=i+1 에서 1를 더하여 1부터 시작하게 해줌
            idx=i+2
            break
    if answer=='':
        return [0, 0]
    else:
        if idx%n==0:
            x=n
        else:
            x=idx%n
    # idx/n에 대한 경우의 수를 차단하기 위해 math.ceil 을 사용
    return [x, ceil(idx/n)]