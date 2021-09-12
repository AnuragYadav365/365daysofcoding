#include<bits\stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;
    int magnet;
    int tempmagnet;
    cin >> tempmagnet;

    //even if there are no pair, there would always be one magnet
    int count = 1;
    n-=1;
    while(n--){
        cin >> magnet;
        if(tempmagnet != magnet){
            count++;
        }
        tempmagnet = magnet;
    }
    cout << count;
    return 0;
}