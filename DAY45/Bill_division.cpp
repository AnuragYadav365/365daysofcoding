//https://www.hackerrank.com/challenges/bon-appetit/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){

    //n is number of items
    //k is the index of item that Anna didn't eat
    int n, k;
    cin >> n >> k;
    int bill[n];

    //inputting the bill values
    for(int i=0; i<n; i++){
        cin >> bill[i];
    }

    //Amount of money charged by brian
    int charged;
    cin >> charged;

    int tot_price = 0;
    for(int j=0; j<n; j++){
        if(bill[j] == bill[k]){
            continue;
        }
        else{
            tot_price+=bill[j];
        }
    }
    int actual = tot_price/2;

    if(charged>actual){
        cout << charged - actual;
    }
    else{
        cout << "Bon Appetit";
    }
    return 0;
}