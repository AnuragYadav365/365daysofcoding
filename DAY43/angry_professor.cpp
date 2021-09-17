#include<bits/stdc++.h>
using namespace std;

int main(){
    int t;
    cin >> t;

    int valid_stud = 0;
    for(int i=0; i<t; i++){
        int n, k;
        cin >> n >> k;
        for(int j=0; j<n; j++){
            int element;
            cin >> element;

            if(element<=0){
                valid_stud++;
            }
        }

        cout << valid_stud;

        if(valid_stud > k){
            cout << "NO" << endl;
        }
        else{
            cout << "YES" << endl;
        }
    }
    return 0;
}