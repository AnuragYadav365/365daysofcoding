#!/bin/python3
#https://www.hackerrank.com/challenges/staircase/problem
# Anurag Yadav
#https://github.com/AnuragYadav365

import math
import os
import random
import re
import sys

#
# Complete the 'staircase' function below.
#
# The function accepts INTEGER n as parameter.
#

def staircase(n):
    for i in range(n):
        print(" "*(n-(i+1)) + "#"*(i+1))
    return

if __name__ == '__main__':
    n = int(input().strip())

    staircase(n)
