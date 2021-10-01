#https://www.hackerrank.com/challenges/sock-merchant/problem?isFullScreen=true
#Anurag Yadav
#https://github.com/AnuragYadav365

n = int(input())
ar = list(map(int, input().split()))

temp_lst = []
print(set(ar))

pair_cnt=0
cnt=0
for j in set(ar):
    for i in ar:
        if(i==j):
            print("i==j ", i)
            cnt+=1
        print(cnt)
print(pair_cnt)