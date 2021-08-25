from collections import *
N = int(input())
sum = 0

#Taking the colname input
col_list = list(map(str, input().split()))
for i in range(N):
    #Creating a namedtuple using previous list as fields and if any keyword exists rename it
    Student = namedtuple('Student', col_list, rename= True)

    #Taking val inputs of each col as tuple
    val_tup = tuple(map(str, input().split()))
    #passing this tuple to namedtuple using ._make()
    Stu = Student._make(val_tup)

    mark = int(Stu.MARKS)
    sum += mark

#Calculating average
avg = sum/N
print(avg)
