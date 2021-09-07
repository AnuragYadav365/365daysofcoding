n = int(input())
s = input()

col_lst = list(s)
fin_list = []
col_lst.append('E')
count = 0
for i in range(len(col_lst)-1):
    # checking for current value of lst if not equal to next value then append it to fin_lst
    if(col_lst[i] != col_lst[i+1]):
        fin_list.append(col_lst[i])

    # if current element = to next element then count increment by 1
    else:
        count+=1

print(count)
