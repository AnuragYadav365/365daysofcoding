//https://www.hackerrank.com/challenges/picking-numbers/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;

    int arr[n];
    for(int i=0; i<n; i++){
        cin >> arr[i];
    }

    int count = 0;
    for(int j=0; j<n-1; j++){
        if(abs(arr[j]-arr[j+1]<=1)){
            cout << arr[j] << "   " << arr[j+1]<<endl;
            count+=1;
        }
    }
    cout << count;
    return 0;
}