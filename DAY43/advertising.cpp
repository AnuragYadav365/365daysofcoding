#include<bits\stdc++.h>
using namespace std;

int main(){
    int n;
    cin >> n;

    int shared = 5;
    int liked = 2;
    int cumulative = 2;
    for(int i=2; i<=n; i++){
        shared= liked*3;
        liked = floor(shared/2);
        cumulative+=liked;
    }
    cout << cumulative;
    return 0;
}