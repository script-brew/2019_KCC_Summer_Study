def solution(answers):
    answer = []
    half=[]
    answer1=[1,2,3,4,5]
    answer2=[2,1,2,3,2,4,2,5]
    answer3=[3,3,1,1,2,2,4,4,5,5]
    #시험이 최대 10000문제로 되어 있으므로 패턴의 길이*x=10000이 되도록 x값을 계산 후 range에 삽입
    #answers와 각 수포자가 찍는 정답의 길이를 유사하게 하기 위해 while과 break를 사용
    while(len(answer1)<len(answers)):
        for i in range(2000):
            answer1+=answer1
            break
    while(len(answer2)<len(answers)):
        for j in range(1250):
            answer2+=answer2
            break
    while(len(answer3)<len(answers)):
        for j in range(1000):
            answer3+=answer3
            break
    count1=0
    count2=0
    count3=0
    #정답이면 카운트한다
    for i in range(len(answers)):
        if answer1[i]==answers[i]:
            count1+=1
        if answer2[i]==answers[i]:
            count2+=1
        if answer3[i]==answers[i]:
            count3+=1
    #list 하나를 만들어서 max값과 각 수포자의 정답 카운트가 같으면 answer에 포함시킴
    half.append(count1)
    half.append(count2)
    half.append(count3)
    if max(half)==count1:
        answer.append(1)
    if max(half)==count2:
        answer.append(2)
    if max(half)==count3:
        answer.append(3)

    return answer