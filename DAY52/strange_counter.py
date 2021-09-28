#https://www.hackerrank.com/challenges/strange-code/problem?isFullScreen=true
#Anurag Yadav
#https://github.com/AnuragYadav365
t = int(input())

phase = 3
while(t>phase):
    t -= phase
    phase *= 2

print(phase-t+1)