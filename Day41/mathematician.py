#https://codeforces.com/problemset/problem/61/A
#Anurag Yadav

num1 = input()
num2 = input()

num1lst =[]
num2lst = []
for i in range(len(num1)):
    num1lst.append(num1[i])
    num2lst.append(num2[i])

final_lst = []
for j in range(len(num1lst)):
    if(num1lst[j] != num2lst[j]):
        final_lst.append("1")
    else:
        final_lst.append("0")

print("".join(final_lst))