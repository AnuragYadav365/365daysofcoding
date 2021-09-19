//https://www.hackerrank.com/challenges/electronics-shop/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int b, n, m;
    cin >> b >> n >> m;

    int keyboards[n];
    int drives[m];

    //taking input of keyboard prices
    for(int i=0; i<n; i++){
        cin >> keyboards[i];
    }

    //taking input of drive prices
    for(int j=0; j<m; j++){
        cin >> drives[j];
    }

    int max_b = -1;
    //loop to iterate through each keyboard prices
    for(int x=0; x<n; x++){
        //loop to iterate through each drive prices
        for(int y=0; y<m; y++){

            //check for sum price > current max price and less than or equal to budget
            if((keyboards[x] + drives[y] > max_b) and keyboards[x] + drives[y] <= b){
                max_b = keyboards[x] + drives[y];
            }
        }
    }

    cout << max_b;
    return 0;
}