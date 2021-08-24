# from collections import Counter


# X = int(input("Enter the number of shoes:"))
# shoesize = []

# for i in range(X):
#     size = int(input())
#     shoesize.append(size)

# dict_size = Counter(shoesize)
# # print(dict_size)
# tot_price = 0  #initializing

# customers = int(input("Enter the number fo customers: "))
# for j in range(customers):
#     csize, cprice = map(int, input().split())
#     # print(csize, cprice)
#     print(type(csize))
#     print("Dict keys: ",dict_size.keys())
#     if(csize in dict_size.keys()):
#         print("Csize is: ", csize)
#         if(dict_size[csize] > 0):
#             tot_price+=cprice
#             dict_size[csize]-=1
#             print("Tot price now is: ", tot_price)
#             print("CHANGES DICTIONARY OF COUNTER SIZES is: ", dict_size)
#         else:
#             print("Passed inner")
#             continue
#     else:
#         print("Passes outer")
#         pass

# print(tot_price)

# Enter your code here. Read input from STDIN. Print output to STDOUT


from collections import Counter

X = int(input())
shoesize = list(map(int, input().split()))

dict_size = Counter(shoesize)
tot_price = 0  #initializing

customers = int(input())
for j in range(customers):
    csize, cprice = map(int, input().split())
    
    if(csize in dict_size.keys()):
        if(dict_size[csize] > 0):
            tot_price+=cprice
            dict_size[csize]-=1
        else:
            continue
    else:
        pass

print(tot_price)