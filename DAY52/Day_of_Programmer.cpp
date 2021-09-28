//https://www.hackerrank.com/challenges/day-of-the-programmer/problem?isFullScreen=true
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int y;
    cin >> y;

    int leap_flag = 0;
    //check if year is leap year or not
    //0 if no, 1 if yes

    //according to julian calender
    //leap year is divisible by 4
    if(y<=1918){
        if(y%4==0){
            leap_flag = 1;
        }
    }

    //according to gregorian calender
    //leap year is divisible by 4 and not divisible by 100
    else{
        if(y%4==0 and y%100!=0){
            leap_flag = 1;
        }

        else if(y%400==0){
            leap_flag = 1;
        }
    }

    //if year == 1918
    if(y==1918){
        cout << "26.09.1918";
    }

    //if leap year
    else if(leap_flag==1){
        //cout << "leap year\n";
        cout << "12.09." << y;
    }

    //if not leap year
    else if(leap_flag==0){
        //cout << "not leap year\n";
        cout << "13.09." << y;
    }
    return 0;
}