#https://www.hackerrank.com/challenges/apple-and-orange/problem?isFullScreen=false
#Anurag Yadav
#https://github.com/AnuragYadav365

#s is the starting point
#t is the ending point of the house
s, t = map(int, input().split())

#a is the position of apple's tree
#b is the position of orange's tree
a, b =map(int, input().split())

#m is number of apple falls
#n is number of orange falls
m, n = map(int, input().split())

apple_dist = list(map(int, input().split()))
orange_dist = list(map(int, input().split()))

#fell down apple and orange lands at these points
apple_land = [i+a for i in apple_dist]
orange_land = [j+b for j in orange_dist]

apple_cnt=0
orange_cnt=0
for x,y in apple_land:
    if(x>=s):
        apple_cnt+=1

for y in orange_land:
    if(y<=t):
        orange_cnt+=1

print(apple_cnt)
print(orange_cnt)