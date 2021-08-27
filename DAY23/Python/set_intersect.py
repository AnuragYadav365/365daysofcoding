# Enter your code here. Read input from STDIN. Print output to STDOUT
n= int(input())
s1 = s = set(map(int, input().split()))
b = int(input())
s2 = s = set(map(int, input().split()))

print(len(s1.intersection(s2)))