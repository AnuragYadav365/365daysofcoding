hlist = list(map(int, input().split()))
str = input()
index = 0
mapping = 0
max = 0
for i in str:
    index = ord(i) - 97
    mapping = hlist[index]
    if(mapping>max):
        max = mapping
print(max*len(str))