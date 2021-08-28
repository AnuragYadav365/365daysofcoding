English = int(input())
Eng_set = set(map(int, input().split()))

French = int(input())
Fr_set = set(map(int, input().split()))

print(len(Eng_set.difference(Fr_set)))