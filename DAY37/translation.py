#https://codeforces.com/problemset/problem/41/A
# Anurag Yadav
#https://github.com/AnuragYadav365

s = input()
t = input()

if(t == s[-1::-1]):
    print("YES")
else:
    print("NO")