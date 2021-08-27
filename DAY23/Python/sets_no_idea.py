Happiness = 0
n, m = map(int, input().split())
s = list(map(int, input().strip().split()))
s1 = set(map(int, input().strip().split()))
s2 = set(map(int, input().strip().split()))

for i in s:
    if i in s1:
        Happiness+=1
    if i in s2:
        Happiness-=1
print(Happiness)