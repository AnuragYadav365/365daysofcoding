//https://www.hackerrank.com/challenges/mars-exploration/problem
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits\stdc++.h>
using namespace std;

int main(){
    string s;
    cin >> s;
    string sos = "SOS";
    int count=0;

    //Running through string with step value of 3
    for(int i=0; i<s.length(); i+=3){
        //taking the substring of 3consecutive letters each time
        string substr = s.substr(i,3);

        //checking for every char in substring
        for(int j=0; j<3; j++){

            //if substr character matches doesn't matches
            //increase the value of count
            if(substr.at(j) != sos.at(j)){
                count++;
            }
        }

    }
    cout << count;
    return 0;
}