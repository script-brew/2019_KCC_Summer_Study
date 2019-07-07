# 0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

# 예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

# 0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때,
# 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

# 제한 사항
# numbers의 길이는 1 이상 100,000 이하입니다.
# numbers의 원소는 0 이상 1,000 이하입니다.
# 정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.


# from itertools import permutations

# def largest(numbers) -> str :
#     ansList = []
#     numbers = list(str(number) for number in numbers)
#     numList = permutations(numbers, len(numbers))
#     for nums in numList :
#         number = ''
#         for num in nums :
#             number += num
#         ansList.append(int(number))
#     return str(sorted(ansList, reverse = True)[0])


# def largest(numbers) -> str :
#     answer = ''
#     numbers = [str(number) for number in numbers]

#     def ordered(x : str, y : str) -> bool :
#         return True if int(x+y)>int(y+x) else False
    
#     for i in range(9, -1, -1) :
#         items = []
#         for number in numbers :
#             if number[0] == str(i) :
#                 items.append(number)
#         for i in range(len(items)) :
#             for j in range(i) :
#                 if not ordered(items[j], items[i]) :
#                     tmp = items[j]
#                     items[j] = items[i]
#                     items[i] = tmp
#         answer += ''.join(items)
#     return str(int(answer))


# from functools import cmp_to_key

# def largest(numbers) -> str :
#     numbers = [str(number) for number in numbers]
#     return str(int(''.join(sorted(numbers, key = cmp_to_key(lambda x, y : int(x+y)-int(y+x)), reverse = True))))

def largest(numbers) -> str :
    numbers = [str(number) for number in numbers]
    numbers.sort(key = lambda x : x*3, reverse = True)
    return str(int(''.join(numbers)))