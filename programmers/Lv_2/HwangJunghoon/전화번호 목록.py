def solution(phone_book):
    #phone_book.sort(key=len) : 없어도 무방하나 효율성이 올라감
    phone_book.sort(key=len)
    for i in range(len(phone_book)):
        for j in range(len(phone_book)):
            if phone_book[i]==phone_book[j][:len(phone_book[i])] and i!=j:
                return False
    return True