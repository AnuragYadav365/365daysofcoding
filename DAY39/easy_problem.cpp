//https://codeforces.com/problemset/problem/1030/A
// Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;

    int response;
    string ans = "EASY";
    while(n--){
        cin >> response;
        if(response == 1){
            ans = "HARD";
            break;
        }
    }
    cout << ans;
    return 0;
}