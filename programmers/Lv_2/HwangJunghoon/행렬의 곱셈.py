def solution(arr1, arr2):
    answer = []
    for i in range(len(arr1)):
        temp=[]
        for j in range(len(arr2[0])):
            ans=0
            for k in range(len(arr2)):
                # 필요시 설명
                ans+=arr1[i][k]*arr2[k][j]
            #행렬 곱셈을 통해 구한 수를 temp에 저장
            temp.append(ans)
        #한 줄이 완성되면 temp줄을 answer에 저장
        answer.append(temp)
    return answer