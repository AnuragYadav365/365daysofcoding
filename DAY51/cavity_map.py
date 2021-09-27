#https://www.hackerrank.com/challenges/cavity-map/problem
#Anurag Yadav
#https://github.com/AnuragYadav365

n = int(input())
grid = []

#taking input of all the depths
for i in range(n):
    grid.append(input())
# print(grid)

final_grid = []
for j in range(n):
    #adding the first element as we only iteratefrom second character
    #no need to check dirst element
    str_cell = grid[j][0]

    #checking only middle element(i.e except 0 and n-1 element)
    for k in range(1,n-1):
        #print("Starting str_cell is ", str_cell)

        #checking for adjacent cells
        if(grid[j][k-1]<grid[j][k] and grid[j][k+1]<grid[j][k] and grid[j][n-1]!=grid[j][k]):
            #print("Found at ", grid[j][k])
            #if case found replace by X character
            str_cell += 'X'

        #else continue concatenation the same
        else:
            str_cell += grid[j][k]

    #adding the last element as we only iterated till second last character
    str_cell+=grid[j][n-1]

    # print("Final str_Cell is ", str_cell)
    final_grid.append(str_cell)


#if size is only 1
if(n==1):
    print(grid[0])
else:
    for j in final_grid:
        print(j)