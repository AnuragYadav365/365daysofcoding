#include<iostream>
using namespace std;

int main(){
    int n;
    cin >> n;
    int x=0;
    for(int i=0; i<n; i++){
        string s;
        cin >> s;
        // cout << s << endl;

        if(s=="++X"){
            ++x;
        }
        else if(s=="X++"){
            x++;
        }
        else if(s=="--X"){
            --x;
        }
        else if(s=="X--"){
            x--;
        }
    }
    cout << x;
    return 0;
}