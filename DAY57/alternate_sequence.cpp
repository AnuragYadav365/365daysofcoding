//https://www.codechef.com/CUPA2101/problems/CHEFALT
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int T;
    cin >> T;

    while(T--){
        int N;
        cin >> N;

        int A[N];
        for(int i=0;i<N; i++){
            cin >> A[i];
        }

        int j=0;
       while(j<N){

       }

        for(int k=3; k<N; k+=2){
            cout << A[k-2] << "   " << A[k] << endl;
        }
    }
    return 0;
}