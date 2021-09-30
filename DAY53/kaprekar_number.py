#https://www.hackerrank.com/challenges/kaprekar-numbers/problem?isFullScreen=true
#Anurag Yadav
#https://github.com/AnuragYadav365


#lower limit and upper limit
#both must be inclusive
p = int(input())
q = int(input())

kaprekar_list = [1]
for i in range(p,q+1):
    if(i==1 or i==2):
        continue
    square = i*i
    s = list(map(str, str(square)))

    a=0
    b=0
    for m in s[0:len(s)/2]:
        a+=int(m)
    for l in s[0:len(s)/2]:
        b+=int(l)

    print(a, b)
    # if(int(s[0:len(s)/2])+int(s[len(s/2):]) == i):
    #     print(i, " is kaprekar number")
    print(s)