hurdles,max_height = map(int, input().split())
hurdle_height = list(map(int, input().split()))

max_hurdle = max(hurdle_height)
potion = 0
if(max_hurdle > max_height):
    potion = max_hurdle - max_height
print(potion)