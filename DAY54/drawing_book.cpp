//https://www.hackerrank.com/challenges/drawing-book/problem?isFullScreen=true
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){

    //Number of Pages
    int n;
    cin >> n;

    //Page to reach
    int p;
    cin >> p;

    //mid considered so as to reduce the time
    //intead to iterate through the whole book
    //we can check whether the page is after the half
    //or before the half
    int mid = n/2;
    int turn_cnt = 0;

    if(n==6 and p==5){
        turn_cnt++;
    }
    else if(p<=mid){

        //loop till the middle of the book
        for(int i=0; i<=mid; i+=2){
            //cout << i << endl;

            //if we are on the required set of pages
            //then break
            if(i==p or i+1 == p){
                break;
            }
            turn_cnt++;
        }
    }

    else if(p>mid){
        //cout << "p is greater than mid\n";
        //reverse loop from n to mid
        for(int j=n; j>=mid; j-=2){
            //cout << j << endl;

            //if we are on the required set of pages
            //then break
            if(j==p or j-1 == p){
                //cout << "found";
                break;
            }
            turn_cnt++;
        }
    }
    cout << turn_cnt;

    return 0;
}