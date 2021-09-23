#https://www.hackerrank.com/challenges/encryption/problem
#Anurag Yadav
#https://github.com/AnuragYadav365

#required to calculate ceil and floor value
import math

#return list
#obtained by breaking of string into matrices
#of fval row and cval columns
def get_list(str, fval, cval):
    lst = []
    first = 0
    for i in range(fval):
        get_str = ""
        for j in range(cval):
            get_str += (str[first:first+1])
            first+=1
        lst.append(get_str)
    return lst

#important function*
#loops thorugh lenght of grid
#checks for the row val for each column
#appending the values in str_Val, return by the function
def get_grid(grid, indx):
    str_val = ""
    for i in range(len(grid)):
        for j in range(indx,indx+1):
            try:
                str_val += grid[i][j]
            except:
                pass
    return str_val


#main program
#take input of string from user
s = input()

#get floor val which is lower value root of len(string)
#get ceil val which is upper value root of len(string)
floor_val = math.floor(pow(len(s),1/2))
ceil_val = math.ceil(pow(len(s),1/2))
#print(floor_val, ceil_val)


#use function get_list
#get all the breaking parts of string s
#in terms of floor as row and ceil as column
if(len(s)>floor_val*ceil_val):
    gridlst = get_list(s, ceil_val, ceil_val)
else:
    gridlst = get_list(s, floor_val, ceil_val)


#counter to each successive column
col_indx=0
#store the strings one by one in this list
final_list = []

#loop to get through each row
#and fetched the required string
for m in range(ceil_val):
    fetch = get_grid(gridlst, col_indx)

    #append the fetched string to final_list
    final_list.append(fetch)
    col_indx += 1


#finally
#print all the elements from final_list
for i in range(len(final_list)):
    print(final_list[i], end=" ")