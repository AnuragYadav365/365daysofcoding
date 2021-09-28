#https://www.hackerrank.com/challenges/camelcase/problem?isFullScreen=true
#Anurag Yadav
#https://github.com/AnuragYadav365

s = input()

words = 1
for j in s:
    if(j.isupper()):
        words+=1
print(words)