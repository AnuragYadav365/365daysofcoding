# integers
# 1 2 3 4 5 6 7 8 9

# 10 queries

# pop --> removes first elements i.e. 1.. set becomes 2 3 4 5 6 7 8 9
# remove 9 --> removes 9.. set becomes 2 3 4 5 6 7 8 9
# discard 8 --> remove 8 from set.. set becomes 2 3 4 5 6 7

# remove 7 -- remove 7 from the set.. set becomes 2 3 4 5 6
# pop -- removes first element i.e. 2.. set becomes 3 4 5 6
# discard 6 --> remove 6 from set.. set becomes 3 4 5
# remove 5 --> remove 5 from set.. set becomes 3 4
# pop --> remove first elements i.e. 3.. set becomes ([4])
# discard 5 --> keyError


#Taking number of elements from runtime
n = int(input())
s = set(map(int, input().split()))

#Taking total number of commands
N = int(input())
cmd = "pop"
for j in range(N):
    try:
        cmd, val = input().split()
        val = int(val)
    except:
        cmd = "pop"

    if(cmd == "remove"):
        try:
            s.remove(val)
        except:
            pass
    elif(cmd == "discard"):
        s.discard(val)

    elif(cmd == "pop"):
        a = s.pop()
print(sum(s))