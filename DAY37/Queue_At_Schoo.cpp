//https://codeforces.com/problemset/problem/266/B
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int n, t;
    cin >> n >> t;

    string s;
    cin >> s;

    char temp;
    string s2;
    for(int j=0; j<t; j++){
        s.append("C");
        for(int i=0; i<n; i++){
            if(s.at(i) == 'B' and s.at(i+1) == 'G'){
                s2.append("G");
                s2.append("B");
                i++;
            }
            else{
                if(s.at(i) == 'B'){
                    s2.append("B");
                }
                else{
                    s2.append("G");
                }
            }
        }
        s=s2;
        s2.clear();
    }
    cout << s;
    return 0;
}