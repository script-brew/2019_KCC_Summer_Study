def solution(strings, n):
    return sorted(sorted(strings), key=lambda strings: strings[n])
# 주어진 인덱스 정렬 이외에는 사전순 배열을 해야 하므로 미리 sort를 해놓고 람다를 사용해서 인덱스로 정렬해야 함
# 그냥 하면 예시2에서 abce가 abcd보다 먼저 오게 됨