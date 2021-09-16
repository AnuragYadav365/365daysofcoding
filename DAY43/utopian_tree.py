lst = [1]
cycle_lst = []
t = int(input())
for i in range(t):
    cycle_lst.append(int(input()))

for i in range(1, max(cycle_lst)+1):
    if(i%2 == 0):
        lst.append(lst[i-1]+1)

    elif(i%2 != 0):
        lst.append(2*lst[i-1])

for j in cycle_lst:
    print(lst[j])