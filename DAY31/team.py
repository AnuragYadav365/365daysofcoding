n = int(input())

ans = 0
for i in range(n):
    lst = list(map(int, input().split()))
    countof1 = 0
    for j in lst:
        if(j == 1):
            countof1 += 1

    if(countof1 >=2):
        ans += 1

print(ans)