# 앞뒤를 뒤집어도 똑같은 문자열을 팰린드롬(palindrome)이라고 합니다.
# 문자열 s가 주어질 때, s의 부분문자열(Substring)중 가장 긴 팰린드롬의 길이를 return 하는 solution 함수를 완성해 주세요.

# 예를들면, 문자열 s가 abcdcba이면 7을 return하고 abacde이면 3을 return합니다.

# 제한사항
# 문자열 s의 길이 : 2500 이하의 자연수
# 문자열 s는 알파벳 소문자로만 구성

def longest_palindrome(s : str) -> int :
    def is_palindrome(s : str) -> bool :
        half = int(len(s)/2)
        for i in range(half) :
            if s[i]!=s[-i-1] :
                return False
        return True
    for i in range(len(s), 0, -1) :
        for j in range(0, len(s)-i+1) :
            if is_palindrome(s[j:i+j]) :
                return i
    return 1