#!/bin/python3

import math
import os
import random
import re
import sys


class VendingMachine:
    # Implement the VendingMachine here
    def __init__(self, item, coin):
        self.items = item   #here 10
        self.coins = coin   #here 2

    def buy(self, item, coin):
        self.itemreq = item
        self.moneygiven = coin

        ##checking if machine have items remaining or not
        if(self.items >= self.itemreq):
            change = self.moneygiven - (self.itemreq * self.coins)
            ##if the money given is more than change
            if(change <= self.moneygiven and change >= 0):
                self.items -= self.itemreq
                return change
            else:
                return "Not enough coins"

            ##on transaction complete decrease the number of items in vending machine
        else:
            return "Not enough items in the machine"


if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    num_items, item_coins = map(int, input().split())
    machine = VendingMachine(num_items, item_coins)

    n = int(input())
    for _ in range(n):
        num_items, num_coins = map(int, input().split())
        try:
            change = machine.buy(num_items, num_coins)
            fptr.write(str(change) + "\n")
        except ValueError as e:
            fptr.write(str(e) + "\n")


    fptr.close()
