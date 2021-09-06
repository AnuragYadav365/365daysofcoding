str1 = input()
str2 = input()

ans = 0
for i in range(len(str1)):
    if(str1[i].upper() == str2[i].upper()):
        continue

    elif(str1[i].upper() < str2[i].upper()):
        ans = -1
        break

    elif(str1[i].upper() > str2[i].upper()):
        ans = 1
        break
print(ans)