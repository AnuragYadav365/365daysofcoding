n = int(input())
arr = list(map(int, input().split()))
small = 0
# loop runs until all elements are same
while(arr != []):
    print(len(arr))
    #getting the smallest stick length
    small = min(arr)
    for j in range(len(arr)):

        #cutting the smallest length from all sticks
        arr[j]-=small

    #removing all zeroes from the array
    arr = [k for k in arr if k != 0]