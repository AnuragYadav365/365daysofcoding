#https://codeforces.com/problemset/problem/977/A
#Anurag Yadav
#https://github.com/AnuragYadav365

n, k = map(int, input().split())
for i in range(k):
    if(n%10 == 0):
        n /= 10
    else:
        n = n - 1
print(int(n))