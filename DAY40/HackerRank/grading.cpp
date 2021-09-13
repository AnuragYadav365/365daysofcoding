#include <bits/stdc++.h>
using namespace std;
int main(){
    int n;
    cin >> n;

    int grade = 0;
    for(int i=0; i<n; i++){
        cin >> grade;
        int nextmultiple = 0;
        if(grade%5 == 0){
            nextmultiple = floor(grade/5)*5;
        }
        else{
            nextmultiple = (floor(grade/5)*5)+5;
        }

        if(grade<38){
            cout << grade << endl;
        }
        else{
            if(nextmultiple - grade < 3){
                cout << nextmultiple << endl;
            }
            else{
                cout << grade << endl;
            }
        }
    }
    return 0;
}