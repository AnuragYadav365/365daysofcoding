//https://www.hackerrank.com/challenges/library-fine/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int d1, m1, y1, d2, m2, y2;

    cin >> d1 >> m1 >> y1;  //return date
    cin >> d2 >> m2 >> y2;  //due date

    int fine = 0;
    //if both years are not same and return year greater than due year
    //fine is fixed 10000
    if(y1 != y2 and y1 > y2){
        fine = 10000;
    }

    //if both months are not same and return month is after due month
    //fine is 500*(number of months)
    if(m1 != m2 and m1>m2 and y1==y2){
        fine = 500*(m1-m2);
    }

    //if return date is after due date
    //fine is 15*(number of days)
    if(d1 > d2 and m1==m2 and y1==y2){
        fine = 15*(d1-d2);
    }

    cout << fine;
    return 0;
}