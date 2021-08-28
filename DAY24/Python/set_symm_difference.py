# Enter your code here. Read input from STDIN. Print output to STDOUT
English = int(input())
Eng_set = set(map(int, input().split()))

French = int(input())
Fr_set = set(map(int, input().split()))

print(len(Eng_set.symmetric_difference(Fr_set)))