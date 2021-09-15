//https://www.hackerrank.com/challenges/mini-max-sum/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;


int main(){
    long long int arr[5];
    for(int i=0; i<5; i++){
        cin >> arr[i];
    }
    int n = sizeof(arr) / sizeof(arr[0]);

    sort(arr, arr+n);
    long long int min = arr[0]+arr[1]+arr[2]+arr[3];
    long long int max = arr[1]+arr[2]+arr[3]+arr[4];

    cout << min << " " << max;
}