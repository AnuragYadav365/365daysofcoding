#INPUT THE NUMBER OF COUNTRY STAMPS
N = int(input())

#set for storing stamp values
stamp_Set = set()
for i in range(N):
    #Taking input of country stamps and adding in the set
    stamp = input()
    stamp_Set.add(stamp)

print(len(stamp_Set))