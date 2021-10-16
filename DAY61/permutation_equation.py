#https://www.hackerrank.com/challenges/permutation-equation/problem
#Anurag Yadav
#https://github.com/AnuragYadav365

n = int(input())
p = list(map(int, input().split()))

for counter in range(1,n+1):
    print(p.index(p.index(counter)+1)+1)