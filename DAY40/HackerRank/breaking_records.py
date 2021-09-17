#https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
# Anurag Yadav
#https://github.com/AnuragYadav365

scores = list(map(int, input().split()))
lowest = scores[0]
highest = scores[0]

lcount, hcount = 0,0
for i in scores:
    if(i>highest):
        hcount+=1
        highest = i
    elif(i<lowest):
        lcount+=1
        lowest = i
    else:
        pass
print(hcount, lcount)
