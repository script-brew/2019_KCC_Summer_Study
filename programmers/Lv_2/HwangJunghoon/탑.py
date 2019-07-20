def solution(heights):
    #ex) heights=[1,5,3,6,7,6,5]
    answer = [0]*len(heights)
    # len(heights)==7, answer=[0,0,0,0,0,0,0]
    for i in range(len(heights)-1, 0, -1):
        for j in range(i-1, -1, -1):
            if heights[i]<heights[j]:
                answer[i]=j+1
                """
                [0,0,0,0,0,0,6]
                [0,0,0,0,0,5,6]
                ------------------(no addition : 2 times)
                [0,0,2,0,0,5,6]
                ------------------(no addition : 2 times)
                final : [0,0,2,0,0,5,6]
                """
                break
                # break 안하면 중복됨
    return answer