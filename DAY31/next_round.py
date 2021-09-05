n, k = map(int, input().split())
lst = list(map(int, input().split()))

count = 0
participant_score = lst[k-1]
for i in lst:
    if(i >= participant_score and (participant_score != 0 or i != 0)):
        count+=1
    elif(i < participant_score):
        break
print(count)