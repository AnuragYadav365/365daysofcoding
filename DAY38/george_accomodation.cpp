//https://codeforces.com/problemset/problem/467/A
// Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int n; //number of rooms
    cin >> n;

    int p = 0;
    int q = 0;
    int roomcnt = 0; //storing valid rooms
    //looping through every room
    while(n--){
        cin >> p >> q;

        //room capacity - number of people must be grater than 2
        //then it is a valid room
        if(q - p >= 2){
            roomcnt++;
        }
    }
    cout << roomcnt;
    return 0;
}