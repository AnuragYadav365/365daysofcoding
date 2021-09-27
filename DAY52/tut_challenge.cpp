//https://www.hackerrank.com/challenges/tutorial-intro/problem?isFullScreen=true
//Anurag Yadav
//https://github.com/AnuragYadav365

#include<bits/stdc++.h>
using namespace std;

int main(){
    int V, n;
    cin >> V; //Element to search
    cin >> n; //number of elements in the array

    int arr[n]; //storing the array
    int ans=0; //storing the answer

    //taking runtime input into the array
    for(int i=0; i<n; i++){
        cin >> arr[i];

        //if the index matches with the elements to search
        //store the result in ans variable
        if(arr[i]==V){
            ans = i;
        }
    }

    //display the output
    cout << ans;
    return 0;
}