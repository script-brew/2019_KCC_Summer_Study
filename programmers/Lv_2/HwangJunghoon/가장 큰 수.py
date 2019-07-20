def solution(numbers):
    return str(int("".join(sorted(list(map(str, numbers)), key=lambda x: x*3, reverse=True))))
"""
list(map(str, numbers)) -> number의 모든 원소를 str(함수)로 변환해서 리스트로 만듬
key=lambda x: x*3, reverse=True
-> 예시 [6, 655, 65] : 6/65/655 순으로 크게 해야하므로
x*3 정렬 하면 666 655655655 656565 666>656>655로 reverse 정렬이 됨 (numbers의 원소는 1000이하 이므로 x*3해야함)
''.join(list)로 문자열로 변환
str(int(문자열)) : 0000 -> 0으로 출력해야 하므로 int 출력
"""