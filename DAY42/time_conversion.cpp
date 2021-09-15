//https://www.hackerrank.com/challenges/time-conversion/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    string s;
    cin >> s;

    if(s.substr(8,2) == "AM"){
        if(s.substr(0,2) == "12"){
            cout << "00" << s.substr(2,6);
        }
        else{
            cout << s.substr(0,8);
        }
    }
    else{
        if(s.substr(0,2) == "12"){
            cout << "12" << s.substr(2,6);
        }
        else{
            int time = stoi(s.substr(0,2));
            time+=12;
            cout << time << s.substr(2,6);
        }
    }
    return 0;
}