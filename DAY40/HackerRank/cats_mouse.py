x,y,z = 0,0,0
for i in range(int(input())):
    x,y,z = map(int, input().split())
    while(True):
        print("values: ", x,y,z)
        if(x==y):
            print("Mouse C")
            break
        elif(y==z):
            print("Cat B")
            break
        elif(x==z):
            print("Cat A")
            break

        if(x>z):
            x-=1
        else:
            x+=1

        if(y>z):
            y-=1
        else:
            y+=1