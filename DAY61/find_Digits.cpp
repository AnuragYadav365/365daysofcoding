//https://www.hackerrank.com/challenges/find-digits/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;

    while(t--){
        int n;
        cin >> n;

        int temp = n;
        int cnt=0;
        while(temp!=0){
            if(temp%10==0){
                cnt++;
            }
            else if(n%(temp%10)==0){
                cnt++;
            }
            temp/=10;
        }

        cout << cnt << endl;
    }
    return 0;
}