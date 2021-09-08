#include<iostream>
using namespace std;

int main(){
    int e_pos = 0;
    int x;
    cin >> x;

    int step_count = 0;
    //run until elephant reaches his friend's house
    while(e_pos != x){
        if(x-e_pos >= 5){
            e_pos+=5;
            step_count++;
        }

        else if(x-e_pos == 4){
            e_pos+=4;
            step_count++;
        }

        else if(x-e_pos == 3){
            e_pos+=3;
            step_count++;
        }
        else if(x-e_pos == 2){
            e_pos+=2;
            step_count++;
        }
        else if(x-e_pos == 1){
            e_pos+=1;
            step_count++;
        }
    }
    cout << step_count;
}