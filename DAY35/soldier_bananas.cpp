//https://codeforces.com/problemset/problem/546/A
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<iostream>
using namespace std;

int main(){
    int k,n,w;
    cin >> k >> n >> w;
    int price[4];
    int count = 0;
    //to calculate price upto w(total number of bananas needed)
    for(int i=0; i<w; i++){
        price[i] = (i+1) * k;
        count = count + price[i];
    }

    //if soldier buy more expensive then the money he has
    if(count > n){
        cout << abs(count-n);
    }

    //if the price is in the budget of soldier only, no need to borrow
    else{
        cout << "0";
    }
    return 0;
}