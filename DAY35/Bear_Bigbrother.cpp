//https://codeforces.com/problemset/problem/791/A
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<iostream>
using namespace std;

int main(){
    int a,b;
    cin >> a >> b;

    int year = 0;
    //loop till limak's wight is less than bob's weight
    while(a<=b){
        a = 3*a; //weight is tripled after every year
        b = 2*b; //Bob's weight is doubled after every year

        year++;
    }
    cout << year;
    return 0;
}