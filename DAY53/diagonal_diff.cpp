//https://www.hackerrank.com/challenges/diagonal-difference/problem?isFullScreen=true
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    int n;
    cin >> n;

    int arr[n][n];
    for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
            cin >> arr[i][j];
            //cout << arr[i][j] << endl;
        }
    }

    int left_diag=0;
    for(int x=0; x<n; x++){
        for(int y=0; y<n; y++){
            if(x==y){
                left_diag+=arr[x][y];
            }
        }
    }
    int right_diag=0;
    for(int x=0; x<n; x++){
        for(int y=0; y<n; y++){
            if(y==(n-1)-x){
                //cout << "y is " << y << " arr val at y " <<arr[x][y] <<endl;
                right_diag+=arr[x][y];
            }
        }
    }

    cout << abs(left_diag-right_diag);
    return 0;
}