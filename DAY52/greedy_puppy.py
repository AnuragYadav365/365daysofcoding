#https://www.codechef.com/CUPP2101/problems/GDOG
#Anurag Yadav
#https://github.com/AnuragYadav365


T = int(input())
while(T!=0):
    N, K = map(int, input().split())
    T-=1
    max_coin=0
    for j in range(2,K+1):
        if(max_coin<N%j):
            max_coin=N%j
    #print("By maximal through each pair: ", max_coin)
    #print("By remainder method: ", N%K)
    print(max_coin)