//https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

//reversing the day number
int rev(int num){
    int temp=0;
    int rev_num = 0;
    while(num!=0){
        temp = num%10;
        rev_num = rev_num*10+temp;
        num/=10;
    }
    return rev_num;
}

int main(){
    int i, j, k;
    cin >> i >> j >> k;

    // string type;
    // if(k%2 == 0){
    //     type = "even";
    // }
    // else{
    //     type = "odd";
    // }
    //loop thorugh each day from i to j(inclusive)
    int reverse=0;
    int count = 0;
    for(int a=i; a<=j; a++){

        //getting the reverse value of day number
        reverse = rev(a);

        //if day - reverse day leaves no remainder
        //then the value would be integer
        //which is a beautiful day
        if(abs(a-reverse) %k == 0){
            //cout << a << "Is beautiful day\n";
            count++;
        }
    }
    cout << count;
    return 0;
}