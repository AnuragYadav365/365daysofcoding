#https://www.hackerrank.com/challenges/service-lane/problem?isFullScreen=true
#Anurag Yadav
#https://github.com/AnuragYadav365


# n is the number of elements width_list
#t is the number of test cases
n, t = map(int, input().split())
width_lst = list(map(int, input().split()))

#for storing every test case values
case_lst = []
for i in range(t):
    #as two element list is provided at each iteration
    #so case_lst would be 2-D
    case = list(map(int, input().split()))
    case_lst.append(case)


#checking for each test case
for i in range(t):

    #for storing the elements in the range given in case
    #after each test case the lst becomes empty
    lst=[]

    #check thorugh the range of first element in the case
    #till the second element(inclusive)
    for j in range(case_lst[i][0],case_lst[i][1]+1):

        #append these elements in the range into temporary lst
        lst.append(width_lst[j])

    #print the min of the list obtain
    print(min(lst))