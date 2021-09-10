n = int(input())
s = input()

Anton = 0
Danik = 0
for l in s:
    if(l == "A"):
        Anton+=1
    elif(l == "D"):
        Danik+=1

if(Anton > Danik):
    print("Anton")
elif(Anton < Danik):
    print("Danik")
else:
    print("Friendship")