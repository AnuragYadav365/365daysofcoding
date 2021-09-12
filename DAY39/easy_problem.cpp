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