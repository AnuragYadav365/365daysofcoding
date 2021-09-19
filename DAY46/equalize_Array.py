#https://www.hackerrank.com/challenges/equality-in-a-array/problem
#Anurag Yadav
#https://github.com/AnuragYadav365

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'equalizeArray' function below.
#
# The function is expected to return an INTEGER.
# The function accepts INTEGER_ARRAY arr as parameter.
#

def equalizeArray(arr):
    # Write your code here
    unique_arr = set(arr)

    maxcnt = 0
    maxel = 0
    for i in unique_arr:
        cnt = arr.count(i)
        if(cnt > maxcnt):
            maxcnt = cnt
            maxel = i
    return len(arr) - maxcnt

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    n = int(input().strip())

    arr = list(map(int, input().rstrip().split()))

    result = equalizeArray(arr)

    fptr.write(str(result) + '\n')

    fptr.close()
