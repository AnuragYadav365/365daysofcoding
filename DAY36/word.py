#https://codeforces.com/problemset/problem/59/A
# Anurag Yadav
#https://github.com/AnuragYadav365

word = input()

upper = 0
lower = 0
for i in word:
    if(i.isupper()):
        upper+=1
    else:
        lower+=1

if(upper>lower):
    print(word.upper())
else:
    print(word.lower())