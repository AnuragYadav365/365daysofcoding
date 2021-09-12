n = int(input())
negative = 0
positive = 0
zero = 0
for i in range(n):
    num = int(input())
    if(num>0):
        positive+=1
    elif(num<0):
        negative-=1
    else:
        zero+=1

print(f"{abs(positive/n):.6f}")
print(f"{abs(negative/n):.6f}")
print(f"{abs(zero/n):.6f}")