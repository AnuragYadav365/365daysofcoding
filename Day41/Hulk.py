# https://codeforces.com/problemset/problem/705/A
#Anurag Yadav

n = int(input())
str = ""
for i in range(n):
    if(i%2 == 0):
        str += "I hate"
        if(i != n-1):
            str += " that "
    elif(i%2 != 0):
        str+= "I love"
        if(i != n-1):
            str += " that "

str+=" it "
print(str)