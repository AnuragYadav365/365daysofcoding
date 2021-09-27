#https://www.hackerrank.com/challenges/halloween-sale/problem
#Anurag Yadav
#https://github.com/AnuragYadav365


#p is the starting amount
#d is the consective deduction
#m is the final cost at which every game price becomes equal
#s is the budget
p, d, m, s = map(int, input().split())

price_lst = []
while(p>m):
    price_lst.append(p)
    p-=d
print(price_lst)

tot_price = 0
count = 0
iter_var = 0
while(True):
    pass


#Not completed