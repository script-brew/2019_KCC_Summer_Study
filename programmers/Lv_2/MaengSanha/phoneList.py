# 전화번호부에 적힌 전화번호 중, 한 번호가 다른 번호의 접두어인 경우가 있는지 확인하려 합니다.
# 전화번호가 다음과 같을 경우, 구조대 전화번호는 영석이의 전화번호의 접두사입니다.

# 구조대 : 119
# 박준영 : 97 674 223
# 지영석 : 11 9552 4421
# 전화번호부에 적힌 전화번호를 담은 배열 phone_book 이 solution 함수의 매개변수로 주어질 때,
# 어떤 번호가 다른 번호의 접두어인 경우가 있으면 false를 그렇지 않으면 true를 return 하도록 solution 함수를 작성해주세요.

# 제한 사항
# phone_book의 길이는 1 이상 1,000,000 이하입니다.
# 각 전화번호의 길이는 1 이상 20 이하입니다.

# from itertools import permutations

# def solution(phone_book) :
#     couples = list(permutations(phone_book, 2))
#     for couple in couples :
#         phone_num1 = couple[0].replace(" ", "")
#         phone_num2 = couple[1].replace(" ", "")
#         if phone_num1 in phone_num2 or phone_num2 in phone_num1 :
#             return False
#     return True

def is_prefix(str1, str2):
    return str1[:len(str2)]==str2 if len(str1)>=len(str2) else str2[:len(str1)]==str1

def phone_list(phone_book):
    for i in range(len(phone_book)):
        phone_book[i] = phone_book[i].replace(' ', '')
    for i in range(1, len(phone_book)):
        for j in range(i):
            if is_prefix(phone_book[i], phone_book[j]):
                return False
    return True