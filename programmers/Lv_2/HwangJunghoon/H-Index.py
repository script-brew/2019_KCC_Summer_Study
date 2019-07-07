def solution(citations):
    citations.sort(reverse=True)
    answer=0
    for i in range(citations[0], -1, -1):
        cnt=0
        for j in citations:
            if j>=i:
                cnt+=1
        if cnt>=i:
            for k in citations:
                if k!=0:
                    answer=1
                    break
            if answer==0:
                cnt=0
            return min(cnt,i)