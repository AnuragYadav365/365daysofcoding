#Set only stores distinct values, simple way to get the required result
s = set(input())

#if distinct characters are odd, then user is MALE
if(len(s) % 2 != 0):
    print("IGNORE HIM!")
else:
    print("CHAT WITH HER!")